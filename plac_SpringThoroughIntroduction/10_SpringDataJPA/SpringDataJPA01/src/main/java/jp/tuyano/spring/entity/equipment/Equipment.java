package jp.tuyano.spring.entity.equipment;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import jp.tuyano.spring.entity.room.Room;

/**
 * 部屋エンティティ
 */
@Entity
@Table(name = "equipment")
public class Equipment implements Serializable{
	private static final long serialVersionUID = 1L;

	/**
	 * 備品番号
	 */
	@Id
	@GeneratedValue
	@Column(name = "equipment_id")
	private Integer equipmentId;

	/**
	 * 備品名
	 */
	@Column(name = "equipment_name")
	private String equipmentName;

	/**
	 * 部屋
	 * <ul>
	 * <li> equipment(N) -> room(1)
	 * </ul>
	 */
	@ManyToOne
	@JoinColumn(name = "room_id")
	private Room room;

	/**
	 * 備品数
	 */
	@Column(name = "equipment_count")
	private Integer equipmentCount;
	
	/**
	 * 備考
	 */
	@Column(name = "equipment_remarks")
	private String equipmentRemarks;
	
	/**
	 * デフォルトコンストラクタ
	 */
	public Equipment() {
	}

	/**
	 * コンストラクタ
	 * @param id 備品番号
	 * @param name 備品名
	 * @param room 置いてある部屋
	 * @param count 備品数
	 * @param remarks 備考
	 */
	public Equipment(final Integer id, final String name, final Room room, final Integer count, final String remarks) {
		this();
		this.equipmentId = id;
		this.equipmentName = name;
		this.room = room;
		this.equipmentCount = count;
		this.equipmentRemarks = remarks;
	}

	//=======================================================================
	// setter / getter
	//=======================================================================

	public Integer getEquipmentId() {
		return equipmentId;
	}

	public void setEquipmentId(Integer equipmentId) {
		this.equipmentId = equipmentId;
	}

	public String getEquipmentName() {
		return equipmentName;
	}

	public void setEquipmentName(String equipmentName) {
		this.equipmentName = equipmentName;
	}

	public Room getRoom() {
		return room;
	}

	public void setRoom(Room room) {
		this.room = room;
	}

	public Integer getEquipmentCount() {
		return equipmentCount;
	}

	public void setEquipmentCount(Integer equipmentCount) {
		this.equipmentCount = equipmentCount;
	}

	public String getEquipmentRemarks() {
		return equipmentRemarks;
	}

	public void setEquipmentRemarks(String equipmentRemarks) {
		this.equipmentRemarks = equipmentRemarks;
	}

}
