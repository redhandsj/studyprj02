package jp.tuyano.spring.boot.myapp1;

import org.springframework.data.jpa.repository.JpaRepository;

public interface MyMemoDataRepository extends JpaRepository<MyMemoData, Long>{

}
