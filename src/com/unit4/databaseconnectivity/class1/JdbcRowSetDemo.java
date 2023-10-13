package com.unit4.databaseconnectivity.class1;

import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetProvider;

public class JdbcRowSetDemo {

	public static void main(String[] args) {

		try {

			// Step-3 : Open SQL Connection
			String url = "jdbc:mysql://localhost:3306/csitseven";
			String username = "Admin";
			String password = "Admin";
			String sql = "select * from student;";

			JdbcRowSet jrs = RowSetProvider.newFactory().createJdbcRowSet();
			jrs.setUrl(url);
			jrs.setUsername(username);
			jrs.setPassword(password);
			jrs.setCommand(sql);
			jrs.execute();

			while (jrs.next()) {

				int id = jrs.getInt("id");
				String name = jrs.getString(2);
				String address = jrs.getString(3);
				String dob = jrs.getString(4);
				System.out.println("Id : " + id);
				System.out.println("Name : " + name);
				System.out.println("Address : " + address);
				System.out.println("DoB : " + dob);
			}

		} catch (Exception e) {
			System.out.println(e.getMessage());

		}
	}
}
