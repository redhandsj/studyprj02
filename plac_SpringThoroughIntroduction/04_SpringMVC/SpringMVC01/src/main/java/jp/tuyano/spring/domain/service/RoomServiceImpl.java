package jp.tuyano.spring.domain.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import jp.tuyano.spring.domain.model.Room;
import jp.tuyano.spring.domain.repository.RoomRepository;



/**
 * Spring徹底入門SpringFrameworkによるJavaアプリケーション開発.pdf P.503
 */
@Service
public class RoomServiceImpl implements RoomService {
	//=======================================================================
	// Spring Data JPA
	//=======================================================================
	/**
	 * リポジトリ
	 */
	@Autowired
	RoomRepository roomRepository;

	/**
	 * ページで渡す検索結果
	 * @param roomName 部屋名
	 * @param page 希望するページ番号（0～指定）
	 * @param size １ページ分の件数
	 * @return ページ情報毎渡す
	 */
	@Transactional
	public List<Room> searchRoomByNameAsc(final String roomName, final int page, final int size){
		// 取得結果の順番（部屋名の昇順）
		Sort sort = new Sort(Direction.ASC, "room_name");
		// 取得データのページ番号、１ページの件数、ソートルールを指定
		Pageable pageable = new PageRequest(page,size,sort);
		// ページルールを使って検索しデータを取得する
		Page<Room> rooms = roomRepository.findByRoomName(roomName, pageable);
		// ページ情報毎返す
		return rooms.getContent();
	}
	
	/**
	 * 部屋の備品一覧を検索
	 * @param roomId ルームナンバー
	 * @return 部屋の備品一覧を返す
	 */
	@Transactional(readOnly = true)
	public Room getRoom(final Integer id){
		Room room = roomRepository.findOne(id);
		return room;
	}

	/**
	 * 部屋の全件検索
	 * @return 部屋の一覧を返す
	 */
	@Transactional(readOnly = true)
	public List<Room> getRoomAll(){
		return roomRepository.findAll();
	}

	/**
	 * 部屋挿入
	 * @param roomName 部屋名
	 * @param capacity 広さ
	 * @return 作成エンティティ
	 */
	@SuppressWarnings("unused")
	@Transactional
	public Room createRoom(final String roomName, final Integer capacity) {
		Room room = new Room();
		if(room != null){
			room.setRoom_name(roomName);
			room.setCapacity(capacity);
			return roomRepository.save(room);
		}
		return null;
	}

	/**
	 * 部屋編集
	 * @param id 編集対象部屋ID
	 * @param roomName 変更部屋名
	 * @return 編集エンティティ
	 */
	@Transactional
	public Room updateRoom(final Integer id, final String roomName) {
		Room room = this.getRoom(id);
		if(room != null){
			room.setRoom_name(roomName);
		}
		return room;
	}

