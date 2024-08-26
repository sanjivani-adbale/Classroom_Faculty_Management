package com.classroomfaculty.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.classroomfaculty.dao.ClassroomDao;
import com.classroomfaculty.entity.Classroom;

@Service
public class ClassroomService {
	
	@Autowired
	ClassroomDao dao;

	public List<Classroom> getAllClassrooms() {
		List<Classroom> alllist = dao.allClassroomList();
		
		return alllist;
	}

	public Classroom getClassroomById(long id) {
		
		
		return dao.getClassroomById(id);
	}
	
	
	public void insertClassroomDetails(Classroom cls) {
		dao.insertClassroomDetails(cls);
	}

	public void saveClassroom(Classroom classroom) {
		dao.updateClassroom(classroom);
	}

	
	public Classroom deleteClassroom(Long id) {

		return dao.deleteClassroom(id);
				
	}

	

}
