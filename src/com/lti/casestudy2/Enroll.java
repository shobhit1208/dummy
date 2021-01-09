package com.lti.casestudy2;

import java.time.LocalDate;
import com.lti.casestudy1.*;


public class Enroll {

	private Student student;
    private Course course;
    private LocalDate enrollmentDate;
	public Student getStudent() 
	{
		return student;
	}
	public void setStudent(Student student) 
	{
		this.student = student;
	}
	public Course getCourse() 
	{
		return course;
	}
	public void setCourse(Course course) 
	{
		this.course = course;
	}
	public LocalDate getEnrollmentDate()
	{
		return enrollmentDate;
	}
	public void setEnrollmentDate(LocalDate enrollmentDate) 
	{
		this.enrollmentDate = enrollmentDate;
	}
 
	

}
