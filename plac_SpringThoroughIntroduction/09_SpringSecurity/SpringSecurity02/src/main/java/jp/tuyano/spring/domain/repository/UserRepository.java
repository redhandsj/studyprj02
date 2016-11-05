package jp.tuyano.spring.domain.repository;

import java.util.List;

import javax.persistence.LockModeType;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Lock;
import org.springframework.stereotype.Repository;

import jp.tuyano.spring.domain.model.User;

/**
 * 拡張リポジトリ
 */
@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

	/**
	 * 全件検索
	 * return 検索結果
	 */
	@Lock(LockModeType.PESSIMISTIC_WRITE)
	List<User> findAll();

	@Lock(LockModeType.PESSIMISTIC_WRITE)
	User findOne(final String username);

}
