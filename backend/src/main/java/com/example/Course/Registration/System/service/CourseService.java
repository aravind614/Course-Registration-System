package com.example.Course.Registration.System.service;

import com.example.Course.Registration.System.model.Course;
import com.example.Course.Registration.System.model.CourseRegistry;
import com.example.Course.Registration.System.repository.CorseRegistryRepo;
import com.example.Course.Registration.System.repository.CourseRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CourseService {
    @Autowired
    CourseRepo repo;
    public List<Course> availableCourse() {
        return repo.findAll();
    }

    public void addStudent(Course course) {
        repo.save(course);
    }
    @Autowired
    CorseRegistryRepo courserepo;
    public List<CourseRegistry> entrolledStudent() {
        return courserepo.findAll();
    }

    public void registerCourse(String name, String emailid, String courseName) {
        CourseRegistry courseregistry=new CourseRegistry(name,emailid,courseName);
        courserepo.save(courseregistry);

    }
}
