package many_to_one_uni.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import many_to_one_uni.dto.College;
import many_to_one_uni.dto.Student;

public class CollegeDao {
	public EntityManager getEntityManager() {
		return Persistence.createEntityManagerFactory("vinod").createEntityManager();

	}

	public void saveCollege(College college) {
		EntityManager entityManager = getEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

		entityTransaction.begin();

		entityManager.persist(college);
		entityTransaction.commit();

	}

	public void updateCollege(int id,College college)
	{
		EntityManager entityManager = getEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		College dbcollege =entityManager.find(College.class, id);
		if(dbcollege!=null) {
			college.setId(id);
			
			entityTransaction.begin();
			entityManager.merge(college);
			entityTransaction.commit();
		}else {
			System.err.println("college does not exists");
		}
		

	}
	public void getCollege(int id) {
		
		EntityManager entityManager = getEntityManager();
		College college= entityManager.find(College.class, id);
		System.out.println(college);
		
		
	}

	

}
