package com.example.demo.courses;

import java.util.List;

import com.example.demo.Course;

public interface CousrseServices {
    public List<Course> getCourses();

    public Course getCourse(Long courseId);

    public Course addCourse(Course course);

    public Course updateCourse(String CourseId, Course course);

    public String deleteCourse(Long courseId);

}
