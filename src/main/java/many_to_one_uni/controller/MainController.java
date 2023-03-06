package many_to_one_uni.controller;

import many_to_one_uni.dao.CollegeDao;
import many_to_one_uni.dao.StudentDao;
import many_to_one_uni.dto.College;
import many_to_one_uni.dto.Student;

public class MainController {
	public static void main(String[] args) {
//		College college = new College();
//
//		college.setName("MITT");
//		college.setAddress("mysore");
//
//		CollegeDao dao = new CollegeDao();
//		dao.getCollege(1);
////		dao.saveCollege(college);
//		dao.updateCollege(1, college);
		
		
//		Student student= new Student();
//		student.setName("tejas");
//		student.setPhone(454564);
//		
//		Student student1= new Student();
//		student1.setName("anand");
//		student1.setPhone(535476);
//		
//		Student student2= new Student();
//		student2.setName("VARUN");
//		student2.setPhone(56584);
//		
		StudentDao dao=new StudentDao();
////		dao.saveStudent(student, 1);
////		dao.saveStudent(student1, 2);
////		dao.saveStudent(student2, 3);
//		dao.updateStudent(student, 1);
//		dao.updateStudent(student1, 2);
//		dao.updateStudent(student2, 3);
//		dao.getStudent(1);
//		dao.getStudent(2);
//		dao.getStudent(3);
		dao.deleteStudent(3);
		
		

	}
	

}
