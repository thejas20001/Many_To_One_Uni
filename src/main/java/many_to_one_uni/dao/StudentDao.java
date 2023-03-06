package many_to_one_uni.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import many_to_one_uni.dto.College;
import many_to_one_uni.dto.Student;

public class StudentDao {
	public EntityManager getEntityManager() {
		return Persistence.createEntityManagerFactory("vinod").createEntityManager();

	}

	public void saveStudent(Student student, int cid) {
		EntityManager entityManager = getEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		College college = entityManager.find(College.class, cid);
		student.setCollege(college);
		entityTransaction.begin();
		entityManager.persist(student);
		entityTransaction.commit();
	}
	public void updateStudent(Student student,int id) {
		EntityManager entityManager = getEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		Student dbstudent =entityManager.find(Student.class, id);
		if(dbstudent!=null) {
			student.setId(id);
			
			entityTransaction.begin();
			entityManager.merge(student);
			entityTransaction.commit();
		}else {
			System.out.println("Student does not exists");
		}
		
	}
	public void getStudent(int id) {
		
		EntityManager entityManager = getEntityManager();
		Student student = entityManager.find(Student.class, id);
		System.out.println(student);
		
		
	}
	public void deleteStudent(int id)
	{
		EntityManager entityManager = getEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		Student student = entityManager.find(Student.class, id);
		entityTransaction.begin();
		entityManager.remove(student);
		entityTransaction.commit();
	}

}
