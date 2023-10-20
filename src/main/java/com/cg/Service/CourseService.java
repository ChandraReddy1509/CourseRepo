package com.cg.Service;

import java.util.ArrayList; 
import java.util.List; 

import org.springframework.stereotype.Service;

import com.cg.dao.CourseDao;
import com.cg.entity.Course;
@Service
public class CourseService implements CourseDao{
	   
	List<Course> CourseList=new ArrayList<>();
	
	@Override
	public String addCourse(Course course) {
		CourseList.add(course);
		return "added";
	}

	@Override
	public List<Course> getAllCourse() {
		return CourseList;
		
	}
	
	
	
	

}
