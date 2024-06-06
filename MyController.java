package com.springrest.springrest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.springrest.springrest.entity.Course;
import com.springrest.springrest.services.CourseService;

import java.io.Serializable;

@RestController 
public class MyController {
	
	@Autowired
	public CourseService cs;
	
	@GetMapping("/")
	public String home() {
		return "welcome to Courses Application";
	}

	@GetMapping("/course")
	public Serializable getCourses(){
		return this.cs.getClass();
	}	
	
	@GetMapping("/course/{courseId}")
	public Course getCourse(@PathVariable String courseId) {
		return this.cs.getCourse(Long.parseLong(courseId));
	}
	
	@PostMapping("/course")
	public Course addCourse(@RequestBody long c) {
		return this.cs.getCourse(c);
	}

	@DeleteMapping("/course/{courseId}")
	public String deleteCourse(@PathVariable String courseId) {
		this.cs.getCourse(Long.parseLong(courseId));
		return "Course with id " + courseId + " has been deleted.";
	}
}
