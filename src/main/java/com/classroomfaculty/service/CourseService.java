package com.classroomfaculty.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.classroomfaculty.dao.CourseDao;
import com.classroomfaculty.entity.Course;

@Service
public class CourseService {
	
	@Autowired
	CourseDao dao;

	public void saveCourse(Course course) {

		dao.saveCourse(course);
	}

	public List<Course> getAllCourses() {
		
		return dao.getAllCourses();
	}

	public Course getCourseById(Long id) {

		return dao.getCourseById(id);
	}
	
	public void updateCourse(Course course) {
		dao.updateCourse(course);
	}

	public Course deleteCourse(Long id) {

		return dao.deleteCourse(id);
	}

}
