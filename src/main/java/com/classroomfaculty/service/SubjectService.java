package com.classroomfaculty.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.classroomfaculty.dao.SubjectDao;
import com.classroomfaculty.entity.Subject;

@Service
public class SubjectService {

	@Autowired
	SubjectDao dao;

	
	public List<Subject> getAllSubjects() {

		return dao.getAllSubjects();
	}
	
	public Subject getSubjectById(Long id) {

		return dao.getSubjectById(id);
	}
	
	public void saveSubject(Subject subject) {
		dao.saveSubject(subject);
	}

	public void updateSubject(Subject subject) {
		dao.updateSubject(subject);
	}

	public void deleteSubject(Long id) {
		dao.deleteSubject(id);
		
	}	
	
}
