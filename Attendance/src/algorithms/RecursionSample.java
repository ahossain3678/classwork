package algorithms;

import java.util.Arrays;

public class RecursionSample {

 public static void main(String[] args) {
	 int value = 5;
	 System.out.println(value+"! is equal to "+factorial(value));
	 System.out.println(value+ " has "+countPrimeFactors(value, 2)+" prime factors.");
 }

 
	 public static void repeat(int times, Action a){
		 if (times >0){
		 a.act();
		 repeat(times - 1,a);
		 }
		 }
	 
	 public static int factorial(int value) {
		 if(value != 0) {
			return value * factorial(value -1);
		 }else {
			 return 1;
		 }
	 }
	 public static int countPrimeFactors(int value, int testPrime) {
		 if(value == testPrime) {
			 return 1;
		 }
		 else {
			 if(value % 2 == 0) {
				 
			 }
		 }
	}

}