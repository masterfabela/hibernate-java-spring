package com.platzi.platziweb.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class ServletLogin
 */
@WebServlet(description = "Servlet para manipular peticion de login", urlPatterns = { "/abc123" })
public class ServletLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public ServletLogin() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
		// Recibir informacion
		String usuario = request.getParameter("usuario");
		String empresa = request.getParameter("empresa");
		PrintWriter escritor = response.getWriter();
		if (usuario != null && empresa != null) {
			if(empresa.equals("Platzi")) {
				escritor.println("Bienvenido a platzi");
			} else {
				escritor.println("Bienvenido...");
			}
		} else {
			escritor.println("Usuario Incorrecto");
		}
		escritor.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
