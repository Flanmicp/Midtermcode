package com.cisc181.core;

import java.util.UUID;
import com.cisc181.eNums.*;

public class Course {

	private UUID CourseID;
	private String CourseName;
	private int GradePoints;
	private eMajor Major;
	
	
	public Course(UUID randomUUID, String string, int i) {
		// TODO Auto-generated constructor stub
	}
	public UUID getCourseID() {
		return CourseID;
	}
	public void setCourseID(UUID courseID) {
		CourseID = courseID;
	}
	public String getCourseName() {
		return CourseName;
	}
	public void setCourseName(String courseName) {
		CourseName = courseName;
	}
	public int getGradePoints() {
		return GradePoints;
	}
	public void setGradePoints(int gradePoints) {
		GradePoints = gradePoints;
	}
	
}
