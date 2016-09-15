package jp.tuyano.spring.data1;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

@SuppressWarnings("hiding")
public class MyPersonDataDaoImpl<MyPersonData> implements MyPersonDataDao {
	private EntityManager manager = null;
	
	public MyPersonDataDaoImpl(EntityManager manager) {
		super();
		this.manager = manager;
	}
	
	/**
	 * 検索（Select All）
	 */
	public List<MyPersonData> getAllEntity() {
		Query query = manager.createQuery("from MyPersonData");
		return query.getResultList();
	}

	/**
	 * 検索(select)
	 */
	public List findByField(String field, String find) {
		Query query = manager.createQuery("from MyPersonData where " + field + " = '" + find + "'");
		return query.getResultList();
	}

	/**
	 * エンティティ追加（insert）
	 */
	public void addEntity(Object entity) {
		// トランザクション管理用のインスタンスを取得
		EntityTransaction transaction = manager.getTransaction();
		// トランザクション開始
		transaction.begin();
		// キャッシュに処理が登録される
		manager.persist(entity);
		// キャッシュに残っている処理を実行
		manager.flush();
		// コミットしてトランザクションを終了
		transaction.commit();		
	}

	/**
	 * エンティティ更新(update)
	 */
	public void updateEntity(Object entity) {
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
}
