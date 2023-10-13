package com.unit4.databaseconnectivity.class1;

//step-1 : Import
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ScrollableResultSetDemo {

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
			Statement stm = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);

			// Step-5 : Execute SQL Query
			String sql = "select * from student;";
			ResultSet rs = stm.executeQuery(sql);

			// Step-6 : Processing resultSet

			rs.last();
			System.out.println("Using last : id = " + rs.getString(1) + " name : " + rs.getString(2));

			rs.previous();
			System.out.println("Using Previous : id = " + rs.getString(1) + " name : " + rs.getString(2));

			rs.next();
			System.out.println("Using next : id = " + rs.getString(1) + " name : " + rs.getString(2) + " DoB : "
					+ rs.getString(4));

			rs.absolute(3);
			System.out.println("Using absolute : id = " + rs.getString(1) + " name : " + rs.getString(2) + " DoB : "
					+ rs.getString(4));

			// step7 : Close the connection
			con.close();

		} catch (Exception e) {
			System.out.println(e.getMessage());

		}
	}
}
