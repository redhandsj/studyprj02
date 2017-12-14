package jp.tuyano.spring.domain.model;
/**
 * JPA
 */
import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Version;

import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

/**
 * 部屋エンティティ
 */
@Entity
@Table(name = "room")
@EntityListeners(AuditingEntityListener.class) // 監査用リスナーの登録
public class Room implements Serializable{
	private static final long serialVersionUID = 1L;

	//=======================================================================
	// 項目
	//=======================================================================
	/**
	 * 楽観ロック用のバージョニング
	 */
	@Version
	private Integer version;
	
	/**
	 * ルームナンバー
	 */
	@Id
	@GeneratedValue
	private Integer room_id;
	
	/**
	 * 部屋名
	 */
	private String room_name;

	/**
	 * 広さ
	 */
	private Integer capacity;

	/**
	 * 監査用：作成者
	 */
	@CreatedBy
	private String created_by;

	/**
	 * 監査用：作成日時
	 */
	@CreatedDate
	private String created_date;

	/**
	 * 監査用：最終編集者
	 */
	@LastModifiedBy
	private String last_modified_by;

	/**
	 * 監査用：最終編集日時
	 */
	@LastModifiedDate
	private String last_modified_date;

	
	//=======================================================================
	// 関連
	//=======================================================================
	/**
	 * 備品
	 * <ul>
	 * <li> room(1) -> equipment(N)
	 * <li> List ではなく set を使う場合は、評価時に、equalsなどを正しくオーバーライドする必要があるので注意
	 * <li> 指定ない場合は、「Lazyフェッチ」（プロパティアクセス時に取得）
	 * </ul>
	 */
	@OneToMany(mappedBy = "room", cascade = CascadeType.ALL)
	private List<Equipment> equipments;
	
	//=======================================================================
	// コンストラクタ
	//=======================================================================
	/**
	 * デフォルトコンストラクタ
	 */
	public Room() {
	}

	/**
	 * コンストラクタ
	 * @param id ルームナンバー
	 * @param name 部屋名
	 * @param capacity 広さ
	 */
	public Room(final Integer id, final String name, final Integer capacity) {
		this();
		this.room_id = id;
		this.room_name = name;
		this.setCapacity(capacity);
	}

	//=======================================================================
	// setter / getter
	//=======================================================================
	public Integer getRoom_id() {
		return room_id;
	}

	public void setRoom_id(Integer room_id) {
		this.room_id = room_id;
	}

	public String getRoom_name() {
		return room_name;
	}

	public void setRoom_name(String room_name) {
		this.room_name = room_name;
	}

	public Integer getCapacity() {
		return capacity;
	}

	public void setCapacity(Integer capacity) {
		this.capacity = capacity;
	}

	public String getCreated_by() {
		return created_by;
	}

	public void setCreated_by(String created_by) {
		this.created_by = created_by;
	}

	public String getCreated_date() {
		return created_date;
	}

	public void setCreated_date(String created_date) {
		this.created_date = created_date;
	}

	public String getLast_modified_by() {
		return last_modified_by;
	}

	public void setLast_modified_by(String last_modified_by) {
		this.last_modified_by = last_modified_by;
	}

	public String getLast_modified_date() {
		return last_modified_date;
	}

	public void setLast_modified_date(String last_modified_date) {
		this.last_modified_date = last_modified_date;
	}


}
