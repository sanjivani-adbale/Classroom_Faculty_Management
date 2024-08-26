package com.classroomfaculty.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.classroomfaculty.entity.Classroom;

@Repository
public class ClassroomDao {

	@Autowired
	SessionFactory factory;

	public List<Classroom> allClassroomList() {

		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(Classroom.class);
		List<Classroom> alllist = criteria.list();
		return alllist;
	}

	public void insertClassroomDetails(Classroom cls) {
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		session.save(cls);
		transaction.commit();

	}

	public Classroom getClassroomById(long id) {

		Session session = factory.openSession();

		Classroom classroom = session.get(Classroom.class, id);
		return classroom;

	}
	
	public Classroom deleteClassroom(Long id) {
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		Classroom classroom = session.load(Classroom.class, id);
		session.delete(classroom);
		transaction.commit();
		return classroom;
	}
	
	public void updateClassroom(Classroom classroom) {
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		session.update(classroom);
		transaction.commit();
	}
}
