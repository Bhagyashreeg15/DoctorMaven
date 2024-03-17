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
import org.doctorapp.model.SpecializationEnum;
import org.doctorapp.service.*;

@WebServlet("/addServlet")
public class AddServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private IDoctorService doctorService = new DoctorServiceImpl();

	public AddServlet() {
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		
		response.setContentType("text/html");
		
		Doctor doctor = new Doctor();

		String doctorName = request.getParameter("doctorName");

		String speciality = request.getParameter("speciality");

		String docFees = request.getParameter("doctorFees");
		Double doctorFees = Double.parseDouble(docFees);

		String docRatings = request.getParameter("doctorRatings");
		int doctorRatings = Integer.parseInt(docRatings);

		String docExperience = request.getParameter("doctorExperience");
		int doctorExperience = Integer.parseInt(docExperience);

		SpecializationEnum specialization = SpecializationEnum.valueOf(speciality.toUpperCase());
		String spec = specialization.getSpeciality();

		doctor.setDoctorName(doctorName);
		doctor.setSpeciality(spec);
		doctor.setFees(doctorFees);
		doctor.setRatings(doctorRatings);
		doctor.setExperience(doctorExperience);
		System.out.println(doctor);

		doctorService.addDoctor(doctor);
		
		PrintWriter writer = response.getWriter();
		RequestDispatcher dispatcher = request.getRequestDispatcher("adminDash.jsp");
		dispatcher.include(request, response);
		
		writer.print("<p>Doctor data added successfully</p>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

}
