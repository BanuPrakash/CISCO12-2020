package threads;

public class AccountClient {

	public static void main(String[] args) {
		Account acc = new Account(5000);
		TransactionThread t1 = new TransactionThread(acc, "Gopal", TransactionType.CREDIT, 3000);
		TransactionThread t2 = new TransactionThread(acc, "\tVeena", TransactionType.DEBIT, 6000);
		TransactionThread t3 = new TransactionThread(acc, "\t\tRani", TransactionType.CREDIT, 2500);
		
		
		t2.start();
		
		try {
			Thread.sleep(10);
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}
		
		t1.start();
		t3.start();
		
		try {
			t1.join();
			t2.join();
			t3.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("Final Balance : " + acc.getBalance());
	}

}
