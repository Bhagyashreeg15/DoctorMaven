<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add Doctor</title>
</head>
<body>
<h2>Add Doctor Details</h2>
	<form action="addServlet">
		Enter Doctor Name <input type="text" name="doctorName"> <br>
		<br> Enter Doctor Speciality <select name="speciality">
			<option></option>
			<option value="gynaec">GYNAECOLOGIST</option>
			<option value="derma">DERMATOLOGIST</option>
			<option value="physician">GENERAL PHYSICIAN</option>
			<option value="ortho">ORTHOPAEDIC</option>
			<option value="pedia">PEDIATRICIAN</option>
			<option value="neuro">NEUROLOGIST</option>
		</select> <br> <br> 
		Enter Doctor Fees <input type="text" name="doctorFees"> <br> <br> 
		Enter Doctor Ratings <input type="text" name="doctorRatings"> <br> <br> 
		Enter Doctor Experience <input type="text" name="doctorExperience"> <br> <br>
		<input type = "submit" value = "Submit">
	</form>
</body>
</html>