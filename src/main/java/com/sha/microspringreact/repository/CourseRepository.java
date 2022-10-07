package com.sha.microspringreact.repository;

import com.sha.microspringreact.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, Long> {


}
