<!DOCTYPE html>  
  
<html>  
<head>  
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">  
<title>View Students...</title>  
</head>  
<body>  
  
<%@page import="dao.StudentDao,Student.StudentDetails,java.util.*"%> 
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>


<h1>Students List</h1>  
  
<%  
List<StudentDetails> list=StudentDao.getAllStudentDetails();  
request.setAttribute("list",list);  
%>  
  
<table >  
<tr><th>StudentID</th>
    <th>FirstName</th>
    <th>LastName</th>
    <th>Email</th>  
    <th>Branch</th>
    <th>Phone</th>
    <th>Edit?</th>
    <th>Delete?</th>
</tr>  
<c:forEach items="${list}" var="mystudent">  
<tr><td>${mystudent.getStudentID()}</td>
    <td>${mystudent.getFirstName()}</td>
    <td>${mystudent.getLastName()}</td>  
    <td>${mystudent.getEmail()}</td>
    <td>${mystudent.getBranch()}</td>
    <td>${mystudent.getPhone()}</td>  
  

<td><a href="UpdateStudent.jsp?studentID=${mystudent.getStudentID()}">Edit</a></td>
<td><a href="deleteStudent.jsp?studentID=${mystudent.getStudentID()}">Delete</a></td>  

</tr>
</c:forEach>  

</table>  
  
  
</body>  
</html>  