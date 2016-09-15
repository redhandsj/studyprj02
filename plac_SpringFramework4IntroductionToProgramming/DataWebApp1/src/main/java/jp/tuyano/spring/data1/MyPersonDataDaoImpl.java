package jp.tuyano.spring.data1;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.stereotype.Service;

/**
 * 
 */
@SuppressWarnings("rawtypes")
@Service
public class MyPersonDataDaoImpl extends AbstractMyPersonDataDao {
	@SuppressWarnings("unused")
	@Autowired
	private ApplicationContext context;

	@Autowired
	private LocalContainerEntityManagerFactoryBean factory;

	@PersistenceContext
	private EntityManager manager;
	
	/**
	 * コンストラクタ
	 */
	public MyPersonDataDaoImpl() {
		init();
	}
	
	/**
	 * 検索（Select All）
	 */
	public List<MyPersonData> getAllEntity() {
		//return this.list_08_10_getAllEntity();
		return this.list_08_20_getAllEntity();
	}

	/**
	 * 検索(select)
	 */
	@SuppressWarnings("rawtypes")
	public List findByField(String field, String find) {
		Query query = manager.createQuery("from MyPersonData where " + field + " = '" + find + "'");
		return query.getResultList();
	}

	/**
	 * 検索
	 * @param value 検索ワード（名前）
	 * @return 検索結果エンティティ
	 */
	@SuppressWarnings("unchecked")
	public List<MyPersonData> findByName(String value) {
		return this.list_08_10_findByName(value);
	}
		/**
	 * エンティティ追加（insert）
	 */
	public void addEntity(Object entity) {
		// エンティティ作成クラス
		EntityManager manager = factory.getNativeEntityManagerFactory().createEntityManager();
		// トランザクション管理用のインスタンスを取得
		EntityTransaction transaction = manager.getTransaction();
		// トランザクション開始
		transaction.begin();
		// キャッシュに処理が登録される
		manager.persist(entity);
		System.out.println("add:" + entity);
		// キャッシュに残っている処理を実行
		manager.flush();
		// コミットしてトランザクションを終了
		transaction.commit();
	}

	/**
	 * エンティティ更新(update)
	 */
	public void updateEntity(Object entity) {
		EntityManager manager = factory.getNativeEntityManagerFactory().createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		manager.merge(entity);
		manager.flush();
		transaction.commit();
	}

	/**
	 * エンティティ削除（delete）
	 */
	public void removeEntity(Object data) {
		EntityManager manager = factory.getNativeEntityManagerFactory().createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		manager.remove(data);
		manager.flush();
		transaction.commit();		
	}

	/**
	 * エンティティ削除（delete）
	 */
	public void removeEntity(Long id) {
		jp.tuyano.spring.data1.MyPersonData entity = manager.find(jp.tuyano.spring.data1.MyPersonData.class, 1L);
		this.removeEntity(entity);
	}
	
	//=======================================================================
	// リスト別コード
	//=======================================================================
	/**
	 * SpringFramework4_プログラミング入門 : P.389
	 * @return Select * From myPersonData;
	 */
	private List<MyPersonData> list_08_10_getAllEntity(){
		Query query = manager.createNamedQuery("MyPersonData.getAllEntity");
		return query.getResultList();	
	}
	/**
	 * SpringFramework4_プログラミング入門 : P.389
	 * @param value 検索条件
	 * @return Select * From myPersonData;
	 */
	private List<MyPersonData> list_08_10_findByName(final String value){
		Query query = manager.createNamedQuery("MyPersonData.findByName").setParameter("value", value);
		return query.getResultList();		
	}	
	
	/**
	 * SpringFramework4_プログラミング入門 : P.409
	 * @return Select * From myPersonData;
	 */
	private List<MyPersonData> list_08_20_getAllEntity(){
		// クエリ―作成の為のビルダーを取得する
		CriteriaBuilder builder = manager.getCriteriaBuilder();
		// JPQL　のクエリー実行の為の　Query クラス
		CriteriaQuery<MyPersonData> query = builder.createQuery(MyPersonData.class);
		// JPQL の FROM節 を取得。以下で「FROM myPersonData」と同等の意味
		Root<MyPersonData> root = query.from(MyPersonData.class);
		// JPQL の FROM節 をセット。以下で「Select *」と同等の意味。
		query.select(root);
		// Select 結果を取得する
		List<MyPersonData> list = (List<MyPersonData>)manager.createQuery(query).getResultList();
		return list;		
	}
	/**
	 * SpringFramework4_プログラミング入門 : P.411
	 * @param value 検索条件
	 * @return Select * From myPersonData;
	 */
	private List<MyPersonData> list_08_22_findByName(final String value){
		// クエリ―作成の為のビルダーを取得する
		CriteriaBuilder builder = manager.getCriteriaBuilder();
		// JPQL　のクエリー実行の為の　Query クラス
		CriteriaQuery<MyPersonData> query = builder.createQuery(MyPersonData.class);
		// JPQL の FROM節 を取得。以下で「FROM myPersonData」と同等の意味
		Root<MyPersonData> root = query.from(MyPersonData.class);
		// JPQL の WHERE節をセット。「name = value」
		query.select(root).where(builder.like(root.get("name").as(String.class), value));
		// Select 結果を取得する
		Query jpql = manager.createQuery(query);
		List<MyPersonData> list = (List<MyPersonData>)jpql.getResultList();
		return list;		
	}	
}
