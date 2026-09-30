package com.example.Course.Registration.System.controller;

import com.example.Course.Registration.System.model.Course;
import com.example.Course.Registration.System.model.CourseRegistry;
import com.example.Course.Registration.System.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@CrossOrigin("http://localhost:5500")
public class CourseController {
    @Autowired
    CourseService service;

    @GetMapping("course")
    public List<Course> availableCourse(){
        return service.availableCourse();
    }

    @PostMapping("add")
    public String addStudent(@RequestBody Course course){
        service.addStudent(course);
        return "Add Successfully";
    }

    @GetMapping("courses/entrolled")
    public List<CourseRegistry> entrolledStudent(){
        return service.entrolledStudent();
    }

    @PostMapping("courses/register")
    public String registerCourse(@RequestParam("name") String name,
                                 @RequestParam("emailid") String emailid,
                                 @RequestParam("courseName") String courseName){
        service.registerCourse(name,emailid,courseName);
        return "Congratulation "+name+" Successfully registred for "+courseName;
    }


}
