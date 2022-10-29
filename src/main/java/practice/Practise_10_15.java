package practice;

public class Practise_10_15 {
	
	public static void main(String[] args) {

	
	int num = 23;//
	
	if(num % 2 == 0)
		System.out.println(num + " is even");
    else
        System.out.println(num + " is odd");
	
	int year = 2000;// a leap year has to be evently divisible by 4
	//it is divisible by 4 ,100 and 400 if the same leap year is also evenly divisible by 100
	// technically a leap year has to be evently divisible by 4 and 400
	
	if year %4 == 0 && year%100 ==0 || year%400 ==0) {
		System.out.println("year is a leap year : " + year);
	}else {
		System.out.println("num is not prime : " + num"); 
	}
	
	
	 if (year % 400 == 0) {
		 System.out.println(year + "is a leap year.");
		 
	 }
	 else if (year % 100 == 0) {
		 System.out.println(year + "is not a leap year.");
	 }
	 else if (year % 4 == 00 ) {
		 System.out.println(year + "is a leap year.");
	 }
	 else {
		 System.out.println(year + "is not a leap year.");
		 
	  }
 }
	
	

		// TODO Auto-generated method stub
// WAP to determine whetewer this number is even or odd
		// wap to determine whether this number is a prime number or not 
		
		// whether this year is leap year or not
		
		
	}


