
package controller;

import java.io.IOException;
import java.util.List;

import com.learn.model.Student;
import com.service.StudentService;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ListStudentServlet
 */
@WebServlet("/listStudent")
public class ListController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private StudentService service = new StudentService();

	/**
	 * Default constructor.
	 */
	public ListController() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		List<Student> students = service.getStudents();
		request.setAttribute("students", students);
		request.getRequestDispatcher("/listStudent.jsp").forward(request, response);

	}

}