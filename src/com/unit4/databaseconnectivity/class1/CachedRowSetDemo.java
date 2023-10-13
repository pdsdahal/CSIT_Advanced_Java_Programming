package com.unit4.databaseconnectivity.class1;

import javax.sql.rowset.CachedRowSet;
import javax.sql.rowset.RowSetProvider;

public class CachedRowSetDemo {

	public static void main(String[] args) {

		try {

			// Step-3 : Open SQL Connection
			String url = "jdbc:mysql://localhost:3306/csitseven";
			String username = "Admin";
			String password = "Admin";
			String sql = "select * from student;";

			CachedRowSet crs = RowSetProvider.newFactory().createCachedRowSet();
			crs.setUrl(url);
			crs.setUsername(username);
			crs.setPassword(password);
			crs.setCommand(sql);
			crs.execute();

			System.out.println("Using CachedRowSet");
			while (crs.next()) {

				int id = crs.getInt("id");
				String name = crs.getString(2);
				String address = crs.getString(3);
				String dob = crs.getString(4);
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
