package com.CRUDoperation.sql;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.annotations.Test;

import ConnectionDB.Connectionjdbc;

public class CRUDoperation {

	@Test
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String query = "INSERT INTO book_detl VALUES('AI003','selenium','ide','kartik','XYZ','S','2026','900.00')";
//		String query = "UPDATE book_detl SET author='Rathi' WHERE author='kartik'";
//		String query= "DELETE FROM book_detl WHERE book_no ='AI003'";
		String query="SELECT * FROM book_detl";
		
		try(Connection com=Connectionjdbc.getConnection()){
			Statement st=com.createStatement();
//			int row=st.executeUpdate(query);
//			System.out.println(row);
			
			ResultSet rs = st.executeQuery(query);

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
		
			com.close();
			
			
		}catch(SQLException e) {
			
			e.printStackTrace();
		}
	}

	

}
