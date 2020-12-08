
public class Second {
	public static void main(String[] args) {
		System.out.println("Hello");
			doTask();
		System.out.println("End!!");
	}

	private static void doTask() {
		System.out.println("in doTask!!!");
		// write exit condition
		doTask(); // recursive call
	}
}
