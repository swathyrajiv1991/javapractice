package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class Test {
	public static void main(String[] args) throws Exception {
	    

		Connection conn = DriverManager.getConnection(
				"jdbc:mysql://localhost:3306/studentdb", "root", ""
			);

	    System.out.println("Connected!");
	}
}
