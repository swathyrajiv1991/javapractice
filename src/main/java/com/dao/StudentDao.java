package com.dao;


	import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.learn.model.Student;

	public class StudentDao  {

		public int addStudent(Student student) throws SQLException {

			int executeUpdate = 0;

		try {
				Class.forName("com.mysql.cj.jdbc.Driver");
			} catch (ClassNotFoundException e) {
				
				e.printStackTrace();
			}



				try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentdb", "root","");
						PreparedStatement preparedStatement = connection
								.prepareStatement("insert into student (name, email,course,marks) values (?, ?, ?, ?)")) {
					preparedStatement.setString(1, student.getName());
					preparedStatement.setString(2, student.getEmail());
					preparedStatement.setString(3, student.getCourse());
					preparedStatement.setDouble(4, student.getMarks());
					executeUpdate = preparedStatement.executeUpdate();
					System.out.println("rows affected : " + executeUpdate);
				} catch (SQLException e) {
					e.printStackTrace();
					throw e;
				}

			return executeUpdate;
		}

		public List<Student> getStudents() {
			List<Student> students = new ArrayList();

			try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentdb", "root",
					"");

					PreparedStatement preparedStatement = connection.prepareStatement("select * from student")) {
				ResultSet resultSet = preparedStatement.executeQuery();
				while (resultSet.next()) {
					Student student = new Student();
					student.setId(resultSet.getInt("ID"));
					student.setName(resultSet.getString("name"));
					student.setEmail(resultSet.getString("email"));
					student.setCourse(resultSet.getString("course"));
					student.setMarks(resultSet.getDouble("marks"));
					students.add(student);
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
			return students;
		}

		public boolean login(String username, String password) {

		    boolean status = false;

		    try (Connection connection = DriverManager.getConnection(
		            "jdbc:mysql://localhost:3306/studentdb", "root", "");
		         
		         PreparedStatement ps = connection.prepareStatement(
		            "SELECT * FROM users WHERE username=? AND password=?")) {

		        ps.setString(1, username);
		        ps.setString(2, password);
		        System.out.println("Username: " + username);
		        System.out.println("Password: " + password);

		        ResultSet rs = ps.executeQuery();

		        if (rs.next()) {
		            status = true;
		        }

		    } catch (SQLException e) {
		        e.printStackTrace();
		    }

		    return status;
		}

	}


