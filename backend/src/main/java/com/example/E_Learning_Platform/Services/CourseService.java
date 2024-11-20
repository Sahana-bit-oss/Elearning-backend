package com.example.E_Learning_Platform.Services;

import com.example.E_Learning_Platform.Dto.CourseDTO;
import java.util.List;

public interface CourseService {
    List<CourseDTO> getAllCourses();
    CourseDTO getCourseById(int id);
    String addCourse(CourseDTO courseDTO);
}
