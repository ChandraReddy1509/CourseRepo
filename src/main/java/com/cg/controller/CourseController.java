package com.cg.controller;

import java.util.List; 

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.Service.CourseService;
import com.cg.entity.Course;
@RestController
@RequestMapping("/Course1")    
public class CourseController {
	
	@Autowired
	     private CourseService cservice;
	
	@PostMapping("/add")
	public String add(@RequestBody Course course) {
	   return cservice.addCourse(course);
	
	}
	   @GetMapping("/get")
	   public List<Course> getAll(){
		   return cservice.getAllCourse();
	   }
	
	
	
	
	

}
