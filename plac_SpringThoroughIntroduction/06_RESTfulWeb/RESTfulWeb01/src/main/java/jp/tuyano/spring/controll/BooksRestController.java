package jp.tuyano.spring.controll;


import java.net.URI;
import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import jp.tuyano.spring.domain.model.Book;
import jp.tuyano.spring.domain.resource.BookResource;
import jp.tuyano.spring.domain.resource.criteria.BookCriteria;
import jp.tuyano.spring.domain.resource.query.BookResourceQuery;
import jp.tuyano.spring.domain.service.BookService;

@CrossOrigin
@RestController
@RequestMapping("books")
public class BooksRestController {

	@Autowired
	BookService bookService;
	
	/**
	 * リソースアクセス用
	 * @param bookId アクセス用ID
	 * @return
	 */
	@CrossOrigin(maxAge = 900) 
	@RequestMapping(path = "{bookId}", method = RequestMethod.GET)
	public BookResource getBook(@PathVariable String bookId) {
		Book book = bookService.find(bookId);
//		if (book == null) {
//			// 書籍情報がない場合は例外をスローする
//			throw new BookResourceNotFoundException(bookId);
//		}
		BookResource resource = new BookResource();
		resource.setBookId(book.getBookId());
		resource.setName(book.getName());
		resource.setPublishedDate(book.getPublishedDate());
		return resource;
	}
	
	/**
	 * リソース作成用
	 * @param newResource リクエストボディに指定されているデータ（JSON）
	 * @param uriBuilder
	 * @return
	 */
	@RequestMapping(path = "create", method = RequestMethod.POST)
	public ResponseEntity<Void> createBook(@Validated @RequestBody BookResource newResource, UriComponentsBuilder uriBuilder) {
		Book newBook = new Book();
		newBook.setName(newResource.getName());
		newBook.setPublishedDate(newResource.getPublishedDate());
		// ビジネスロジックを呼び出し、書籍情報を作成する
		Book createdBook = bookService.create(newBook);
		// 作成した書籍情報にアクセスするためのURIを生成する
		//String resourceUri = "http://localhost:8080/RESTfulWeb01/books/" + createdBook.getBookId();
		//return ResponseEntity.created(URI.create(resourceUri)).build();
		// 
		URI resourceUri = uriBuilder
				 .path("/books/{bookId}")
				 .buildAndExpand(createdBook.getBookId())
				 .encode()
				 .toUri();
		
		// TODO 保留
//		URI resourceUri = MvcUriComponentsBuilder.relativeTo(uriBuilder)
//				 .withMethodCall(
//				 (BooksRestController.class)getBook(createdBook.getBookId()))
//				 .build().encode().toUri();		
		return ResponseEntity.created(resourceUri).build();

	}
	
	/**
	 * 特定IDのデータの更新用
	 * @param bookId アクセス用ID
	 * @param resource
	 */
	@RequestMapping(path = "{bookId}", method = RequestMethod.PUT)
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void put(@PathVariable String bookId,
			@Validated @RequestBody BookResource resource) {
		Book book = new Book();
		book.setBookId(bookId);
		book.setName(resource.getName());
		book.setPublishedDate(resource.getPublishedDate());
		bookService.update(book);
	}
	
	/**
	 * 特定IDデータの削除
	 * @param bookId
	 */
	@RequestMapping(path = "{bookId}", method = RequestMethod.DELETE)
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable String bookId) {
		bookService.delete(bookId);
	}
	
	/**
	 * 
	 * 書籍名での検索用
	 * @param query 検索条件
	 * @return 検索結果
	 */
	@RequestMapping(method = RequestMethod.GET)
	public Collection<Book> searchBooks(@Validated BookResourceQuery query) {
		BookCriteria criteria = new BookCriteria();
		criteria.setName(query.getName());
		criteria.setPublishedDate(query.getPublishedDate());
		Collection<Book> books = bookService.findAllByCriteria(criteria);
		return books;
//		return books.stream().map(book -> {
//			BookResource resource = new BookResource();
//			resource.setBookId(book.getBookId());
//			resource.setName(book.getName());
//			resource.setPublishedDate(book.getPublishedDate());
//			return resource;
//		}).collect(Collectors.toList());
	}
	
}
