package com.classroomfaculty.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.classroomfaculty.entity.ClassSchedule;
import com.classroomfaculty.service.ClassScheduleService;

@RestController
@RequestMapping("/api/class-schedule")
public class ClassScheduleController {

	@Autowired
	ClassScheduleService service;
	
	@PostMapping("/insertdetails")
	public ClassSchedule createClassSchedule(@RequestBody ClassSchedule classSchedule ) {
		service.saveClassSchedule(classSchedule);
		return classSchedule;
	}
	
	@GetMapping("fetchData")
	public List<ClassSchedule> getData()
	{
		 return  service.getAllData();
	}
	
	@GetMapping("/{id}")
	public ClassSchedule getClassScheduleById(@PathVariable long id) {
		
		return service.getClassScheduleDataById(id);
	}
	
	@PutMapping("update/{id}")
	public ClassSchedule updateClassSchedule(@PathVariable Long id, @RequestBody ClassSchedule classSche)
	{
		ClassSchedule schedule=service.getClassScheduleDataById(id);
		if(schedule != null) {
			schedule.setClassroomId(classSche.getClassroomId());
			schedule.setDayOfWeek(classSche.getDayOfWeek());
			schedule.setStartTime(classSche.getStartTime());
			schedule.setEndTime(classSche.getEndTime());
			schedule.setSubjectId(classSche.getSubjectId());
			
			service.updateClassSchedule(schedule);
		}
		return schedule;
		
		
	}
	
	@DeleteMapping("delete/{id}")
	public void deleteClassSchedule(@PathVariable long id)
	{
		service.deleteClassSchedule(id);
	}


}
