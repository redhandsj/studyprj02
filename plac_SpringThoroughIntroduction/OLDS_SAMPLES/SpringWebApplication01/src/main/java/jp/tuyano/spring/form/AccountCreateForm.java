package jp.tuyano.spring.form;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

public class AccountCreateForm implements Serializable { 
	private static final long serialVersionUID = 1L;

	@NotNull
	@Size(min = 1, max = 50)
	private String name;
	
	@NotNull
	@Size(min = 9, max = 11)
	private String tel;
	
	@NotNull
	@DateTimeFormat(pattern = "yyyy/MM/dd")
	private Date dateOfBirth;
	
	@NotNull
	@Size(min = 9, max = 256)
	private String email;

	private AccountForm account;
	private CardForm card; 

	private List<CardForm> cardList; 

	public List<CardForm> getCardList() {
		return cardList;
	}


	public void setCardList(List<CardForm> cardList) {
		this.cardList = cardList;
	}


	/**
	 * 初期化コンストラクタ
	 * @param name
	 * @param tel
	 * @param dateOfBirth
	 * @param email
	 */
	public AccountCreateForm(final String name, final String tel, final Date dateOfBirth, final String email){
		super();
		this.name = name;
		this.tel = tel;
		this.dateOfBirth = dateOfBirth;
		this.email = email;
		this.account = new AccountForm("aaaaaaaaaaaaaaaaa","sssssssssssssss");
		this.card = new CardForm("99999999999999",new Date());
		this.cardList = new ArrayList<CardForm>();
		cardList.add(new CardForm("10000000000",new Date()));
		cardList.add(new CardForm("20000000000",new Date()));

	}
	
	
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

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	public AccountForm getAccount() {
		return account;
	}
	public void setAccount(AccountForm account) {
		this.account = account;
	}
	public CardForm getCard() {
		return card;
	}
	public void setCard(CardForm card) {
		this.card = card;
	}

}
