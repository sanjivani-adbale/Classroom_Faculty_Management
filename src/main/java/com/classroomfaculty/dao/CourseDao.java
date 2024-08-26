package com.classroomfaculty.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.classroomfaculty.entity.Course;

@Repository
public class CourseDao {

	@Autowired
	SessionFactory factory;
	
	public void saveCourse(Course course) {
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		session.save(course);
		transaction.commit();
	}
	
	public List<Course> getAllCourses() {
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(Course.class);
		List<Course> alllist = criteria.list();
		return alllist;
	}
	
	public Course getCourseById(Long id) {
		Session session = factory.openSession();
		Course course = session.get(Course.class, id);
		return course;
	}
	
	public void updateCourse(Course course) {
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		session.update(course);
		transaction.commit();
	}
	
	public Course deleteCourse(Long id) {
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		Course course = session.get(Course.class, id);
		session.delete(course);
		transaction.commit();
		return course;
	}
}
