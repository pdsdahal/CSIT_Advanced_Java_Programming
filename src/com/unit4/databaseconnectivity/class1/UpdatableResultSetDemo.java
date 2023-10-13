package com.unit4.databaseconnectivity.class1;

//step-1 : Import
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class UpdatableResultSetDemo {

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
			Statement stm = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);

			// Step-5 : Execute SQL Query
			String sql = "select * from student;";
			ResultSet rs = stm.executeQuery(sql);

			// delete
			rs.absolute(3);
			rs.deleteRow();
			System.out.println("Data Deleted Successfully!");

			// insert
			rs.moveToInsertRow();
			rs.updateString(2, "Hari Pandey");
			rs.updateString(3, "Bkt Nepal");
			rs.updateString(4, "1980-01-01");
			rs.insertRow();
			System.out.println("Data inserted successfully!");

			// step7 : Close the connection
			con.close();

		} catch (Exception e) {
			System.out.println(e.getMessage());

		}
	}
}
