package jp.tuyano.spring.domain.resource.criteria;

import java.io.Serializable;
import java.time.LocalDate;

import org.springframework.format.annotation.DateTimeFormat;

/**
 * 検索条件保存クラス
 */
public class BookCriteria implements Serializable {
	private static final long serialVersionUID = 1L;
	 private String name;
	 @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
	 private LocalDate publishedDate;
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
}
