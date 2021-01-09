package com.lti.casestudy1;

public class Solution {

	public static void main(String args[])
	{
		Student s1 = new Student(1, "ss", "12/12/12");
		Student s2 = new Student(2, "uss", "12/12/12");
		Student s3 = new Student(3, "sgs", "12/12/12");
		
		Info i = new Info();
		i.displayStd(s1);
		i.displayStd(s2);
		i.displayStd(s3);
		
		Student s[] = new Student[3];
		s[0] = new Student(1, "ss", "12/12/12");
		s[1] = new Student(2, "ss", "12/12/12");
		s[2] = new Student(3, "ss", "12/12/12");
		
		for (Student t :s)
		{
		i.displayStd(t);
		}

		
		
	}
}
