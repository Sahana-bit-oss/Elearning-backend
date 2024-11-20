package com.example.E_Learning_Platform.Dto;

public class CourseDTO {
    private int courseId;
    private String courseName;
    private String description;
    private String duration;
    private String level;
    private String imageUrl;

    // No-args constructor
    public CourseDTO() {}

    // All-arguments constructor
    public CourseDTO(int courseId, String courseName, String description, String duration, String level, String imageUrl) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.description = description;
        this.duration = duration;
        this.level = level;
        this.imageUrl = imageUrl;
    }

    // Getters and Setters
    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
}
