package com.classroomfaculty.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.classroomfaculty.entity.ClassSchedule;
import com.classroomfaculty.entity.FacultyAttendance;

@Repository
public class FacultyAttendanceDao {

	@Autowired
	SessionFactory factory;

	public void saveFacultyAttendance(FacultyAttendance facultyAttendance) {

		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		session.save(facultyAttendance);
		transaction.commit();
		
	}
	
	public List<FacultyAttendance> getAllData() {
		Session session=factory.openSession();
		Criteria criteria=session.createCriteria(FacultyAttendance.class);
		List<FacultyAttendance> attlist=criteria.list();
		return attlist;
		
	}
	
	public FacultyAttendance getFacultyAttendanceById(long id) {
		Session session=factory.openSession();
		
		FacultyAttendance attendance =session.get(FacultyAttendance.class, id);
		return attendance;
	}
	

	public FacultyAttendance updateFacultyAttendance(FacultyAttendance attendance) {

		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		session.update(attendance);
		transaction.commit();
		return attendance;

	}

	public void deleteFacultyAttendance(Long id) {
		Session session=factory.openSession();
		Transaction transaction=session.beginTransaction();
		FacultyAttendance attendance=session.load(FacultyAttendance.class, id);
		
		session.delete(attendance);
		transaction.commit();
	}

}
