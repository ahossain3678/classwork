package search;
import java.util.Scanner;
import java.util.Timer;


public class Searching {

	Scanner in;
	int[] numbers;
	public static final int HANDICAP= 10;
	
	public static void main(String[] args){
		System.out.println("Loading text ints...");
		Searching s = new Searching(); 
		
	}
	
	public Searching() {
		in = new Scanner(System.in);
		String s= new StringFromFileLoader("Data/ints.txt").getFileContent();
		String[] text =s.split(", "); 
		numbers = new int[text.length];
		for(int i=0; i<numbers.length; i++){
			numbers[i]=Integer.parseInt(text[i]);
		}
		proceedWithSearch();
	}

	private void proceedWithSearch() {
		System.out.println("Loaded " + numbers.length+" ints. Enter a value between 0 and "+numbers[numbers.length-1]);
		int target = -1;
		while(target==-1){
			try{
				target = Integer.parseInt(in.nextLine());
				if(target <=0 || target >= numbers[numbers.length-1])System.out.println("Follow instructions, please. Enter a value between 0 and "+numbers[numbers.length-1]);
			}catch(NumberFormatException e){
				System.out.println("Follow instructions, please. Enter a value between 0 and "+numbers[numbers.length-1]);
			}		
		}
		System.out.println("Get ready to race the computer. \n"
				+ "It's okay, the computer has been set to take "+HANDICAP+" ms for every iteration in its search algorithm.\n"
						+ "Open the file called \"ints.txt\". You will find it in the Data folder of this repository.\nTry to find the number "+target+" (by scrolling and reading)."
				+ "\n    Press 'enter' to begin.");
		in.nextLine();

		int index = binarySearch(numbers,0,numbers.length-1,target);

		if(index!=-1){
			System.out.println("The number "+target+" was found at index "+index+". Did the computer win?");
		}else{
			System.out.println("The number "+target+" was not found in the file.");
		}
		
	}


	public int binarySearch(int[] nums, int start, int finish, int target) {
		if(start > finish) return -1;
		else
			{
				int mid = (start+finish)/2;
			
		if (nums[mid]==target) return mid;
			else if (target<mid)
			{
				return binarySearch(nums, start, mid-1, target);
			}
				else return binarySearch(nums, mid+1,finish, target);
			}
	}
	private int search(int[] searchThis, int target) {
		for(int i=0;i<searchThis.length;i++) {
			delay();
			if(searchThis[i] == target) {
				return i;
			}
		}

		return -1;
	}
	
	/**
	 * The delay method is designed to slow down your algorithm. Without a delay,
	 * the search algorithm will likely run so fast it won't be noticeable.
	 * If you are running this on a slow machine, you can decrease the HANDICAP
	 * field to decrease the length of the delay
	 */
	private void delay() {
		try {
			Thread.sleep(HANDICAP);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	
	
	
}
