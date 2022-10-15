package home_assigment_10_09;

public class Incremental_Decremental_HW {

	public static void main(String[] args) {
		int i =1; //-3
		int j = ++i - --i;
		//      2   - 1 =1
		
		int k = j-- - --i + i-- - --j;
		// k=   1                  
		// j=   0                 -1
		// i=        0       -1
		                 
			        
		int l = --k - k-- + i-- - --i + j++ - --j;
		
	// i++ - returns the original value of i and then increase it by 1
	// ++i -  increase i by 1 then returns the new value
		
	System.out.println(i);
	System.out.println(j);
	System.out.println(k);
	System.out.println(l);
	
		
	}

}
