package jp.co.stylez.sepl2.team3a.atm.domain.trn;
/**
 * JPA
 */
import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;


import jp.co.stylez.sepl2.team3a.atm.domain.mst.User;

/**
 * （トランザクション系）口座エンティティ
 */
@Entity
@Table(name = "t_account")
public class Account implements Serializable{
	private static final long serialVersionUID = 1L;

	//=======================================================================
	// 項目
	//=======================================================================
	/**
	 * 口座ID
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@NotNull(message="必須項目です。")
	private Long account_id;
	
	/**
	 * ユーザID
	 */
	@NotNull(message="必須項目です。")
	private Long user_id;

	/**
	 * 銀行ID
	 */
	@NotNull(message="必須項目です。")
	private Long bank_id;

	/**
	 * 残高
	 */
	@NotNull(message="必須項目です。")
	private Long balance;

	//=======================================================================
	// 関連
	//=======================================================================
	/**
	 * ユーザエンティティとの関連
	 * <ul>
	 * <li> t_account(N) -> m_user(1)
	 * </ul>
	 */
	@ManyToOne
	@JoinColumn(name = "user_id")
	private User m_user;
//
//	/**
//	 * 銀行エンティティとの関連
//	 * <ul>
//	 * <li> t_account(N) -> m_bank(1)
//	 * </ul>
//	 */
//	@ManyToOne
//	@JoinColumn(name = "bank_id")
//	private Bank m_bank;

//	/**
//	 * 取引履歴エンティティとの関連
//	 * <ul>
//	 * <li> m_trading_type(1) -> t_trading_history(N)
//	 * </ul>
//	 */
//	@OneToMany(mappedBy = "t_account", cascade = CascadeType.ALL)
//	private List<TradingHistory> t_trading_historys;

	//=======================================================================
	// コンストラクタ
	//=======================================================================
	/**
	 * デフォルトコンストラクタ
	 */
	public Account() {
	}

	/**
	 * コンストラクタ
	 * @param account_id 口座ID
	 * @param user_id ユーザID
	 * @param bank_id 銀行ID
	 * @param balance 残高
	 */
	public Account(final Long account_id, final Long user_id, final Long bank_id, final Long balance) {
		this();
		this.account_id = account_id;
		this.user_id = user_id;
		this.bank_id = bank_id;
		this.balance = balance;
	}

	//=======================================================================
	// setter / getter
	//=======================================================================
	public Long getAccount_id() {
		return account_id;
	}

	public void setAccount_id(Long account_id) {
		this.account_id = account_id;
	}

	public Long getUser_id() {
		return user_id;
	}

	public void setUser_id(Long user_id) {
		this.user_id = user_id;
	}

	public Long getBank_id() {
		return bank_id;
	}

	public void setBank_id(Long bank_id) {
		this.bank_id = bank_id;
	}

	public Long getBalance() {
		return balance;
	}

	public void setBalance(Long balance) {
		this.balance = balance;
	}
	
}
