package org.example.courserecord.application;

import org.example.courserecord.model.Course;
import org.example.courserecord.model.Department;

import java.util.Optional;

/**
 * @author mucahitkurt
 * @since 30.04.2018
 */
public interface CourseService {

    Optional<Course> findCourse(Course course);

    Optional<Course> findCourse(Department department, String code, String name);
}
