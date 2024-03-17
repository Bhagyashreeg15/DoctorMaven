package org.doctorapp.controllers;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.doctorapp.exception.DoctorNotFoundException;
import org.doctorapp.model.Doctor;
import org.doctorapp.service.DoctorServiceImpl;
import org.doctorapp.service.IDoctorService;


@WebServlet("/searchServlet")
public class SearchServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private IDoctorService doctorService = new DoctorServiceImpl();
    public SearchServlet() {
        
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//findBySpeciality

		String speciality = request.getParameter("speciality");
		
		List<Doctor> doctors = null;
		PrintWriter writer = response.getWriter();
		
		try {
		doctors = doctorService.findBySpeciality(speciality);
		
		
		} catch (DoctorNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("adminDash.jsp");
		dispatcher.include(request, response);
		
		for(Doctor doctor : doctors) {
			writer.print(doctor + "<br>");		
		}
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
