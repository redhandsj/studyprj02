package jp.tuyano.spring.domain.model;
/**
 * JPA
 */
import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Version;

/**
 * ユーザエンティティ
 */
@Entity
@Table(name = "user")
public class Users implements Serializable{
	private static final long serialVersionUID = 1L;

	//=======================================================================
	// 項目
	//=======================================================================
	/**
	 * 楽観ロック用のバージョニング
	 */
	@Version
	private Integer version;
	
	/**
	 * ユーザID
	 */
	@Id
	@GeneratedValue
	private Integer user_id;
	
	/**
	 * ユーザ名
	 */
	private String user_name;

	/**
	 * パスワード
	 */
	private String password;

//	/**
//	 * 有効無効
//	 */
//	private boolean enabled;

	
	//=======================================================================
	// 関連
	//=======================================================================
	// なし
	
	//=======================================================================
	// コンストラクタ
	//=======================================================================
	/**
	 * デフォルトコンストラクタ
	 */
	public Users() {
	}

	/**
	 * コンストラクタ
	 * @param user_id ユーザID
	 * @param user_name ユーザ名
	 * @param password パスワード
	 */
	public Users(final Integer user_id, final String user_name, final String password) {
		this();
		this.user_id = user_id;
		this.user_name = user_name;
		this.password = password;
	}

	//=======================================================================
	// setter / getter
	//=======================================================================
	public Integer getUser_id() {
		return user_id;
	}

	public void setUser_id(Integer user_id) {
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
