package com.example.codeqldemo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.*;

@SpringBootApplication
public class CodeqlDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CodeqlDemoApplication.class, args);

	}
//	public static void main(String[] args) {
//		sp
//		try {
//			// Connect to the database
//			Connection conn = DriverManager.getConnection("jdbc:h2:mem:testdb", "username", "password");
//
//			// Get user input
//			String username = args[0];
//
//			// Construct SQL query
//			String sql = "SELECT * FROM users WHERE username = '" + username + "'";
//
//			// Execute query
//			Statement stmt = conn.createStatement();
//			ResultSet rs = stmt.executeQuery(sql);
//
//			// Process results
//			while (rs.next()) {
//				String resultUsername = rs.getString("username");
//				String resultPassword = rs.getString("password");
//				System.out.println("Username: " + resultUsername + ", Password: " + resultPassword);
//			}
//
//			// Clean up
//			rs.close();
//			stmt.close();
//			conn.close();
//
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
//	}
}
