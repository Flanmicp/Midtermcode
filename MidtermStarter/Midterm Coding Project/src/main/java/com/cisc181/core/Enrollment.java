package com.cisc181.core;

import java.util.UUID;

public class Enrollment {
 
	private UUID SectionID;
	private UUID EnrollmentID;
	private UUID StudentID;
	private double Grade;
	
	private Enrollment() {
		super();
		
	}
	
	public Enrollment(UUID sectionID, UUID studentID) {
		
		super();
		SectionID = sectionID;
		StudentID = studentID;
		EnrollmentID = UUID.randomUUID();
		
	}
	
	public void setGrade(double grade)
	{
		Grade = grade;
}
}
