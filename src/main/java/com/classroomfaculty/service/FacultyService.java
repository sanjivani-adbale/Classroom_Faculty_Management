package com.classroomfaculty.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.classroomfaculty.dao.FacultyDao;
import com.classroomfaculty.entity.Faculty;

@Service
public class FacultyService {

	@Autowired
	FacultyDao dao;

	public List<Faculty> getAllFaculties() {

		return dao.getAllFaculties();
	}

	public void saveFaculty(Faculty faculty) {
		dao.saveFaculty(faculty);
		
	}

	public Faculty getFacultyById(Long id) {
		return dao.getFacultyById(id);
	}
	
	public void updateFaculty(Faculty faculty) {
		dao.updateFaculty(faculty);
	}

	public Faculty deleteFaculty(Long id) {

		return dao.deleteFaculty(id);
	}
	
	
	
}
