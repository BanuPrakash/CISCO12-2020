package threads;

public class Example {

	public static void main(String[] args) {
		System.out.println("Main starts!!!");
		
		
		NumberThread t1 = new NumberThread(1,10);
		NumberThread t2 = new NumberThread(30,50);
		NumberThread t3 = new NumberThread(900,1300);
		
		t3.setName("Demo Daemon");
		t3.setDaemon(true);
		
		t1.start();
		t2.start();
		t3.start();
		
		performOperations();
		
		System.out.println("complete!!!");
	}

	private static void performOperations() {
		Thread t = Thread.currentThread();
		System.out.println("Name :" + t.getName());
		System.out.println("Priorirty :" + t.getPriority()); // 1 - 10; 5 -> NORMAL
		System.out.println("Daemon :" + t.isDaemon()); // Non Daemon
		System.out.println("Group :" + t.getThreadGroup().getName()); // main group
		System.out.println("Is Alive :" + t.isAlive());
	}

}

