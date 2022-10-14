package practice;

public class Practise10_14 {

	public static void main(String[] args) {
		
		int i =1;
		int j = ++i - --i;
		int k = j-- - --i + i-- - --j;
		int l = --k - k-- + i-- - --i + j++ - --j;
		
		System.out.println(i);
		System.out.println(j);
		System.out.println(k);
		System.out.println(l);
	}

}
