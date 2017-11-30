package algorithms;

public class SimulatedForLoop {

	public static void main(String[] args) {
		forLoop(10, new Action() {
			
			int count = 1;
			
			@Override
			public void act() {
				System.out.println(count+" Smh");
				count++;
			}
		});
	}
	public static void forLoop(int n, Action a) {

			a.act();
			forLoop(n-1,a);

	}
}
