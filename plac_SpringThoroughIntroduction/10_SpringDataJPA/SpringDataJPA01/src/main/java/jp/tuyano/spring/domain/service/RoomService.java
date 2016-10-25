/**
 * JPA
 */
package jp.tuyano.spring.domain.service;

import jp.tuyano.spring.domain.model.Room;

public interface RoomService {
	/**
	 * 部屋取得
	 * @param id ルームナンバー
	 * @return 部屋エンティティ
	 */
	public Room getRoom(final Integer id);

	/**
	 * 部屋挿入
	 * @param roomName 部屋名
	 * @param capacity 広さ
	 * @return 作成エンティティ
	 */
	public Room createRoom(final String roomName, final Integer capacity);

	/**
	 * 部屋編集
	 * @param id 編集対象部屋ID
	 * @param roomName 変更部屋名
	 * @return 編集エンティティ
	 */
	public Room updateRoom(final Integer id, final String roomName);

	/**
	 * 部屋削除
	 * @param id 削除対象部屋ID
	 */
	public void deleteRoom(final Integer id);
}
