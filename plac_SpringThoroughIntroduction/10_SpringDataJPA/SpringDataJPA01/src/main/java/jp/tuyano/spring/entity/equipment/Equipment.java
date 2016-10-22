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
	private Integer equipment_id;

	/**
	 * 備品名
	 */
	private String equipment_name;

	/**
	 * 部屋
	 * <ul>
	 * <li> equipment(N) -> room(1)
	 * <li> 指定ない場合は、「Eagerフェッチ」（最初のAPI実行時に取得）
	 * </ul>
	 */
	@ManyToOne
	@JoinColumn(name = "room_id")
	private Room room;

	/**
	 * 備品数
	 */
	private Integer equipment_count;
	
	/**
	 * 備考
	 */
	private String equipment_remarks;
	
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
		this.equipment_id = id;
		this.equipment_name = name;
		this.room = room;
		this.equipment_count = count;
		this.equipment_remarks = remarks;
	}

	//=======================================================================
	// setter / getter
	//=======================================================================

	public Integer getEquipmentId() {
		return equipment_id;
	}

	public void setEquipmentId(Integer equipmentId) {
		this.equipment_id = equipmentId;
	}

	public String getEquipmentName() {
		return equipment_name;
	}

	public void setEquipmentName(String equipmentName) {
		this.equipment_name = equipmentName;
	}

	public Room getRoom() {
		return room;
	}

	public void setRoom(Room room) {
		this.room = room;
	}

	public Integer getEquipmentCount() {
		return equipment_count;
	}

	public void setEquipmentCount(Integer equipmentCount) {
		this.equipment_count = equipmentCount;
	}

	public String getEquipmentRemarks() {
		return equipment_remarks;
	}

	public void setEquipmentRemarks(String equipmentRemarks) {
		this.equipment_remarks = equipmentRemarks;
	}

}
