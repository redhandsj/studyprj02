package jp.tuyano.spring.domain.service;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collectors;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Service;

import jp.tuyano.spring.domain.model.Book;
import jp.tuyano.spring.domain.resource.criteria.BookCriteria;

@Service
public class BookService {

	private final Map<String, Book> bookRepository = new ConcurrentHashMap<String, Book>();

	/**
	 * コンストラクタで初期データを作成しておく
	 */
	@PostConstruct
	public void loadDummyData(){
		Book book1 = new Book();
		book1.setBookId("00000000-0000-0000-0000-000000000000");
		book1.setName("書籍名");
		book1.setPublishedDate(LocalDate.of(2010,4,20));
		Book book2 = new Book();
		book2.setBookId("00000000-0000-0000-0000-000000000001");
		book2.setName("２冊目");
		book2.setPublishedDate(LocalDate.of(2010,4,21));
		bookRepository.put(book1.getBookId(),book1);
		bookRepository.put(book2.getBookId(),book2);
	}

	/**
	 * 検索
	 * @param bookId 検索対象ID
	 * @return 検索結果
	 */
	public Book find(String bookId) {
		Book book = bookRepository.get(bookId); // Mapから取得
		return book;
	}
	
	/**
	 * コンテンツ作成
	 * @param book ID割り当て対象のコンテンツ
	 * @return
	 */
	public Book create(Book book) {
		String bookId = UUID.randomUUID().toString();
		book.setBookId(bookId);
		bookRepository.put(bookId, book); // Mapに追加
		return book;
	}
	
	/**
	 * 特定IDの更新
	 * @param book 更新対象
	 * @return 更新結果
	 */
	public Book update(Book book) {
		return bookRepository.put(book.getBookId(), book); // Mapを更新
	}

	/**
	 * 特定IDの削除
	 * @param book 削除対象
	 * @return 削除結果
	 */
	public Book delete(String bookId) {
		return bookRepository.remove(bookId); // Mapから削除
	}
	
	

	/**
	 * 書籍名検索
	 * @param criteria 検索条件
	 * @return 検索結果
	 */
	public List<Book> findAllByCriteria(BookCriteria criteria) {
			return bookRepository.values().stream()
						.filter(book ->
							(criteria.getName() == null
								|| book.getName().contains(criteria.getName())) &&
								(criteria.getPublishedDate() == null
									|| book.getPublishedDate().equals(criteria.getPublishedDate())))
							.sorted((o1, o2) ->
								o1.getPublishedDate().compareTo(o2.getPublishedDate()))
								.collect(Collectors.toList());
	}

	
}
