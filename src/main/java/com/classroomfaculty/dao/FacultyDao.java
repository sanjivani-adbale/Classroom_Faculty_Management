package com.classroomfaculty.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.classroomfaculty.entity.Faculty;

@Repository
public class FacultyDao {

	@Autowired
	SessionFactory factory;

	public List<Faculty> getAllFaculties() {
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(Faculty.class);
		List<Faculty> alllist = criteria.list();
		return alllist;
	}

	public Faculty getFacultyById(Long id) {
		Session session = factory.openSession();
		Faculty faculty = session.get(Faculty.class, id);
		return faculty;

	}

	public void saveFaculty(Faculty faculty) {
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		session.save(faculty);
		transaction.commit();
	}

	public void updateFaculty(Faculty faculty) {
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		session.update(faculty);
		transaction.commit();
	}

	public Faculty deleteFaculty(Long id) {
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		Faculty faculty = session.load(Faculty.class, id);
		session.delete(faculty);
		transaction.commit();
		return faculty;
		
	}

}
