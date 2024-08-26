package com.classroomfaculty.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.classroomfaculty.dao.ClassScheduleDao;
import com.classroomfaculty.entity.ClassSchedule;

@Service
public class ClassScheduleService {

	@Autowired
	ClassScheduleDao dao;

	public void saveClassSchedule(ClassSchedule classSchedule) {
		dao.saveClassSchedule(classSchedule);
	}

	public List<ClassSchedule> getAllData() {
		 return dao.getAllData();
		}

	public void updateClassSchedule(ClassSchedule schedule) {
		dao.updateClassSchedule(schedule);
		
	}



	public ClassSchedule getClassScheduleDataById(long id) {
		
		return dao.getClassScheduleDataById(id);
	}



	public void deleteClassSchedule(long id) {
		dao.deleteClassSchedule(id);
		
	}

}
