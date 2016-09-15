package jp.tuyano.spring.boot.myapp1;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class MyMemoData implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	private Long id;

	@Column(nullable = false)
	private String title;

	@Column(nullable = false)
	private String content;

	/**
	 * コンストラクタ
	 */
	public MyMemoData(){
		super();
	}

	/**
	 * コンストラクタ
	 * @param title　タイトル
	 * @param content コンテンツ
	 */
	public MyMemoData(final String title, final String content){
		super();
		this.title = title;
		this.content = content;
	}

	public Long getId() {
		return id;
	}

//	public void setId(Long id) {
//		this.id = id;
//	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	@Override
	public String toString(){
		return "MyMemoData[id=" + this.id + ", title=" + this.title + ", content=" + this.content + "]";
	}

}
