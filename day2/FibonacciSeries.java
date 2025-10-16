package week1.day2;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int  firstNumber = 0;
     int secondNumber =1;
     int thirdNumber;
     //System.out.println(firstNumber);
     //System.out.println(secondNumber);
     for(int i = 1;i<=10;i++) {
    	 
    	 System.out.println(firstNumber);
    	 //System.out.println(thirdNumber);
    	 thirdNumber =firstNumber+secondNumber;

    	 firstNumber=secondNumber;
    	 secondNumber=thirdNumber;
    	 
    	 
    	 
     }
	}

}
