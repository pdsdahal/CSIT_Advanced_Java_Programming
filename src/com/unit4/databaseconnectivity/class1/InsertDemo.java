package com.unit4.databaseconnectivity.class1;

//step-1 : Import
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class InsertDemo {

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

			String sql = "insert into student(name,address,dob) values(?,?,?);";
			PreparedStatement pstm = con.prepareStatement(sql);
			pstm.setString(1, "Sita Pandey");
			pstm.setString(2, "Bhaktapur Nepal");
			pstm.setString(3, "2021-01-01");

			int flag = pstm.executeUpdate();
			if (flag > 0) {
				System.out.println("Data inserted Successfully!");
			} else {
				System.out.println("Failed to Insert.");
			}

			// step7 : Close the connection
			con.close();

		} catch (Exception e) {
			System.out.println(e.getMessage());

		}
	}
}
