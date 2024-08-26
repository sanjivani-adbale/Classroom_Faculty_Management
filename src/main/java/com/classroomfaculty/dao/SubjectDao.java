package com.classroomfaculty.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.classroomfaculty.entity.Subject;

@Repository
public class SubjectDao {

	@Autowired
	SessionFactory factory;

	public List<Subject> getAllSubjects() {
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(Subject.class);
		List<Subject> alllist = criteria.list();
		return alllist;
	}
	
	public Subject getSubjectById(Long id) {
		Session session =factory.openSession();
		Subject subject = session.get(Subject.class, id);
		return subject;
	}

	public void saveSubject(Subject subject) {
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		session.save(subject);
		transaction.commit();
	}
	
	public void updateSubject(Subject subject) {
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		session.update(subject);
		transaction.commit();
	}
	
	public void deleteSubject(Long id) {
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		Subject subject = session.load(Subject.class, id);
		session.update(subject);
		transaction.commit();
	}


	
	
}
