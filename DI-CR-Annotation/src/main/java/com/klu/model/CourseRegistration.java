package com.klu.model;

import org.springframework.stereotype.Component;

@Component

public class CourseRegistration {
private int rollNo;
private String studentName;
private String courseName;
private int semester;
public CourseRegistration(@Value("101")int rollNo,@Value("Neha")String Student)
this.rollNo=rollNo;
this.studentName=studentName;
}
@Value("FSAD")
public void aetCourseName(String courseName)
this.courseName=courseName;
}
@value("")