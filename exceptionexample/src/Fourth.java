import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Fourth {
	public static void main(String[] args) {
		
		try {
			FileInputStream fis = new FileInputStream("a.txt");
			Connection con = DriverManager.getConnection("oracle url");
			// code
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
