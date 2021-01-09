package com.lti.casestudy1;

public class Course 
{

	int Id;
	String name;
	String duration;
	float fees;
	Course(int Id , String name, String duration, float fees)
	{
		this.Id=Id;
		this.name=name;
		this.duration=duration;
		this.fees=fees;
	}
	
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDuration() {
		return duration;
	}
	public void setDuration(String duration) {
		this.duration = duration;
	}
	public float getFees() {
		return fees;
	}
	public void setFees(float fees) {
		this.fees = fees;
	}

}
