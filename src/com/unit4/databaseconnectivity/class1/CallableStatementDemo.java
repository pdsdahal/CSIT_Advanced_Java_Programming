package com.unit4.databaseconnectivity.class1;

//step-1 : Import
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class CallableStatementDemo {

	public static void main(String[] args) {

		try {
			// Step-2 : load and register Driver
			Class.forName("com.mysql.cj.jdbc.Driver");

			// Step-3 : Open SQL Connection
			String url = "jdbc:mysql://localhost:3306/csitseven";
			String username = "Admin";
			String password = "Admin";
			Connection con = DriverManager.getConnection(url, username, password);

			// step-4:Create statement
			CallableStatement stm = con.prepareCall("{call select_data()}");

			// Step-5 : Execute SQL Query
			ResultSet rs = stm.executeQuery();

			// Step-6 : Processing resultSet
			while (rs.next()) {

				int id = rs.getInt("id");
				String name = rs.getString(2);
				String address = rs.getString(3);
				String dob = rs.getString(4);
				System.out.println("Id : " + id);
				System.out.println("Name : " + name);
				System.out.println("Address : " + address);
				System.out.println("DoB : " + dob);
			}

			// step7 : Close the connection
			con.close();

		} catch (Exception e) {
			System.out.println(e.getMessage());

		}
	}
}
