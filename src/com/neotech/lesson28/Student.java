package com.neotech.lesson28;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Student {
	
	String name;
	String studentID;

	Student(String name, String studentID)
	{
		this.name = name;
		this.studentID = studentID;
	}
	
	
	public void display( ) {
		System.out.println(name + ", " + studentID);
	}
	
	
	public static void main(String[] args) {

Set<Student> st = new HashSet();
st.add(new Student("Jake", "23213"));
st.add(new Student("Paul", "75633"));
st.add(new Student("Logan", "456213"));
st.add(new Student("KSI", "995363"));
st.add(new Student("someOtherIdiot", "111111"));

for (Student s : st)
	s.display();

System.out.println();

Iterator<Student> it = st.iterator();

while(it.hasNext())
{
	Student stu = it.next();
	if(stu.name.equals("KSI"))
	{
		it.remove();
	}
	
	stu.display();
}
System.out.println(st.size());

	}

}
