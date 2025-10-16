package week1.day2;

import java.util.Iterator;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	int num = 06;
	int factor =0;
	
	for (int i = 1; i<=num; i++) {
		
		if (num%i==0) {
		factor++;
		}
	}
if (factor==2) {
	System.out.println("It is a Prime Number");
} else if(factor>2){
System.out.println("It is Not a Prime Number");
}		
	}
		

}
