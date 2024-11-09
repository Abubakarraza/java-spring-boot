package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.courses.CousrseServices;

@RestController
public class MyController {
    @Autowired
    private CousrseServices courseServices;

    @GetMapping("/")
    public String get() {
        return "Spring Boot is working!";
    }

    @GetMapping("/courses")
    public List<Course> getCourses() {
        return this.courseServices.getCourses();
    }

    @GetMapping("/courses/{courseId}")
    public Course getCourse(@PathVariable String courseId) {
        long Id = Long.parseLong(courseId);
        return this.courseServices.getCourse(Id);
    }

    @PostMapping("/courses")
    public Course addCourse(@RequestBody Course course) {
        return this.courseServices.addCourse(course);
    }

    @PutMapping("/courses/{courseId}")
    public Course updateCourse(@PathVariable String courseId, @RequestBody Course course) {
        return this.courseServices.updateCourse(courseId, course);
    }

    @DeleteMapping("/courses/{courseId}")
    public String deleteCourse(@PathVariable String courseId) {
        long Id = Long.parseLong(courseId);
        return this.courseServices.deleteCourse(Id);
    }

}
