package jp.co.stylez.sepl2.team3a.atm.domain.trn;
/**
 * JPA
 */
import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import jp.co.stylez.sepl2.team3a.atm.domain.mst.TradingType;

/**
 * （マスター系）取引履歴エンティティ
 */
@Entity
@Table(name = "t_trading_history")
public class TradingHistory implements Serializable{
	private static final long serialVersionUID = 1L;

	//=======================================================================
	// 項目
	//=======================================================================
	/**
	 * 取引履歴ID
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@NotNull(message="必須項目です。")
	private Long trading_history_id;
	
	/**
	 * 口座ID
	 */
	@NotNull(message="必須項目です。")
	private Long account_id;

	/**
	 * 取引種別ID
	 */
	@NotNull(message="必須項目です。")
	private Long trading_type_id;

	/**
	 * 収支金額
	 */
	@NotNull(message="必須項目です。")
	private Long balance_amount;

	/**
	 * 取引日付
	 */
	@NotNull(message="必須項目です。")
	private Timestamp trading_date;

	//=======================================================================
	// 関連
	//=======================================================================
//	/**
//	 * 取引種別エンティティとの関連
//	 * <ul>
//	 * <li> t_trading_history(N) -> m_trading_type(1)
//	 * </ul>
//	 */
//	@ManyToOne
//	@JoinColumn(name = "trading_type_id")
//	private TradingType m_trading_type;

//	/**
//	 * 口座エンティティとの関連
//	 * <ul>
//	 * <li> t_trading_history(N) -> t_account(1)
//	 * </ul>
//	 */
//	@ManyToOne
//	@JoinColumn(name = "account_id")
//	private Account m_account;

	//=======================================================================
	// コンストラクタ
	//=======================================================================
	/**
	 * デフォルトコンストラクタ
	 */
	public TradingHistory() {
	}

	/**
	 * コンストラクタ
	 * @param user_id 取引種別ID
	 * @param user_name　取引種別名
	 */
	public TradingHistory(final Long trading_history_id, final Long account_id, final Long trading_type_id,
			final Long balance_amount, final Timestamp trading_date) {
		this();
		this.trading_history_id = trading_history_id;
		this.account_id = account_id;
		this.trading_type_id = trading_type_id;
		this.balance_amount = balance_amount;
		this.trading_date = trading_date;
	}

	//=======================================================================
	// setter / getter
	//=======================================================================
	public Long getTrading_history_id() {
		return trading_history_id;
	}

	public void setTrading_history_id(Long trading_history_id) {
		this.trading_history_id = trading_history_id;
	}

	public Long getAccount_id() {
		return account_id;
	}

	public void setAccount_id(Long account_id) {
		this.account_id = account_id;
	}

	public Long getTrading_type_id() {
		return trading_type_id;
	}

	public void setTrading_type_id(Long trading_type_id) {
		this.trading_type_id = trading_type_id;
	}

	public Long getBalance_amount() {
		return balance_amount;
	}

	public void setBalance_amount(Long balance_amount) {
		this.balance_amount = balance_amount;
	}

	public Timestamp getTrading_date() {
		return trading_date;
	}

	public void setTrading_date(Timestamp trading_date) {
		this.trading_date = trading_date;
	}

	
}
