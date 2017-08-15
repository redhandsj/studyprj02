package jp.tuyano.spring.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import jp.tuyano.spring.domain.model.Kamoku;

/**
 * 拡張リポジトリ
 */
@Repository
public interface KamokuRepository extends JpaRepository<Kamoku, Long> {

}
