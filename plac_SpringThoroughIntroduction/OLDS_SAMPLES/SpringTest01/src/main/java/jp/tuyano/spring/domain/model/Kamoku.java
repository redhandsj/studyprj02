package jp.tuyano.spring.domain.model;
/**
 * JPA
 */
import java.io.Serializable;

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
 * 科目マスタ
 */
@Entity
//@Table(name = "room")
@EntityListeners(AuditingEntityListener.class) // 監査用リスナーの登録
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Kamoku implements Serializable{
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
	 * 科目ID
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	//@Column(name="room_id")
	private Long kamokuId;
	
	/**
	 * 科目名
	 */
	//@Column(name="room_name")
	private String kamokuName;

	
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
	/**
	 * コンストラクタ
	 * @param name 科目名
	 */
	public Kamoku(final String name) {
		this.kamokuName = name;
	}

	//=======================================================================
	// setter / getter → Lombok
	//=======================================================================

}
