package jp.tuyano.spring.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import jp.tuyano.spring.domain.model.Room;

/**
 * 拡張リポジトリ
 */
@Repository
public interface RoomRepository extends JpaRepository<Room, Integer> {

//	/**
//	 * 全件検索
//	 * return 検索結果
//	 */
//	@Lock(LockModeType.PESSIMISTIC_WRITE)
//	List<Room> findAll();
//
//	/**
//	 * Roomエンティティ取得
//	 * @param roomName 部屋名
//	 * @param pageable ページネーション
//	 * @return 当てはまるRoomエンティティを返す（ページ単位）
//	 */
//	@Query("SELECT r FROM Room r WHERE r.room_name = :roomName")
//	public Page<Room> findByRoomName(@Param("roomName") String roomName, Pageable pageable);
//
////	/**
////	 * Roomエンティティ取得
////	 * @param roomName 検索条件：部屋名
////	 * @param capacity 検索条件：広さ
////	 * @return 検索結果を返す
////	 */
////	List<Room> findByRoomNameAndCapacity(final String roomName, final Integer capacity);
//
//	/**
//	 * Roomエンティティ更新
//	 * @param capacity 更新する広さ
//	 * @return 更新件数を返す
//	 */
//	@Query("UPDATE Room r SET r.capacity = :capacity")
//	public Integer updateCapacityAll(@Param("capacity") Integer capacity);

}
