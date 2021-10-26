package com.springrest.springrest.services;

import com.springrest.springrest.entities.Courses;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.springrest.springrest.entities.Courses;

@Service
public class CourseServiceImpl implements CourseService {

	List<Courses> list;
	
	public CourseServiceImpl() {
		list=new ArrayList<>();
		list.add(new Courses(111, "Test-1", "Hello from test-1."));
		list.add(new Courses(222, "Test-2", "Hello from test-2."));
		list.add(new Courses(333, "Test-3", "Hello from test-3."));
	}
	
	
	@Override
	public List<Courses> getCourses() {
		// TODO Auto-generated method stub
		return list;
	}


	@Override
	public Courses getCourse(long courseId) {
		// TODO Auto-generated method stub
		Courses c=null;
		for(Courses course:list) {
			if(course.getId() == courseId) {
				c=course;
				break;
			}
		}
		
		return c;
	}
	
	@Override
	public Courses addCourse(Courses course) {
		list.add(course);
		return course;
	}


	@Override
	public Courses updateCourse(Courses course) {
		// TODO Auto-generated method stub
		list.forEach(e -> {
			if(e.getId() == course.getId()) {
				e.setTitle(course.getTitle());
				e.setDescription(course.getDescription());
			}
		});
		return course;
	}


	@Override
	public void deleteCourse(long courseId) {
		// TODO Auto-generated method stub
		list=this.list.stream().filter(e-> e.getId() != courseId).collect(Collectors.toList());
	}

	
}
