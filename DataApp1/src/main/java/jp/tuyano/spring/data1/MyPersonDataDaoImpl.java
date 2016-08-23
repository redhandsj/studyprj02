package jp.tuyano.spring.data1;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

@SuppressWarnings("hiding")
public class MyPersonDataDaoImpl<MyPersonData> implements MyPersonDataDao {
	private EntityManager manager = null;
	
	public MyPersonDataDaoImpl(EntityManager manager) {
		super();
		this.manager = manager;
	}
	
	public List<MyPersonData> getAllEntity() {
		Query query = manager.createQuery("from MyPersonData");
		return query.getResultList();
	}

	public List findByField(String field, String find) {
		Query query = manager.createQuery("from MyPersonData where " + field + " = '" + find + "'");
		return query.getResultList();
	}

	public void addEntity(Object entity) {
		// TODO Auto-generated method stub
		
	}

	public void updateEntity(Object entity) {
		// TODO Auto-generated method stub
		
	}

	public void removeEntity(Object data) {
		// TODO Auto-generated method stub
		
	}

	public void removeEntity(Long id) {
		// TODO Auto-generated method stub
		
	}
}
