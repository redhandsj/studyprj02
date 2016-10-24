package jp.co.stylez.sepl2.team3a.atm.service.mst;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import jp.co.stylez.sepl2.team3a.atm.domain.mst.Bank;

/**
 * 拡張リポジトリ
 */
@Repository
public interface BankRepository extends JpaRepository<Bank, Long> {
	public List<Bank> findAll();

}
