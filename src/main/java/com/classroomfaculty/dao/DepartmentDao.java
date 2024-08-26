package com.classroomfaculty.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.classroomfaculty.entity.Department;

@Repository
public class DepartmentDao {

	@Autowired
	SessionFactory factory;
	
	public void saveDepartment(Department department) {
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		session.save(department);
		transaction.commit();
	}
	
	public List<Department> getAllDepartments() {
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(Department.class);
		List<Department> alllist = criteria.list();
		return alllist;
	}
	
	
	public Department getDepartmentById(Long id) {
		Session session = factory.openSession();
		Department department = session.get(Department.class, id);
		return department;
		
	}
	
	public void updateDepartment(Department department) {
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		session.update(department);
		transaction.commit();
	}
	
	public Department deleteDepartment(Long id) {
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		Department department = session.load(Department.class, id);
		session.delete(department);
		transaction.commit();
		
		return department;
	}



}
