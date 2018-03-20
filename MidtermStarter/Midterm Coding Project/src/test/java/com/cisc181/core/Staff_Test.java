package com.cisc181.core;

import static org.junit.Assert.*;

import java.sql.Date;
import java.util.ArrayList;
import java.util.Calendar;

import org.junit.BeforeClass;
import org.junit.Test;

import com.cisc181.eNums.eTitle;

public class Staff_Test {

	private static ArrayList<Staff> staffpeeps = new ArrayList<Staff>();
	
	
	@BeforeClass
	public static void setup() {
		try {
			staffpeeps.add( new Staff("Ben","Dover", "Anuse", new Date(50,2,3), "Smith 310", "(302)-345-6789", "BDAnuse@udel.edu", 
					"Friday Afternoon", 1, 3500000, new Date(60,3,5), eTitle.MR));
			
			staffpeeps.add( new Staff("Mike","Fishbach", "Hunt", new Date(90,2,3), "Memorial 010", "(302)-698-0789", "Mike.Hunt@udel.edu", 
					"Friday Afternoon", 1, 250000, new Date(112,7,9), eTitle.MR));
			
			staffpeeps.add( new Staff("Sam","Howard", "Blackman", new Date(45,5,7), "Evan 205", "(302)-565-7878", "SBlackman@udel.edu", 
					"Friday Afternoon", 1, 350000, new Date(102,5,32), eTitle.MR));
			
			staffpeeps.add( new Staff("Lucifer","Lightbringer", "Morningstar", new Date(66,6,6), "Townsend 666", "(302)-666-6666", "Samael@udel.edu", 
					"Monday Morning", 1, 666666, new Date(70,7,8), eTitle.MR));
			
			staffpeeps.add( new Staff("LordFireDick","Condom", "STD", new Date(50,2,3), "Mitchell 306", "(302)-767-7787", "STD@udel.edu", 
					"Friday Afternoon", 1, 3500000, new Date(90,6,9), eTitle.MR));
		}catch (PersonException e) {
		}
	}
	
	@Test
	public void test() {
		assertEquals(1,1);
	}	

}
