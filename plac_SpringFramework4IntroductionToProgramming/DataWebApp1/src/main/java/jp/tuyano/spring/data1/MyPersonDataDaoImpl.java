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
 * SpringFramework4_プログラミング入門.pdf P.383 
 * List 8-4 ～
 * <ul>
 * <li> Webアプリケーションの各種サーブレットから呼び出す
 * </ul>
 */
@SuppressWarnings("rawtypes")
@Service
public class MyPersonDataDaoImpl extends AbstractMyPersonDataDao {
	@SuppressWarnings("unused")
	@Autowired
	private ApplicationContext context;

	@Autowired
	private LocalContainerEntityManagerFactoryBean factory;

	/**
	 * 永続化コンテキストを設定
	 */
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
		return this.list_08_20_getAllEntity();
	}

	/**
	 * 検索(select)
	 */
	public List findByField(String field, String find) {
		return this.list_08_04_findByField(field,find);
	}

	/**
	 * 検索
	 * @param value 検索ワード（名前）
	 * @return 検索結果エンティティ
	 */
	public List<MyPersonData> findByName(String value) {
		return this.list_08_22_findByName(value);
	}
	/**
	 * エンティティ追加（insert）
	 * @param entity 追加エントリー
	 */
	public void addEntity(Object entity) {
		this.list_08_04_addEntity(entity);
	}

	/**
	 * エンティティ更新(update)
	 * @param entity 更新エントリー
	 */
	public void updateEntity(Object entity) {
		this.list_08_04_updateEntity(entity);
	}

	/**
	 * エンティティ削除（delete）
	 * @param entity 削除エントリー
	 */
	public void removeEntity(Object data) {
		this.list_08_04_removeEntity(data);
	}

	/**
	 * エンティティ削除（delete）
	 * @param id 更新エントリーキー
	 */
	public void removeEntity(Long id) {
		this.list_08_04_removeEntity(id);
	}
	
	//=======================================================================
	// getAllEntity()
	//=======================================================================
	/**
	 * SpringFramework4_プログラミング入門 : P.383
	 * @return Select * From myPersonData;
	 */
	@SuppressWarnings({ "unused", "unchecked" })
	private List<MyPersonData> list_08_04_getAllEntity(){
		Query query = manager.createNamedQuery("from MyPersonData");
		return query.getResultList();	
	}
	/**
	 * SpringFramework4_プログラミング入門 : P.389
	 * @return Select * From myPersonData;
	 */
	@SuppressWarnings({ "unused", "unchecked" })
	private List<MyPersonData> list_08_10_getAllEntity(){
		Query query = manager.createNamedQuery("MyPersonData.getAllEntity");
		return query.getResultList();	
	}
	/**
	 * SpringFramework4_プログラミング入門 : P.419
	 * @return Select * From myPersonData;
	 */
	@SuppressWarnings("unused")
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

	//=======================================================================
	// findByField()
	//=======================================================================
	/**
	 * SpringFramework4_プログラミング入門 : P.383
	 * @return query.getResultList()
	 */
	private List list_08_04_findByField(String field, String find) {
		Query query = manager.createQuery("from MyPersonData where " + field + " = '" + find + "'");
		return query.getResultList();
	}
	//=======================================================================
	// addEntity()
	//=======================================================================
	/**
	 * SpringFramework4_プログラミング入門 : P.38４
	 * エンティティ追加（insert）
	 * @param value 検索ワード（名前）
	 */
	private void list_08_04_addEntity(Object entity) {
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
	//=======================================================================
	// updateEntity()
	//=======================================================================
	/**
	 * SpringFramework4_プログラミング入門 : P.38４
	 * エンティティ更新(update)
	 * @param entity 更新エントリー
	 */
	public void list_08_04_updateEntity(Object entity) {
		EntityManager manager = factory.getNativeEntityManagerFactory().createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		manager.merge(entity);
		manager.flush();
		transaction.commit();
	}

	//=======================================================================
	// removeEntity()
	//=======================================================================
	/**
	 * SpringFramework4_プログラミング入門 : P.38４
	 * エンティティ削除（delete）
	 * @param entity 削除エントリー
	 */
	public void list_08_04_removeEntity(Object data) {
		EntityManager manager = factory.getNativeEntityManagerFactory().createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		manager.remove(data);
		manager.flush();
		transaction.commit();		
	}
	/**
	 * SpringFramework4_プログラミング入門 : P.38４
	 * エンティティ削除（delete）
	 * @param id 更新エントリーキー
	 */
	public void list_08_04_removeEntity(Long id) {
		jp.tuyano.spring.data1.MyPersonData entity = manager.find(jp.tuyano.spring.data1.MyPersonData.class, 1L);
		this.removeEntity(entity);
	}
	
	
	//=======================================================================
	// findByName()
	//=======================================================================
	/**
	 * SpringFramework4_プログラミング入門 : P.389
	 * @param value 検索条件
	 * @return Select * From myPersonData;
	 */
	@SuppressWarnings("unchecked")
	private List<MyPersonData> list_08_10_findByName(final String value){
		Query query = manager.createNamedQuery("MyPersonData.findByName").setParameter("value", value);
		return query.getResultList();		
	}	
	
	/**
	 * SpringFramework4_プログラミング入門 : P.419
	 * @param value 検索条件
	 * @return Select * From myPersonData;
	 */
	@SuppressWarnings({ "unused", "unchecked" })
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
