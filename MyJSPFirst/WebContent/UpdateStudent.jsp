<!DOCTYPE html>  
<html>  
<head>  
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">  
<title>Update Student....</title>  
</head>  
<body>  
<%@page import="dao.StudentDao,Student.StudentDetails"%>  
  
<%  
String StudentID = request.getParameter("studentID");  
StudentDetails mystudent = StudentDao.getStudentByID(Integer.parseInt(StudentID));  
%>  
  
<h1>Update Form</h1>  

<form action="editStudent.jsp" method="post">  

<input type="hidden" name="studentID" value="<%=mystudent.getStudentID() %>"/>  

<table>  
<tr>
	<td>FirstName:</td>
	<td> <input type="text" name="firstName" value="<%= mystudent.getFirstName()%>"/></td>
</tr>
  
<tr>
	<td>LastName:</td>
	<td> <input type="text" name="lastName" value="<%= mystudent.getLastName()%>"/></td>
</tr>  

<tr>
	<td>Email:</td>
	<td> <input type="email" name="email" value="<%= mystudent.getEmail()%>"/></td>
</tr>  

<tr>
	<td>Branch:</td>
	<td> <input type="text" name="branch" value="<%= mystudent.getBranch()%>"/></td>
</tr>  

<tr>
	<td>Phone:</td>
	<td> <input type="text" name="phone" value="<%= mystudent.getPhone()%>"/></td>
</tr> 

<tr><td colspan="2"><input type="submit" value="Edit Student"/></td></tr>  
</table>  
</form>  
  
</body>  
</html>  