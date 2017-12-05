package algorithms;

public class moreRecurse {

	public static void main(String[] args) {
		hanoi(25,"a","b","c");

	}

	public static int fibonacci(int i) {
		if(i <= 1) {
			return 1;
		}else {
			return fibonacci(i-1) + fibonacci(i-2);
		}
		
	}
	public static void hanoi(int n,String start, String helper,String end) {
		if(n==1) {
			System.out.println(start +" to "+end);
		}else {
			hanoi(n-1,start,end,helper);
			System.out.println(start+" to "+end);
			hanoi(n-1,helper,start,end);
		}
	}

}
