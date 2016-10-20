package jp.tuyano.spring.entity.myperson;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

/**
 * 拡張リポジトリ　list_08_16 P.408
 */
@Repository
public interface MyPersonDataDaoRepository extends JpaRepository<MyPersonData, Long> {
	public List<MyPersonData> findByName(String name);
	public List<MyPersonData> findByMail(String mail);
	public List<MyPersonData> findByAge(Integer age);
	public List<MyPersonData> findByNameLike(String name);
	public List<MyPersonData> findByMailLike(String mail);
	public List<MyPersonData> findByNameOrMail(String name, String mail);
	public List<MyPersonData> findByNameLikeOrMailLike(String name, String mail);
	public List<MyPersonData> findByAgeGreaterThan(Integer age);
	public List<MyPersonData> findByAgeLessThan(Integer age);
	public List<MyPersonData> findByAgeGreaterThanOrAgeLessThan(Integer age0, Integer age1);

	/**
	 * 拡張リポジトリ　list_08_18 P.416
	 * @return
	 */
	@Query("select name from MyPersonData")
	public List<String> getAllName();

}
