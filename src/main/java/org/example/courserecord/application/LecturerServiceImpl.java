package org.example.courserecord.application;


import org.example.courserecord.model.Course;
import org.example.courserecord.model.Lecturer;
import org.example.courserecord.model.LecturerRepository;
import org.example.courserecord.model.Semester;

import java.util.Optional;

/**
 * @author mucahitkurt
 * @since 30.04.2018
 */
public class LecturerServiceImpl implements LecturerService {

    private final LecturerRepository lecturerRepository;

    public LecturerServiceImpl(LecturerRepository lecturerRepository) {
        this.lecturerRepository = lecturerRepository;
    }

    @Override
    public Optional<Lecturer> findLecturer(Course course, Semester semester) {
        if (course == null || semester == null) {
            throw new IllegalArgumentException("Can't find lecturer without course and semester");
        }
        return lecturerRepository.findByCourseAndSemester(course, semester);
    }
}
