package controller;



	import java.io.IOException;

import com.learn.model.Student;
import com.service.StudentService;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

	/**
	 * Servlet implementation class addStudentServlet
	 */
	@WebServlet("/addStudent")
	public class AddStudentController  extends HttpServlet {
		private static final long serialVersionUID = 1L;

		private StudentService service;

		public AddStudentController() {
			this.service = new StudentService();
		}

		/**
		 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
		 *      response)
		 */
		@Override
		protected void doPost(HttpServletRequest request, HttpServletResponse response)
				throws ServletException, IOException {

			String name = request.getParameter("name");
			String email = request.getParameter("email");
			String course = request.getParameter("course");
			double marks = Double.parseDouble(request.getParameter("marks"));

			Student student = new Student(0, name, email, course, marks);

			String error = service.addStudent(student);

			if(error != null) {
				request.setAttribute("error", error);
				request.getRequestDispatcher("/addStudent.jsp").forward(request, response);
			} else {
				response.sendRedirect(request.getContextPath() + "/listStudent");
			}
		}


}
