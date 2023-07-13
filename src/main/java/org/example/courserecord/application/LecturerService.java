package org.example.courserecord.application;

import org.example.courserecord.model.Course;
import org.example.courserecord.model.Lecturer;
import org.example.courserecord.model.Semester;

import java.util.Optional;

/**
 * @author mucahitkurt
 * @since 30.04.2018
 */
public interface LecturerService {

    Optional<Lecturer> findLecturer(Course course, Semester semester);
}
