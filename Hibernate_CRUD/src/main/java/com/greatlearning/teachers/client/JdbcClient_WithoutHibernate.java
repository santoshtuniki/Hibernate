package com.greatlearning.teachers.client;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcClient_WithoutHibernate {
	
	/* STEPS TO RUN STATEMENTS	*/	
	public static void main(String[] args) {
		
		// 1.Load the driver (MYSQL JDBC)
		// Not required as maven dependencies install the MYSQL JARS
		
		try {
			// 2.Create a Database Connection
			Connection dbConnection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_db?useSSL=false", "root", "Pokemon@1234");
			
			// 3.Create a Statement
			Statement selectStmt = dbConnection.createStatement();
			
			// 4.Execute the statement 
			ResultSet resultSet = selectStmt.executeQuery("select * from teachers");
			
			// 5.Process the result
			while(resultSet.next()) {
				long id = resultSet.getLong(1);
				String name = resultSet.getString(2);
				String subject = resultSet.getString(3);
				int exp = resultSet.getInt(4);
				System.out.println("Id = " + id + ", Name = " + name + ", Subject = " + subject + ", Exp = " + exp);
			}
			resultSet.close();
			
			// 6.Close the Statement
			selectStmt.close();
			
			// 7.Close the Database Connection
			dbConnection.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
