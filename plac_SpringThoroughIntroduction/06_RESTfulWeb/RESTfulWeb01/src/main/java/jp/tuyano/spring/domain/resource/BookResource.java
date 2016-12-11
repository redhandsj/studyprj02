package jp.tuyano.spring.domain.resource;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonFormat;

public class BookResource implements Serializable {
	private static final long serialVersionUID = 1L;
	private String bookId;
	private String name;
	
	private List<String> authors;
	private Publisher publisher;

	public static class Publisher implements Serializable {
		 private static final long serialVersionUID = 1L;
		 private String name;
		private String tel;
		 public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getTel() {
			return tel;
		}
		public void setTel(String tel) {
			this.tel = tel;
		}
	};
	
	@JsonFormat(pattern = "yyyy-MM-dd") // ISO 8061の拡張形式(yyyy-MM-dd)の指定を追加
	private LocalDate publishedDate;

	public String getBookId() {
		return bookId;
	}
	public void setBookId(String bookId) {
		this.bookId = bookId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public LocalDate getPublishedDate() {
		return publishedDate;
	}
	public void setPublishedDate(LocalDate publishedDate) {
		this.publishedDate = publishedDate;
	}
	public List<String> getAuthors() {
		return authors;
	}
	public void setAuthors(List<String> authors) {
		this.authors = authors;
	}
	public Publisher getPublisher() {
		return publisher;
	}
	public void setPublisher(Publisher publisher) {
		this.publisher = publisher;
	}




}
