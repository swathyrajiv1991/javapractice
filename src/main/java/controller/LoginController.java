
package controller;

import java.io.IOException;

import com.service.StudentService;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

@WebServlet("/login")
public class LoginController extends HttpServlet {

    private static final long serialVersionUID = 1L;
	private StudentService service = new StudentService();

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String username = request.getParameter("username");
        String password = request.getParameter("password");

        boolean isValid = service.login(username, password);

        if (isValid) {

            
            HttpSession session = request.getSession();
            session.setAttribute("user", username);

            response.sendRedirect(request.getContextPath() + "/listStudent");

        } else {
            response.sendRedirect(request.getContextPath() + "/index.jsp?error=true");
        }
    }
}