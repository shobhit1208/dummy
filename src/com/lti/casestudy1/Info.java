package com.lti.casestudy1;

import com.lti.casestudy2.*;

public class Info {
	public void displayStd(Student s) 
	{
		s.getId();
		s.getName();
		s.getDob();
		
		System.out.println("ID: " + s.getId() + "\nName: " + s.getName() + "\nDate Of Birth: " + s.getDob() );
	}
	
	public void displayCrs(Course c) 
	{
		c.getId();
		c.getName();
		c.getDuration();
		c.getFees();
		
		System.out.println("ID: " + c.getId() + "\nName: " + c.getName() + "\nDuration " + c.getDuration() );
	}

	public void displayEnr(Enroll e) 
	{
		e.getStudent();
		e.getCourse();
		e.getEnrollmentDate();
	}
}