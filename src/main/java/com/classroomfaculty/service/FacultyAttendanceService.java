package com.classroomfaculty.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.classroomfaculty.dao.FacultyAttendanceDao;
import com.classroomfaculty.entity.ClassSchedule;
import com.classroomfaculty.entity.FacultyAttendance;

@Service
public class FacultyAttendanceService {

	@Autowired
	FacultyAttendanceDao dao;

	public List<FacultyAttendance> getAllFacultyAttendances() {

		return null;
	}

	public void saveFacultyAttendance(FacultyAttendance facultyAttendance) {
	     dao.saveFacultyAttendance(facultyAttendance);
		
	}
	
	public List<FacultyAttendance> getAllData(){
		return dao.getAllData();
	}

	public FacultyAttendance getFacultyAttendanceById(Long id) {

		return dao.getFacultyAttendanceById(id);
	}
	
	public FacultyAttendance updateFacultyAttendance(FacultyAttendance attendance) {
		return dao.updateFacultyAttendance(attendance);
		
		
	}

	public void deleteFacultyAttendance(Long id) {
			dao.deleteFacultyAttendance(id);
			
	}
		
	
	
	
}
