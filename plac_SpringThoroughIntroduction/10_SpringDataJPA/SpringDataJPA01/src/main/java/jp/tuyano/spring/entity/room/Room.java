package jp.tuyano.spring.entity.room;
/**
 * JPA
 */
import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Version;

import jp.tuyano.spring.entity.equipment.Equipment;

/**
 * 部屋エンティティ
 */
@Entity
@Table(name = "room")
public class Room implements Serializable{
	private static final long serialVersionUID = 1L;

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
	 * 備品
	 * <ul>
	 * <li> room(1) -> equipment(N)
	 * <li> List ではなく set を使う場合は、評価時に、equalsなどを正しくオーバーライドする必要があるので注意
	 * <li> 指定ない場合は、「Lazyフェッチ」（プロパティアクセス時に取得）
	 * </ul>
	 */
	@OneToMany(mappedBy = "room", cascade = CascadeType.ALL)
	private List<Equipment> equipments;
	
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
		this.capacity = capacity;
	}


	//=======================================================================
	// setter / getter
	//=======================================================================
	public Integer getRoomId() {
		return room_id;
	}

	public void setRoomId(Integer roomId) {
		this.room_id = roomId;
	}

	public String getRoomName() {
		return room_name;
	}

	public void setRoomName(String roomName) {
		this.room_name = roomName;
	}

	public Integer getCapacity() {
		return capacity;
	}

	public void setCapacity(Integer capacity) {
		this.capacity = capacity;
	}

	public List<Equipment> getEquipments() {
		return equipments;
	}

	public void setEquipments(List<Equipment> equipments) {
		this.equipments = equipments;
	}

}
