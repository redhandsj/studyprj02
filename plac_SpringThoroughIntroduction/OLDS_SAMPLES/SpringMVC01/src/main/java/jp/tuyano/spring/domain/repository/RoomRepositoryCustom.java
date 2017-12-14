package jp.tuyano.spring.domain.repository;

import java.util.List;

import javax.persistence.LockModeType;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Lock;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import jp.tuyano.spring.domain.model.Room;

/**
 * リポジトリのカスタムインターフェイス
 */
public interface RoomRepositoryCustom {

	/**
	 * 全件検索
	 * return 検索結果
	 */
	List<Room> findByCriteria();
}
