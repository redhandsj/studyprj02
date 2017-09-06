package jp.tuyano.spring.domain.model;
/**
 * JPA
 */
import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * 預金出納
 */
@Entity
//@Table(name = "room")
@EntityListeners(AuditingEntityListener.class) // 監査用リスナーの登録
@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Yokin implements Serializable{
	private static final long serialVersionUID = 1L;

	//=======================================================================
	// 項目
	//=======================================================================
//	/**
//	 * 楽観ロック用のバージョニング
//	 */
//	@Version
//	private Integer version;
	
	/**
	 * 預金ID
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long yokinId;
	
	/**
	 * 金融コード
	 */
	private String kinyuCd;

	/**
	 * 取引日付
	 */
	private Date hiduke;

	/**
	 * 科目コード
	 */
	private String kamokuCd;

	/**
	 * 適用
	 */
	private String tekiyo;

	/**
	 *　入金（借方）
	 */
	private Long nyuukin;

	/**
	 *　出金（貸方）
	 */
	private Long syukkin;

	/**
	 *　差引残高
	 */
	private Long zandaka;


	
	//=======================================================================
	// 関連 TODO 
	//=======================================================================
	
	//=======================================================================
	// コンストラクタ
	//=======================================================================
	/**
	 * コンストラクタ
	 * @param kinyuCd　銀行コード
	 * @param hiduke　取引日付
	 * @param kamokuCd　科目ID
	 * @param tekiyo　適用
	 * @param nyuukin　入金（借方）
	 * @param syukkin　出金（貸方）
	 * @param zandaka　差引残高
	 */
	public Yokin(final String kinyuCd, 
			final Date hiduke, final String kamokuCd, final String tekiyo,
			final Long nyuukin, final Long syukkin, final Long zandaka) {
		this.kinyuCd = kinyuCd;
		this.hiduke = hiduke;
		this.kamokuCd = kamokuCd;
		this.tekiyo = tekiyo;
		this.nyuukin = nyuukin;
		this.syukkin = syukkin;
		this.zandaka = zandaka;
	}

	//=======================================================================
	// setter / getter → Lombok
	//=======================================================================

}
