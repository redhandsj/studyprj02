package jp.tuyano.spring.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import jp.tuyano.spring.domain.model.Yokin;

/**
 * 拡張リポジトリ
 */
@Repository
public interface YokinRepository extends JpaRepository<Yokin, Long> {

}
