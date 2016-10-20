package jp.tuyano.spring.entity.myperson;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Email;
/**
 * 個人データ
 * <ul>
 * <li> 
 * </ul>
 */
@Entity
@Table(name="mypersondata")
@NamedQueries({
    @NamedQuery(name = "MyPersonData.getAllEntity", query = "SELECT p FROM MyPersonData p"),
    @NamedQuery(name = "MyPersonData.findByName", query = "SELECT p FROM MyPersonData p WHERE p.name = :value")
})
public class MyPersonData {
	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.AUTO)
	@NotNull(message="必須項目です。")
	private long id;
	
	@Column(length=50, nullable=false)
	@NotNull(message="必須項目です。")
	private String name;
	
	@Column(length=100, nullable=true)
	@Email(message="メールアドレスが必要です")
	private String mail;
	
	@Column(nullable=true)
	@NotNull(message="必須項目です。")
	@Min(value=0,message="{value}以上でなければいけません。")
	@Max(value=150,message="{value}以下でなければいけません。")
	private int age;

	public MyPersonData() {
	}
	
	public MyPersonData(String name, String mail, int age) {
		this();
		this.name = name;
		this.mail = mail;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public long getId() {
		return id;
	}

	@Override
	public String toString() {
		return "MyPersonData [id=" + id + ", name=" + name + ", mail=" + mail
				+ ", age=" + age + "]";
	}

}
