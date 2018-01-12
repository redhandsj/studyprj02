package org.rhpj.form;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.rhpj.validation.AlphaNumeric;
import org.rhpj.validation.EqualsPropertyValues;
import org.springframework.format.annotation.DateTimeFormat;

//↓ 相関チェックはクラスレベルに制約アノテーションを指定する 
@EqualsPropertyValues(property = "password", comparingProperty = "reEnteredPassword")
public class WelcomeForm  implements Serializable {
	private static final long serialVersionUID = 1L;

	@Valid  // ネストしたJavaBeansもチェック対象となる
	private AccountForm account;

	private CardForm card;
	
	private List<CardForm> cardList;
	 
	@NotNull
	//@Password
	private String password;
	 
	private String reEnteredPassword;
	
	@NotNull
	@Size(min = 1, max = 50)
	private String name;

	@NotNull
	@Size(min = 9, max = 11)
	@Pattern(regexp = "[a-zA-Z0-9]*")  // 英数字であること 
	private String tel;
	
	@NotNull
	@DateTimeFormat(pattern = "yyyy/MM/dd") 
	private Date dateOfBirth;

	@NotNull
	@Size(min = 9, max = 256)
	@AlphaNumeric
	private String email;

	// radioh
	private String type;

	// チェックボックス
	private String agreement;
	
	
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getReEnteredPassword() {
		return reEnteredPassword;
	}

	public void setReEnteredPassword(String reEnteredPassword) {
		this.reEnteredPassword = reEnteredPassword;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
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

	public List<CardForm> getCardList() {
		return cardList;
	}

	public void setCardList(List<CardForm> cardList) {
		this.cardList = cardList;
	}

	public CardForm getCard() {
		return card;
	}

	public void setCard(CardForm card) {
		this.card = card;
	}

	public String getAgreement() {
		return agreement;
	}

	public void setAgreement(String agreement) {
		this.agreement = agreement;
	}

}
