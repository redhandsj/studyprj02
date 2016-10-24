package jp.co.stylez.sepl2.team3a.atm.service.trn;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import jp.co.stylez.sepl2.team3a.atm.domain.trn.Account;

/**
 * 拡張リポジトリ
 */
@Repository
public interface AccountRepository extends JpaRepository<Account, Long> {
	public List<Account> findAll();
}