	/**
	 * 部屋削除
	 * @param id 削除対象部屋ID
	 */
	@Transactional
	public void deleteRoom(final Integer id){
		roomRepository.delete(id);
	}
	
	
//	//=======================================================================
//	// JPA
//	//=======================================================================
//	/**
//	 * 永続化コンテキストを設定
//	 */
//	@PersistenceContext
//	private EntityManager manager;
//
//	/**
//	 * 部屋の備品一覧を検索
//	 * @param roomId ルームナンバー
//	 * @return 部屋の備品一覧を返す
//	 */
//	@Transactional(readOnly = true)
//	public Room getRoom(final Integer id){
//		Room room = manager.find(Room.class, id);
//		return room;
//	}
//
//	/**
//	 * 部屋挿入
//	 * @param roomName 部屋名
//	 * @param capacity 広さ
//	 * @return 作成エンティティ
//	 */
//	@Transactional
//	public Room createRoom(final String roomName, final Integer capacity) {
//		Room room = new Room();
//		if(room != null){
//			room.setRoomName(roomName);
//			room.setCapacity(capacity);
//			manager.persist(room);
//		}
//		return room;
//	}
//
//	/**
//	 * 部屋編集
//	 * @param id 編集対象部屋ID
//	 * @param roomName 変更部屋名
//	 * @return 編集エンティティ
//	 */
//	@Transactional
//	public Room updateRoom(final Integer id, final String roomName) {
//		Room room = this.getRoom(id);
//		if(room != null){
//			room.setRoomName(roomName);
//			manager.merge(room);
//		}
//		return room;
//	}
//
//	/**
//	 * 部屋削除
//	 * @param id 削除対象部屋ID
//	 */
//	@Transactional
//	public void deleteRoom(final Integer id) {
//		Room room = this.getRoom(id);
//		if(room != null){
//			manager.remove(room);
//		}
//	}
//
//	//=======================================================================
//	// JPQL
//	//=======================================================================
//	/**
//	 * P.504：JPQLの利用例
//	 * 部屋の備品一覧を検索
//	 * @param roomName 部屋名
//	 * @return 部屋一覧を返す
//	 */
//	@Transactional(readOnly = true)
//	public List<Room> getRoomByName(final String roomName){
//		// roomテーブルの全レコードをEntityに読み込ませる
//		String jpql = "SELECT r FROM Room r WHERE r.roomName = :roomName";
//		@SuppressWarnings("unchecked")
//		TypedQuery<Room> query = (TypedQuery<Room>) manager.createNativeQuery(jpql, Room.class);
//		// バインド変数に引数を格納する
//		query.setParameter("roomName", roomName);
//		// クエリ実行
//		return query.getResultList();
//	}
//
//	/**
//	 * P.508：JPQLの利用例 JOIN FETCH を用いた関連Entityのフェッチ読込み
//	 * 大量データの場合の性能劣化の防止の為に用いる
//	 * @param roomName 部屋名
//	 * @return 部屋一覧を返す
//	 */
//	@Transactional(readOnly = true)
//	public List<Room> getRoomByNameFetch(final String roomName){
//		// roomテーブルの全レコードをEntityに読み込ませる
//		String jpql = "SELECT DISTINCT r FROM Room r LEFT JOIN FETCH r.equipments WHERE r.roomName = :roomName";
//		@SuppressWarnings("unchecked")
//		TypedQuery<Room> query = (TypedQuery<Room>) manager.createNativeQuery(jpql, Room.class);
//		// バインド変数に引数を格納する
//		query.setParameter("roomName", roomName);
//		// クエリ実行
//		return query.getResultList();
//	}
//
//	/**
//	 * P.508：更新系JPQLの利用例
//	 * @param capacity 更新対象の広さ
//	 * @return 更新件数を返す
//	 */
//	@Transactional
//	public Integer updateCapacityAll(final Integer capacity){
//		String jpql = "UPDATE Room r SET r.capacity = :capacity";
//		// 更新系のクエリを作成
//		Query query = manager.createQuery(jpql);
//		query.setParameter("capacity", capacity);
//		// クエリ実行
//		return query.executeUpdate();
//	}
//
//	//=======================================================================
//	// 備品との連携
//	//=======================================================================
//	/**
//	 * 部屋の備品一覧を検索
//	 * @param roomId ルームナンバー
//	 * @return 部屋の備品一覧を返す
//	 */
//	@Transactional(readOnly = true)
//	public List<Equipment> getEqipmentsInRoom(final Integer roomId){
//		Room room = manager.find(Room.class, roomId);
//		return room.getEquipments();
//	}
//
//	/**
//	 * 備品のある部屋を検索
//	 * @param equipmentId 備品番号
//	 * @return 備品のある部屋を返す
//	 */
//	@Transactional(readOnly = true)
//	public Room getRoomOfEquipment(final Integer equipmentId){
//		Equipment equipment = manager.find(Equipment.class, equipmentId);
//		return equipment.getRoom();
//	}
//	
//	//=======================================================================
//	// 楽観ロック用メソッド
//	//=======================================================================
//	/**
//	 * 楽観ロックアップデート
//	 * @param id
//	 * @param roomName
//	 * @param capacity
//	 */
//	@Transactional
//	public void updateRoomWithOptimisticLock(final Integer id, final String roomName, final Integer capacity){
//		Room room = manager.find(Room.class, id);
//		// ロックを有効にする（但し、有効にできるのは参照系クエリのみ）
//		manager.lock(room, LockModeType.OPTIMISTIC);
//		// 更新処理
//		this.updateCapacityAll(capacity);
//		// 楽観絵ロック失敗時はトランザクション終了時に「OptimisticLockException」が発生
//	}
//	//=======================================================================
//	// 悲観ロック用メソッド
//	//=======================================================================
//	/**
//	 * 悲観ロックアップデート
//	 * @param id
//	 * @param roomName
//	 * @param capacity
//	 */
//	@Transactional
//	public void updateRoomWithPessimisticLock(final Integer id, final String roomName, final Integer capacity){
//		Room room = manager.find(Room.class, id);
//		try{
//			manager.lock(room, LockModeType.PESSIMISTIC_READ);
//		}catch(PessimisticLockException e){
//			// ロック失敗
//		}catch(LockTimeoutException e){
//			// ロック取得タイムアウト（トランザクションのロールバックはされない）
//		}
//		// 更新処理
//	}	
}
