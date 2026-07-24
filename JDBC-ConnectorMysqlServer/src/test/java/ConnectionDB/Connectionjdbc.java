package ConnectionDB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connectionjdbc {
	
	private static String url="jdbc:mysql://localhost:3306/selenium_automation_testing";
	private static String name="root";
	private static String password="Kartik@123";
	
	public static Connection getConnection() {
		  try{
	            return DriverManager.getConnection(url,name,password);
	        } catch (SQLException e) {
	            throw new RuntimeException(e);
	        }
	}
	
	

}
