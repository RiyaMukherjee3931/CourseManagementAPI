package com.springrest.springrest.services;
import java.util.*;

import org.springframework.stereotype.Service;

import com.springrest.springrest.entities.Course;


@Service
public class CourseServiceimpl implements CourseService {
	
	List<Course> list;
	
	public CourseServiceimpl() {
		list = new ArrayList<>();
		list.add(new Course(145,"JavaCourse","This course is for beginner"));
		list.add(new Course(4343, "SpringBootCourse","This course is not for Intermediate"));
	}
    
	@Override
	public List<Course> getCourses() {
		// TODO Auto-generated method stub
		return list;
	}
	@Override
	public Course getCourse(long courseId) {
		Course c = null;
		for(Course it: list) {
			if(it.getId() == courseId) {
				c = it;
				break;
			}
		}
		return c;
	}
	
	@Override
	public Course addCourse(Course course){
		list.add(course);
		return course;
	}
	
    @Override
	public Course delCourse(long courseId){
		Course c = null;
		for(int i=0; i<list.size(); i++) {
			 if(list.get(i).getId() == courseId) {
				 c = list.get(i);
				 list.remove(i);
				 break;
			 }
		}	
		return c;
	}
}
