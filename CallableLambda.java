package java8featurespackage;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableLambda {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ExecutorService executor=Executors.newFixedThreadPool(1);
		Callable getSumOfEvenNumbers = ()-> {   // Lambda Expression
	         int sum= 0;
	         for(int i = 1; i <=10; i++) {
	        	 if(i%2==0)
	        	 sum+= i;
	         }
	         return sum;
	      };
	      Future<Integer> future = executor.submit(getSumOfEvenNumbers);
	      try {
	         Integer result = future.get(); //wait for a thread to complete
	         System.out.println(result);
	      } catch(ExecutionException e) {
	         e.printStackTrace();
	      }
	      executor.shutdown();
	   }

	}


