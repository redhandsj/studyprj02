package jp.co.stylez.sepl2.team3a.atm.domain.mst;
/**
 * JPA
 */
import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;


import jp.co.stylez.sepl2.team3a.atm.domain.trn.Account;

/**
 * （マスター系）ユーザエンティティ
 */
@Entity
@Table(name = "m_user")
public class User implements Serializable{
	private static final long serialVersionUID = 1L;

	//=======================================================================
	// 項目
	//=======================================================================
	/**
	 * ユーザID
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@NotNull(message="必須項目です。")
	private Long user_id;
	
	/**
	 * ユーザ名
	 */
	@Column(length=255, nullable=true)
	@NotNull(message="必須項目です。")
	private String user_name;

	/**
	 * パスワード
	 */
	@Column(length=255, nullable=true)
	@NotNull(message="必須項目です。")
	private String password;

	//=======================================================================
	// 関連
	//=======================================================================
	/**
	 * 口座エンティティとの関連
	 * <ul>
	 * <li> m_user(1) -> t_account(N)
	 * </ul>
	 */
	@OneToMany(mappedBy = "m_user", cascade = CascadeType.ALL)
	private List<Account> accounts;

	//=======================================================================
	// コンストラクタ
	//=======================================================================
	/**
	 * デフォルトコンストラクタ
	 */
	public User() {
	}

	/**
	 * コンストラクタ
	 * @param user_id ユーザID
	 * @param user_name　ユーザ名
	 * @param password パスワード
	 */
	public User(final Long user_id, final String user_name, final String password) {
		this();
		this.user_id = user_id;
		this.user_name = user_name;
		this.password = password;
	}

	//=======================================================================
	// setter / getter
	//=======================================================================
	public Long getUser_id() {
		return user_id;
	}

	public void setUser_id(Long user_id) {
		this.user_id = user_id;
	}

	public String getUser_name() {
		return user_name;
	}

	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
