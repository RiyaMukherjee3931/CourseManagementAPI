package com.springrest.springrest.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.springrest.springrest.services.*;

import com.springrest.springrest.entities.Course;

import java.util.*;

@RestController
public class MyController {
    
	@Autowired
	private CourseService CourseService; 
	
	
	@GetMapping("/home")
	public String home() {
		return "this is a homepage";
	}
	
	@GetMapping("/courses")
	public List<Course> getCourses(){
		return this.CourseService.getCourses();
	}
	
	@GetMapping("/courses/{courseId}")
	public Course getCourse(@PathVariable String courseId) {
		return this.CourseService.getCourse(Long.parseLong(courseId));
	}
	
	@PostMapping("/courses")
	public Course addCourse(@RequestBody Course course) {
		return this.CourseService.addCourse(course);
	}
	
	@DeleteMapping("/courses/{courseId}")
	public Course delCourse(@PathVariable String courseId) {
		return this.CourseService.delCourse(Long.parseLong(courseId));
	}
}
