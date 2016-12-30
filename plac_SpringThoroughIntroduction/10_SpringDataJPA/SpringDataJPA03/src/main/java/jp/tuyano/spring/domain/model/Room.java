package jp.tuyano.spring.domain.model;
/**
 * JPA
 */
import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 部屋エンティティ
 */
@Entity
//@Table(name = "room")
@EntityListeners(AuditingEntityListener.class) // 監査用リスナーの登録
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Room implements Serializable{
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
	 * ルームナンバー
	 */
	@Id
	@GeneratedValue
	//@Column(name="room_id")
	private Integer roomId;
	
	/**
	 * 部屋名
	 */
	//@Column(name="room_name")
	private String roomName;

	/**
	 * 広さ
	 */
	private Integer capacity;

//	/**
//	 * 監査用：作成者
//	 */
//	@CreatedBy
//	private String created_by;
//
//	/**
//	 * 監査用：作成日時
//	 */
//	@CreatedDate
//	private String created_date;
//
//	/**
//	 * 監査用：最終編集者
//	 */
//	@LastModifiedBy
//	private String last_modified_by;
//
//	/**
//	 * 監査用：最終編集日時
//	 */
//	@LastModifiedDate
//	private String last_modified_date;

	
	//=======================================================================
	// 関連 TODO 
	//=======================================================================
	
	//=======================================================================
	// コンストラクタ
	//=======================================================================
//	/**
//	 * コンストラクタ
//	 * @param id ルームナンバー
//	 * @param name 部屋名
//	 * @param capacity 広さ
//	 */
//	public Room(final Integer id, final String name, final Integer capacity) {
//		this();
//		this.roomId = id;
//		this.roomName = name;
//		this.setCapacity(capacity);
//	}

	//=======================================================================
	// setter / getter → Lombok
	//=======================================================================

}
