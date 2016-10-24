package jp.co.stylez.sepl2.team3a.atm.domain.mst;
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

/**
 * （マスター系）引出手数料エンティティ
 */
@Entity
@Table(name = "m_pullout_commision")
public class PulloutCommission implements Serializable{
	private static final long serialVersionUID = 1L;

	//=======================================================================
	// 項目
	//=======================================================================
	/**
	 * 引出手数料ID
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@NotNull(message="必須項目です。")
	private Long pullout_commission_id;

	/**
	 * 銀行ID
	 */
	@NotNull(message="必須項目です。")
	private Long bank_id;
	
	/**
	 * 範囲下限
	 * <ul>
	 * <li>手数料を適用させる金額範囲の下限
	 * </ul>
	 */
	@NotNull(message="必須項目です。")
	private Long lower_limit;

	/**
	 * 範囲上限
	 * <ul>
	 * <li>手数料を適用させる金額範囲の上限
	 * </ul>
	 */
	@NotNull(message="必須項目です。")
	private Long upper_limit;

	/**
	 * 手数料
	 */
	@NotNull(message="必須項目です。")
	private Long commision;

	//=======================================================================
	// 関連
	//=======================================================================
//	/**
//	 * 銀行エンティティとの関連
//	 * <ul>
//	 * <li> m_pullout_commision(N) -> m_bank(1)
//	 * </ul>
//	 */
//	@ManyToOne
//	@JoinColumn(name = "bank_id")
//	private Bank m_bank;

	//=======================================================================
	// コンストラクタ
	//=======================================================================
	/**
	 * デフォルトコンストラクタ
	 */
	public PulloutCommission() {
	}

	/**
	 * コンストラクタ
	 * @param pullout_commission_id 引出手数料ID
	 * @param bank_id 銀行ID
	 * @param lower_limit 範囲下限
	 * @param upper_limit 範囲上限
	 * @param commision 手数料
	 */
	public PulloutCommission(final Long pullout_commission_id, final Long bank_id, final Long lower_limit,
			final Long upper_limit, final Long commision) {
		this();
		this.pullout_commission_id = pullout_commission_id;
		this.bank_id = bank_id;
		this.lower_limit = lower_limit;
		this.upper_limit = upper_limit;
		this.commision = commision;
	}

	//=======================================================================
	// setter / getter
	//=======================================================================
	public Long getPullout_commission_id() {
		return pullout_commission_id;
	}

	public void setPullout_commission_id(Long pullout_commission_id) {
		this.pullout_commission_id = pullout_commission_id;
	}

	public Long getBank_id() {
		return bank_id;
	}

	public void setBank_id(Long bank_id) {
		this.bank_id = bank_id;
	}

	public Long getLower_limit() {
		return lower_limit;
	}

	public void setLower_limit(Long lower_limit) {
		this.lower_limit = lower_limit;
	}

	public Long getUpper_limit() {
		return upper_limit;
	}

	public void setUpper_limit(Long upper_limit) {
		this.upper_limit = upper_limit;
	}

	public Long getCommision() {
		return commision;
	}

	public void setCommision(Long commision) {
		this.commision = commision;
	}
	
}
