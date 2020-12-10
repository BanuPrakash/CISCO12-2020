package threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPool {

	public static void main(String[] args) {
		
		ExecutorService service = Executors.newFixedThreadPool(2);
		Account acc = new Account(5000);
		
		service.submit(new TransactionThread(acc, "Gopal", TransactionType.CREDIT, 3000));
		service.submit( new TransactionThread(acc, "Sam", TransactionType.CREDIT, 2000));
		service.submit( new TransactionThread(acc, "Parthiv", TransactionType.CREDIT, 3000));
		service.submit( new TransactionThread(acc, "Saina", TransactionType.CREDIT, 3000));
		service.submit( new TransactionThread(acc, "Deepa", TransactionType.CREDIT, 3000));
		service.submit( new TransactionThread(acc, "Larry", TransactionType.CREDIT, 3000));
		
		service.shutdown();
		
	}

}
