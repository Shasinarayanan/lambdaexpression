package java8featurespackage;

import java.util.*;

public class ComparableLambda {

	public static <T> void main(String[] args) {
		// TODO Auto-generated method stub
		List<Student> al = new ArrayList<Student>();
		al.add(new Student(101, "Vijay", 23));
		al.add(new Student(106, "Ajay", 27));
		al.add(new Student(105, "Jai", 21));

		 Collections.sort(al, (p1, p2) -> {
	         return p1.age.compareTo(p2.age); 
	      }); 
		for (Student st : al) {
			System.out.println(st.rollno + " " + st.name + " " + st.age);
		}
	}

}
