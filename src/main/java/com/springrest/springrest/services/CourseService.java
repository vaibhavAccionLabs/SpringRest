package com.springrest.springrest.services;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.springrest.springrest.entities.Courses;

public interface CourseService {

	public List<Courses> getCourses();
	
	public Courses getCourse(long courseId);
	
	public Courses addCourse(Courses course);
	
	public Courses updateCourse(Courses course);
	
	public void deleteCourse(long courseId);
}
