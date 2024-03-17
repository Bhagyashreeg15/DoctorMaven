package org.doctorapp.controllers;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.doctorapp.model.Doctor;
import org.doctorapp.service.DoctorServiceImpl;
import org.doctorapp.service.IDoctorService;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/updateServlet")
public class UpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private IDoctorService doctorService = new DoctorServiceImpl();

    /**
     * Default constructor. 
     */
    public UpdateServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
response.setContentType("text/html");
		


		String docId = request.getParameter("doctorId");
		int doctorId = Integer.parseInt(docId);
		
		String docFees = request.getParameter("doctorFees");
		Double doctorFees = Double.parseDouble(docFees);
	


		doctorService.updateDoctor(doctorId, doctorFees);
		
		PrintWriter writer = response.getWriter();
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("adminDash.jsp");
		dispatcher.include(request, response);
		
		writer.print("<p>Doctor data updated successfully</p>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
