package com.cisc181.core;

import static org.junit.Assert.*;

import java.util.UUID;
import java.util.ArrayList;
import java.util.Calendar;


import org.junit.BeforeClass;
import org.junit.Test;

public class Student_Test {

	private static ArrayList<Course> course = new ArrayList<Course>();
	private static ArrayList<Semester> semester = new ArrayList<Semester>();
	private static ArrayList<Section> sections = new ArrayList<Section>();
	
	@BeforeClass
	public static void setup() {
		course.add(new Course(UUID.randomUUID(),"PHYS 207", 3));
		course.add(new Course(UUID.randomUUID(),"MATH 241", 4));
		course.add(new Course(UUID.randomUUID(),"CISC 107", 3));
		
		semester.add(new Semester(UUID.randomUUID(), new Date(117, 8, 29), new Date(117, 12, 16)));
		semester.add(new Semester(UUID.randomUUID(), new Date(118, 2, 5), new Date(118, 5, 24)));
		
		sections.add(new Section(course.get(0).getCourseID(), semester.get(0).getSemesterID(), UUID.randomUUID(), 181));
		sections.add(new Section(course.get(1).getCourseID(), semester.get(0).getSemesterID(), UUID.randomUUID(), 207));
		sections.add(new Section(course.get(2).getCourseID(), semester.get(0).getSemesterID(), UUID.randomUUID(), 441));
		sections.add(new Section(course.get(0).getCourseID(), semester.get(1).getSemesterID(), UUID.randomUUID(), 306));
		sections.add(new Section(course.get(1).getCourseID(), semester.get(1).getSemesterID(), UUID.randomUUID(), 181));
		sections.add(new Section(course.get(2).getCourseID(), semester.get(1).getSemesterID(), UUID.randomUUID(), 206));
	}

	@Test
	public void test() {
		assertEquals(1, 1);
	}
}