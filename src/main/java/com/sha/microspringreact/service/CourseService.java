package com.sha.microspringreact.service;

import com.sha.microspringreact.model.Course;

import java.util.List;

public interface CourseService {

    Course saveCourse(Course course);

    void deleteCourse(Long id);

    List<Course> findAllCourses();

}
