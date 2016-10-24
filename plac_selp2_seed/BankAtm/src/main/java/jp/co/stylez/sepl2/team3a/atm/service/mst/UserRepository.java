package jp.co.stylez.sepl2.team3a.atm.service.mst;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import jp.co.stylez.sepl2.team3a.atm.domain.mst.User;

/**
 * 拡張リポジトリ
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long> {
	public List<User> findAll();
}
