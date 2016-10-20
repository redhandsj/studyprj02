package jp.tuyano.spring.entity.room;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import jp.tuyano.spring.entity.equipment.Equipment;

/**
 * 部屋エンティティ
 */
@Entity
@Table(name = "room")
public class Room implements Serializable{
	private static final long serialVersionUID = 1L;

	/**
	 * ルームナンバー
	 */
	@Id
	@GeneratedValue
	@Column(name = "room_id")
	private Integer roomId;
	
	/**
	 * 部屋名
	 */
	@Column(name = "room_name")
	private String roomName;

	/**
	 * 広さ
	 */
	@Column(name = "capacity")
	private Integer capacity;

	/**
	 * 備品
	 * <ul>
	 * <li> room(1) -> equipment(N)
	 * <li> List ではなく set を使う場合は、評価時に、equalsなどを正しくオーバーライドする必要があるので注意
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
		this.roomId = id;
		this.roomName = name;
		this.capacity = capacity;
	}


	//=======================================================================
	// setter / getter
	//=======================================================================
	public Integer getRoomId() {
		return roomId;
	}

	public void setRoomId(Integer roomId) {
		this.roomId = roomId;
	}

	public String getRoomName() {
		return roomName;
	}

	public void setRoomName(String roomName) {
		this.roomName = roomName;
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
