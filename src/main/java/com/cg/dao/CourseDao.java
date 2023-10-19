package com.cg.dao;

import java.util.List;

import com.cg.entity.Course;

public interface CourseDao {
	public String addCourse(Course course);
	public List <Course> getAllCourse();
	
}

