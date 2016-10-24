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

import jp.co.stylez.sepl2.team3a.atm.domain.trn.TradingHistory;

/**
 * （トランザクション系）取引履歴エンティティ
 */
@Entity
@Table(name = "m_trading_type")
public class TradingType implements Serializable{
	private static final long serialVersionUID = 1L;

	//=======================================================================
	// 項目
	//=======================================================================
	/**
	 * 取引種別ID
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@NotNull(message="必須項目です。")
	private Long trading_type_id;
	
	/**
	 * 取引種別名
	 */
	@Column(length=255, nullable=true)
	@NotNull(message="必須項目です。")
	private String trading_type_name;

	//=======================================================================
	// 関連
	//=======================================================================
//	/**
//	 * 取引履歴エンティティとの関連
//	 * <ul>
//	 * <li> m_trading_type(1) -> t_trading_history(N)
//	 * </ul>
//	 */
//	@OneToMany(mappedBy = "m_trading_type", cascade = CascadeType.ALL)
//	private List<TradingHistory> t_trading_historys;

	//=======================================================================
	// コンストラクタ
	//=======================================================================
	/**
	 * デフォルトコンストラクタ
	 */
	public TradingType() {
	}

	/**
	 * コンストラクタ
	 * @param user_id 取引種別ID
	 * @param user_name　取引種別名
	 */
	public TradingType(final Long trading_type_id, final String trading_type_name) {
		this();
		this.trading_type_id = trading_type_id;
		this.trading_type_name = trading_type_name;
	}

	//=======================================================================
	// setter / getter
	//=======================================================================
	public Long getTrading_type_id() {
		return trading_type_id;
	}

	public void setTrading_type_id(Long trading_type_id) {
		this.trading_type_id = trading_type_id;
	}

	public String getTrading_type_name() {
		return trading_type_name;
	}

	public void setTrading_type_name(String trading_type_name) {
		this.trading_type_name = trading_type_name;
	}
	
}
