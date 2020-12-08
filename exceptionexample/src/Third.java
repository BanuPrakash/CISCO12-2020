
public class Third {
	//UnsatisfiedLinkError
	static {
		System.loadLibrary("pubg.dll");
	}
	public static void main(String[] args) {
		System.out.println("Hello");
	}
}
