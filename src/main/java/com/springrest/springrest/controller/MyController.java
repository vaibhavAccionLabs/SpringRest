package com.springrest.springrest.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.springrest.springrest.entities.Courses;
import com.springrest.springrest.entities.User;
import com.springrest.springrest.entities.Users;
import com.springrest.springrest.services.CourseService;

@RestController
public class MyController {
	@Autowired
	private RestTemplate restTemplate;
	
	@Autowired
	private CourseService courseService;

	@GetMapping(path = "/user")
	public Users getUser() {
//	  User user = new User("vaibhav.katariya@gmail.com", "male");
//	  return user;
	  HttpHeaders headers =  new HttpHeaders();	
	  headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
	  headers.setBearerAuth("sasd12312adasd");
	  System.out.println("Headers-------");
	  System.out.println(headers);
	  
	  HttpEntity<String> entity = new HttpEntity<>("parameters",headers);
	  
	  ResponseEntity<Users> response = restTemplate.exchange("https://randomuser.me/api/?results=15", HttpMethod.GET, entity, Users.class);
	  System.out.println(response);
	  
	  if (response.getStatusCode() == HttpStatus.OK) {
		    System.out.println("Request Successful.");
		    System.out.println(response.getBody());
		    return response.getBody();
		} else {
		    System.out.println("Request Failed");
		    System.out.println(response.getStatusCode());
		    return response.getBody();
		}
	  
	  //return result;
	  //Users users = restTemplate.getForObject("https://randomuser.me/api/?results=15", Users.class);
	  //return result.getResults();
	}
	
	@GetMapping("/home")
	public String home() {
		return "Welcome to My first Spring Application";
	}
	
	@GetMapping("/courses")
	public List<Courses> getCouses() {
		return this.courseService.getCourses();
	}

	@GetMapping("/courses/{courseId}")
	public Courses getCourse(@PathVariable String courseId) {
		return this.courseService.getCourse(Long.parseLong(courseId));
	}
	
	@PostMapping("/courses")
	public Courses addCourse(@RequestBody Courses course) {
		return this.courseService.addCourse(course);
	}
	
	@PutMapping("/courses")
	public Courses updateCourse( @RequestBody Courses course) {
		return this.courseService.updateCourse(course);
	}
	
	@DeleteMapping("/courses/{courseId}")
	public ResponseEntity<HttpStatus> deleteCourse(@PathVariable String courseId) {
		try {
			this.courseService.deleteCourse(Long.parseLong(courseId));
			return new ResponseEntity<>(HttpStatus.OK);
		}catch(Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	
}
