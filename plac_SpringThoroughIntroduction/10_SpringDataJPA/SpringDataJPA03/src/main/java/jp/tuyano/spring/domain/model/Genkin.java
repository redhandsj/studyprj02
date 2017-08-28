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
import lombok.NoArgsConstructor;

/**
 * 現金出納
 */
@Entity
//@Table(name = "room")
@EntityListeners(AuditingEntityListener.class) // 監査用リスナーの登録
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Genkin implements Serializable{
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
	private Long genkinId;
	
	/**
	 * 取引日付
	 */
	private Date hiduke;

	/**
	 * 科目ID
	 */
	private Long kamokuId;

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
	 * @param hiduke　取引日付
	 * @param kamokuId　科目ID
	 * @param tekiyo　適用
	 * @param nyuukin　入金（借方）
	 * @param syukkin　出金（貸方）
	 * @param zandaka　差引残高
	 */
	public Genkin(final Date hiduke, final Long kamokuId, final String tekiyo,
			final Long nyuukin, final Long syukkin, final Long zandaka) {
		this.hiduke = hiduke;
		this.kamokuId = kamokuId;
		this.tekiyo = tekiyo;
		this.nyuukin = nyuukin;
		this.syukkin = syukkin;
		this.zandaka = zandaka;
	}

	//=======================================================================
	// setter / getter → Lombok
	//=======================================================================

}
