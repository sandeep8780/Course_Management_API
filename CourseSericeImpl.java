package com.springrest.springrest.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;


import com.springrest.springrest.entity.Course;

@Service
public class CourseSericeImpl implements CourseService {
	
List<Course> list;


public CourseSericeImpl() {
	list=new ArrayList<Course>();
	
	list.add(new Course(145,"java core course","this course contains basic java"));
	list.add(new Course(151,"Spring_BOOT","this Course Contain REST API"));
	
}



	@Override
	public List<Course> getCourses() {
		// TODO Auto-generated method stub
		return list;
	}
	
	
	public Course getcourse(long courseId) {
		Course c=null;
		for(Course c1 : list) {
			if(c1.getId()==courseId) {
				c1=getCourse(0);
				break;
			}
		}
		return c;
		
	}



	@Override
	public Course getCourse(long courseId) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public Course addCourse(Course course) {
		// TODO Auto-generated method stub
		list.add(course);
		return course;
	

}



	@Override
	public void deleteCourse(Course d) {
		//list.remove(Course);
		list.add(getCourse(0));
		return;
	}
		// TODO Auto-generated method stub
		
	}
