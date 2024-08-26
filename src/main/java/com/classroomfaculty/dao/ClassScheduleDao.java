package com.classroomfaculty.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.classroomfaculty.entity.ClassSchedule;

@Repository
public class ClassScheduleDao {

	@Autowired
	SessionFactory factory;
	
	public void saveClassSchedule(ClassSchedule classSchedule) {
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		session.save(classSchedule);
		transaction.commit();
	}
	
	public List<ClassSchedule> getAllData() {
		Session session=factory.openSession();
		Criteria criteria=session.createCriteria(ClassSchedule.class);
		List<ClassSchedule> classlist=criteria.list();
		return classlist;
		
	}
	
    public void updateClassSchedule(ClassSchedule schedule) {
		
		Session session=factory.openSession();
		Transaction transaction =session.beginTransaction();
		session.update(schedule);
		transaction.commit();
		
	}

	public ClassSchedule getClassScheduleDataById(long id) {
		Session session=factory.openSession();
		
		ClassSchedule schedule=session.get(ClassSchedule.class, id);
		return schedule;
	}

	public void deleteClassSchedule(long id) {
		Session session=factory.openSession();
		Transaction transaction=session.beginTransaction();
		ClassSchedule schedule=session.load(ClassSchedule.class, id);
		
		session.delete(schedule);
		transaction.commit();
	}


}
