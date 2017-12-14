package jp.tuyano.spring.domain.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import jp.tuyano.spring.domain.model.Room;

/**
 * リポジトリのカスタムインターフェイス
 */
public class RoomRepositoryImpl implements RoomRepositoryCustom {

	@PersistenceContext
	private EntityManager entityManager;
	
	/**
	 * 全件検索
	 * return 検索結果
	 */
	public List<Room> findByCriteria(){
		return null;
	}
}
