package java8featurespackage;
import java.util.*;
public class Student implements Comparable {
	int rollno;  
	String name;  
	Integer age;  
	Student(int rollno,String name,int age){  
	this.rollno=rollno;  
	this.name=name;  
	this.age=age;  
	}  
	  
	
    public int compareTo(Student st) {
		// TODO Auto-generated method stub
		if(age==st.age)  
			return 0;  
		else if(age>st.age)  
		return 1;  
		else  
		return -1;  
		}


	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}
	}  

