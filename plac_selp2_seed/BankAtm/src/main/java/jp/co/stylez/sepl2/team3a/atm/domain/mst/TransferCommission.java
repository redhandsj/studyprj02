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
 * （マスター系）振込手数料エンティティ
 */
@Entity
@Table(name = "m_transfer_commision")
public class TransferCommission implements Serializable{
	private static final long serialVersionUID = 1L;

	//=======================================================================
	// 項目
	//=======================================================================
	/**
	 * 振込手数料ID
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@NotNull(message="必須項目です。")
	private Long transfer_commision_id;

	/**
	 * 振込元銀行ID
	 */
	@NotNull(message="必須項目です。")
	private Long original_bank_id;
	
	/**
	 * 振込先銀行ID
	 */
	@NotNull(message="必須項目です。")
	private Long payees_bank_id;

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
//	 * <li> m_transfer_commision(N) -> m_bank(1)
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
	public TransferCommission() {
	}

	/**
	 * コンストラクタ
	 * @param transfer_commision_id 振込手数料ID
	 * @param original_bank_id 振込元銀行ID
	 * @param payees_bank_id 振込先銀行ID
	 * @param commision 手数料
	 */
	public TransferCommission(final Long transfer_commision_id, final Long original_bank_id, final Long payees_bank_id,
			final Long commision) {
		this();
		this.transfer_commision_id = transfer_commision_id;
		this.original_bank_id = original_bank_id;
		this.payees_bank_id = payees_bank_id;
		this.commision = commision;
	}

	//=======================================================================
	// setter / getter
	//=======================================================================
	public Long getTransfer_commision_id() {
		return transfer_commision_id;
	}

	public void setTransfer_commision_id(Long transfer_commision_id) {
		this.transfer_commision_id = transfer_commision_id;
	}

	public Long getOriginal_bank_id() {
		return original_bank_id;
	}

	public void setOriginal_bank_id(Long original_bank_id) {
		this.original_bank_id = original_bank_id;
	}

	public Long getPayees_bank_id() {
		return payees_bank_id;
	}

	public void setPayees_bank_id(Long payees_bank_id) {
		this.payees_bank_id = payees_bank_id;
	}

	public Long getCommision() {
		return commision;
	}

	public void setCommision(Long commision) {
		this.commision = commision;
	}

	
}
