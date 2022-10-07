package com.sha.microspringreact.service;

import com.sha.microspringreact.model.Course;
import com.sha.microspringreact.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class CourseServiceImpl implements CourseService {

    @Autowired
    private CourseRepository courseRepository;

    @Override
    public Course saveCourse(Course course){

        course.setCreatetime(LocalDateTime.now());

        return courseRepository.save(course);
    }

    @Override
    public void deleteCourse(Long id){

        courseRepository.deleteById(id);
    }

    @Override
    public List<Course> findAllCourses(){
        return courseRepository.findAll();
    }

}
