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

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

/**
 * ユーザエンティティ
 */
@Entity
@Table(name = "user")
public class User implements Serializable{
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
	@Getter(AccessLevel.PUBLIC) @Setter(AccessLevel.PUBLIC)
	private Integer user_id;
	
	/**
	 * ユーザ名
	 */
	@Getter(AccessLevel.PUBLIC) @Setter(AccessLevel.PUBLIC)
	private String user_name;

	/**
	 * パスワード
	 */
	@Getter(AccessLevel.PUBLIC) @Setter(AccessLevel.PUBLIC)
	private String password;

	/**
	 * 有効無効
	 */
	@Getter(AccessLevel.PUBLIC) @Setter(AccessLevel.PUBLIC)
	private boolean enabled;

	
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
	public User() {
	}

	/**
	 * コンストラクタ
	 * @param user_id ユーザID
	 * @param user_name ユーザ名
	 * @param password パスワード
	 */
	public User(final Integer user_id, final String user_name, final String password) {
		this();
		this.user_id = user_id;
		this.user_name = user_name;
		this.password = password;
	}

	//=======================================================================
	// setter / getter
	//=======================================================================
	// 自動生成

}
