package com.training;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/greeting")
public class MavenServlet extends HttpServlet {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Get the name parameter from the form
        String username = request.getParameter("username");

        // Set the response content type to HTML
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        // Generate the greeting message
        out.println("<!DOCTYPE html>");
        out.println("<html lang='en'>");
        out.println("<head><meta charset='UTF-8'><title>Greeting</title>");
        out.println("<style>");
        out.println("body { font-family: Arial, sans-serif; background-color: #f0f8ff; display: flex; justify-content: center; align-items: center; height: 100vh; }");
        out.println(".greeting-container { text-align: center; background-color: #fff; padding: 20px; border-radius: 10px; box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1); }");
        out.println("</style>");
        out.println("</head>");
        out.println("<body>");
        out.println("<div class='greeting-container'>");
        out.println("<h1>Hello, " + username + "!</h1>");
        out.println("<p>We hope you have a wonderful day!</p>");
        out.println("</div>");
        out.println("</body>");
        out.println("</html>");
    }
}