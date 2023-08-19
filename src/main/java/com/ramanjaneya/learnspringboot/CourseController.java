package com.ramanjaneya.learnspringboot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {
	
	@RequestMapping("/courses")
	public Course retrieveAllCourses()
	{
		return new Course(1,"Learn Springboot","Raman");
	}

}
