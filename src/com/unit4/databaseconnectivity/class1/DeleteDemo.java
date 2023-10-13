package com.unit4.databaseconnectivity.class1;

//step-1 : Import
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DeleteDemo {

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

			String sql = "delete from student where id = ?;";
			PreparedStatement pstm = con.prepareStatement(sql);
			pstm.setInt(1, 1);

			int flag = pstm.executeUpdate();
			if (flag > 0) {
				System.out.println("Data Deleted Successfully!");
			} else {
				System.out.println("Failed to Delete.");
			}

			// step7 : Close the connection
			con.close();

		} catch (Exception e) {
			System.out.println(e.getMessage());

		}
	}
}
