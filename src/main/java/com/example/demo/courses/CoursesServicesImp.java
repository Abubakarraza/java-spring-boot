package com.example.demo.courses;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.Course;

@Service
public class CoursesServicesImp implements CousrseServices {
    List<Course> list;

    public CoursesServicesImp() {
        list = new ArrayList<>();
        list.add(new Course(1, "Learn Full stack with Spring Boot and Angular", "Hello"));
        list.add(new Course(2, "Learn Full stack with Spring Boot and React", "hll"));
        list.add(new Course(3, "Master Microservices with Spring Boot and Spring Cloud", "hllo"));
    }

    @Override
    public List<Course> getCourses() {
        return list;
    }

    @Override
    public Course getCourse(Long CourseId) {
        Course c = null;
        for (Course course : list) {
            if (course.getId() == CourseId) {
                c = course;
                break;
            }
        }
        return c;
    }

    @Override
    public Course addCourse(Course course) {
        list.add(course);
        return course;
    }

    @Override
    public Course updateCourse(String CourseId, Course Course) {
        Course c = null;
        for (Course crs : list) {
            if (crs.getId() == Long.parseLong(CourseId)) {
                int index = list.indexOf(crs);
                list.set(index, Course);
                c = Course;
                break;
            }
        }
        return c;
    }

    @Override
    public String deleteCourse(Long CourseId) {
        for (Course course : list) {
            if (course.getId() == CourseId) {
                list.remove(course);
                break;
            }
        }
        return "Deleted Course with id " + CourseId;
    }
}
