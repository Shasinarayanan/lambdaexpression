package java8featurespackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LambdaComparatorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ArrayList<Employee> list = new ArrayList<Employee>();

	      // Adding employees
	      list.add(new Employee(100, "sasi", 25000.00));
	      list.add(new Employee(98, "Anu", 30000.00));
	      list.add(new Employee(135, "janani", 40000.00));
	      System.out.println("Sorting the employee list based on the name");

	      // implementing lambda expression
	      Collections.sort(list, (p1, p2) -> {
	         return p1.name.compareTo(p2.name); 
	      }); 
	      for(Employee e : list) {
	         System.out.println(e.id + " " + e.name + " " + e.salary);
	      }
	   }
	}


