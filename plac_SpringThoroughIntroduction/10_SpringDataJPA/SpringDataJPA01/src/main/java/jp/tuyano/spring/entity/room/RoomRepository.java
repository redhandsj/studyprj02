package jp.tuyano.spring.entity.room;

import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 * 拡張リポジトリ
 */
@Repository
public interface RoomRepository extends JpaRepository<Room, Integer> {
	
	/**
	 * Roomエンティティ取得
	 * @param roomName 部屋名
	 * @param pageable ページネーション
	 * @return 当てはまるRoomエンティティを返す
	 */
	@Query("SELECT r FROM Room r WHERE r.roomName = :roomName")
	public List<Room> findByRoomName(@Param("roomName") String roomName, Pageable pageable);

	/**
	 * Roomエンティティ取得
	 * @param roomName 検索条件：部屋名
	 * @param capacity 検索条件：広さ
	 * @return 検索結果を返す
	 */
	public List<Room> findByRoomNameAndCapacity(final String roomName, final Integer capacity);

	/**
	 * Roomエンティティ更新
	 * @param capacity 更新する広さ
	 * @return 更新件数を返す
	 */
	@Query("UPDATE Room r SET r.capacity = :capacity")
	public Integer updateCapacityAll(@Param("capacity") Integer capacity);

}
