package com.service;
	import java.sql.SQLException;
import java.util.List;

import com.dao.StudentDao;
import com.learn.model.Student;

	public class StudentService  {

		private StudentDao studentDAO;

		public StudentService() {
			this.studentDAO = new StudentDao();
		}

		public String addStudent(Student student) {
			String error = null;
			try {
				int affectedRows = studentDAO.addStudent(student);
				if (affectedRows == 0) {
					error = "Error in inserting student object ";
				}
			} catch (SQLException e) {
				e.printStackTrace();
				error = "Email is null";
			}
			return error;
		}

		public List<Student> getStudents() {
			return studentDAO.getStudents();

		}

		public boolean login(String username, String password) {

		    boolean isValid = false;

		    try {
		        isValid = studentDAO.login(username, password);
		    } catch (Exception e) {
		        e.printStackTrace();
		    }

		    return isValid;
		}

	}
