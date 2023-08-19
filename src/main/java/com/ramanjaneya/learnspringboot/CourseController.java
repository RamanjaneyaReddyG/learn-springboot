package com.ramanjaneya.learnspringboot;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {
	
	@RequestMapping("/courses")
	public List<Course> retrieveAllCourses()
	{
		return Arrays.asList(new Course(1,"Learn Springboot","Raman"),
				new Course(2,"Learn Microservices","Raman"),
				new Course(3,"Learn DevOps","Raman"),
				new Course(4,"Learn AWS","Raman")
				);
	}

}
