package com.example.E_Learning_Platform.Services.impl;

import com.example.E_Learning_Platform.Dto.CourseDTO;
import com.example.E_Learning_Platform.Entity.Course;
import com.example.E_Learning_Platform.Repo.CourseRepo;
import com.example.E_Learning_Platform.Services.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CourseServiceImpl implements CourseService {

    @Autowired
    private CourseRepo courseRepo;

    @Override
    public List<CourseDTO> getAllCourses() {
        List<Course> courses = courseRepo.findAll();
        return courses.stream()
                .map(course -> new CourseDTO(course.getCourseId(), course.getCourseName(), course.getDescription(),
                        course.getDuration(), course.getLevel(), course.getImageUrl()))
                .collect(Collectors.toList());
    }

    @Override
    public CourseDTO getCourseById(int id) {
        Course course = courseRepo.findById(id).orElse(null);
        if (course != null) {
            return new CourseDTO(course.getCourseId(), course.getCourseName(), course.getDescription(),
                    course.getDuration(), course.getLevel(), course.getImageUrl());
        }
        return null;
    }

    @Override
    public String addCourse(CourseDTO courseDTO) {
        Course course = new Course();
        course.setCourseName(courseDTO.getCourseName());
        course.setDescription(courseDTO.getDescription());
        course.setDuration(courseDTO.getDuration());
        course.setLevel(courseDTO.getLevel());
        course.setImageUrl(courseDTO.getImageUrl());

        courseRepo.save(course);
        return "Course added successfully!";
    }
}
