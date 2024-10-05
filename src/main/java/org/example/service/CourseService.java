package org.example.service;

import org.example.dto.Course;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class CourseService {
    //RDS DB
    private final List<Course> courses = new ArrayList<>();

    // Createing a NEW Course
    public void addCourse(Course course){
        courses.add(course);
    }

    //Retrieve all Courses
    public List<Course>  getAllCourses(){
        return courses;
    }

    //Retrieve a course by id
    public Optional<Course> getCourseById(int id){
        //courses from AL
        return courses.stream().filter(course -> course.getId() == id).findFirst();
    }

    //Update a Course
    public boolean updateCourse(int id, Course newCourse){
        return getCourseById(id).map(existingCourse -> {
            courses.remove(existingCourse);
            courses.add(newCourse);
            return true;
        }).orElse(false);
    }

    // Delete a course by id
    public boolean deleteCourse(int id){
        return courses.removeIf(course -> course.getId() == id);
    }

}
