package jp.tuyano.spring.entity.room;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.transaction.annotation.Transactional;

import jp.tuyano.spring.entity.equipment.Equipment;

/**
 * Spring徹底入門SpringFrameworkによるJavaアプリケーション開発.pdf P.503
 * RoomクラスのDao
 */
public class RoomDaoImpl {
	/**
	 * 永続化コンテキストを設定
	 */
	@PersistenceContext
	private EntityManager manager;
	
	/**
	 * 部屋の備品一覧を検索
	 * @param roomId ルームナンバー
	 * @return 部屋の備品一覧を返す
	 */
	@Transactional(readOnly = true)
	public List<Equipment> getEqipmentsInRoom(Integer roomId){
		Room room = manager.find(Room.class, roomId);
		return room.getEquipments();
	}

	/**
	 * 備品のある部屋を検索
	 * @param equipmentId 備品番号
	 * @return 備品のある部屋を返す
	 */
	@Transactional(readOnly = true)
	public Room getRoomOfEquipment(Integer equipmentId){
		Equipment equipment = manager.find(Equipment.class, equipmentId);
		return equipment.getRoom();
	}

}
