
<%@page import="dao.StudentDao"%>  

<jsp:useBean id="mystudent" class="Student.StudentDetails"></jsp:useBean>  

<jsp:setProperty property="*" name="mystudent"/>  


<%  
int i= StudentDao.updateStudent(mystudent);  
response.sendRedirect("GetStudentDetails.jsp");  
%>  