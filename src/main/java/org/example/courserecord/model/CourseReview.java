package org.example.courserecord.model;

/**
 * @author mucahitkurt
 * @since 12.04.2018
 */
public class CourseReview {

    private CourseRate courseRate;
    private String comments;
    private StudentCourseRecord studentCourseRecord;

    public enum CourseRate {
        ONE, TWO, THREE, FOUR, FIVE
    }
}

