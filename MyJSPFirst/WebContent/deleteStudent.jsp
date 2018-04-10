
<%@page import="dao.StudentDao"%>  
<jsp:useBean id="mystudent" class="Student.StudentDetails"></jsp:useBean>  
<jsp:setProperty property="*" name="mystudent"/>  



<%  

StudentDao.deleteStudent(mystudent);  
response.sendRedirect("GetStudentDetails.jsp");  

%>  