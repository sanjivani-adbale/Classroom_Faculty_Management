package com.classroomfaculty.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.classroomfaculty.dao.DepartmentDao;
import com.classroomfaculty.entity.Department;

@Service
public class DepartmentService {

	@Autowired
	DepartmentDao dao;
	
	public void saveDepartment(Department department) {

		dao.saveDepartment(department);
	}

	public List<Department> getAllDepartments() {

		
		return dao.getAllDepartments();
	}

	public Department getDepartmentById(Long id) {
		return dao.getDepartmentById(id);
	}

	public void updateDepartment(Department department) {
		dao.updateDepartment(department);
	}

	public Department deleteDepartment(Long id) {

		return dao.deleteDepartment(id);
	}

	
	
}
