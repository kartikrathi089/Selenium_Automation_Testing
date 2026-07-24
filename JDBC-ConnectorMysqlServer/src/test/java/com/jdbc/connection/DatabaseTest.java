package com.jdbc.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseTest {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		String databaseUrl = "jdbc:mysql://localhost:3306/selenium_automation_testing";
		String user = "root";
		String password = "Kartik@123"; // <-- your actual MySQL root password

		// Load the MySQL JDBC driver and establish connection
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Connecting to Database...");

		Connection connection = DriverManager.getConnection(databaseUrl, user, password);
		Statement stmt = connection.createStatement();

		String query = "SELECT * FROM book_detl";

		ResultSet rs = stmt.executeQuery(query);

		while (rs.next()) {
			System.out.println(
				rs.getString("book_no") + " | " +
				rs.getString("title") + " | " +
				rs.getString("sub_code") + " | " +
				rs.getString("author") + " | " +
				rs.getString("publisher") + " | " +
				rs.getString("status") + " | " +
				rs.getString("yop") + " | " +
				rs.getInt("price")
			);
		}
		
		System.out.println("table 2");

		String query1="SELECT * FROM cust_new";
		
		rs=stmt.executeQuery(query1);
		
		while (rs.next()) {
			System.out.println(
				rs.getString("CUSTOMER_ID") + " | " +
				rs.getString("CUST_LAST_NAME") + " | " +
				rs.getString("DATE_OF_BIRTH") + " | " +
				rs.getString("ACCOUNT_MGR_ID") 
			);
		}
		
		connection.close();
		
		
	}
}