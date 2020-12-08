package exceptionexample;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Fifth {

	public static void main(String[] args) {
		try {
			fileHandle();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	// ducks FilenotFoundException
	private static void fileHandle() throws FileNotFoundException {
		FileInputStream fis = new FileInputStream("a.txt");
		// code
		
	}

}
