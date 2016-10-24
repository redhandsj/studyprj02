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
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import jp.co.stylez.sepl2.team3a.atm.domain.trn.Account;

/**
 * （マスター系）銀行エンティティ
 */
@Entity
@Table(name = "m_bank")
public class Bank implements Serializable{
	private static final long serialVersionUID = 1L;

	//=======================================================================
	// 項目
	//=======================================================================
	/**
	 * 銀行ID
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@NotNull(message="必須項目です。")
	private Long bank_id;
	
	/**
	 * 銀行名
	 */
	@Column(length=255, nullable=true)
	@NotNull(message="必須項目です。")
	private String bank_name;

	//=======================================================================
	// 関連
	//=======================================================================
//	/**
//	 * 口座エンティティとの関連
//	 * <ul>
//	 * <li> m_bank(1) -> t_account(N)
//	 * </ul>
//	 */
//	@OneToMany(mappedBy = "m_bank", cascade = CascadeType.ALL)
//	private List<Account> accounts;
//
//	/**
//	 * 引出手数料エンティティとの関連
//	 * <ul>
//	 * <li> m_bank(1) -> m_pullout_commision(N)
//	 * </ul>
//	 */
//	@OneToMany(mappedBy = "m_bank", cascade = CascadeType.ALL)
//	private List<PulloutCommission> m_pullout_commisions;
//
//	/**
//	 * 振込手数料エンティティとの関連
//	 * <ul>
//	 * <li> m_bank(1) -> m_transfer_commision(N)
//	 * </ul>
//	 */
//	@OneToMany(mappedBy = "m_bank", cascade = CascadeType.ALL)
//	private List<TransferCommission> m_transfer_commisions;


	
	//=======================================================================
	// コンストラクタ
	//=======================================================================
	/**
	 * デフォルトコンストラクタ
	 */
	public Bank() {
	}

	/**
	 * コンストラクタ
	 * @param user_id 銀行ID
	 * @param user_name　銀行名
	 */
	public Bank(final Long bank_id, final String bank_name) {
		this();
		this.bank_id = bank_id;
		this.bank_name = bank_name;
	}
	//=======================================================================
	// setter / getter
	//=======================================================================
	public Long getBank_id() {
		return bank_id;
	}

	public void setBank_id(Long bank_id) {
		this.bank_id = bank_id;
	}

	public String getBank_name() {
		return bank_name;
	}

	public void setBank_name(String bank_name) {
		this.bank_name = bank_name;
	}
	
}
