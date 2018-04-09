package dao;

import java.util.*;

import Student.StudentDetails;

import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class StudentDao {

	public static Connection getConnection(){  
	    Connection con=null;  
	    try{  
	        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");  
	        con=DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=JavaTrain;", "sa", "root" );  
	    }catch(Exception e){System.out.println(e);}  
	    return con;  
	}
	    
	public static List<StudentDetails> getAllStudentDetails(){  
	    List<StudentDetails> list=new ArrayList<StudentDetails>();  
	      
	    try{
	    	Connection con= getConnection();  
	        PreparedStatement ps=con.prepareStatement("select * from tblStudent");  
	        ResultSet rs=ps.executeQuery();  
	        while(rs.next()){  
	        	StudentDetails mystudent=new StudentDetails();  
	            mystudent.setStudentID(rs.getInt("StudentID"));  
	            mystudent.setFirstName(rs.getString("FirstName"));  
	            mystudent.setLastName(rs.getString("LastName"));  
	            mystudent.setEmail(rs.getString("Email"));  
	            mystudent.setBranch(rs.getString("Branch"));  
	            mystudent.setPhone(rs.getString("Phone"));  
	            list.add(mystudent);  
	        } 
	     ps.close();
	     con.close();
	          
	    }catch(Exception e){System.out.println(e);}  
	    return list;  
	} 
	

	
	public void CreateStudent(StudentDetails mystudent) {
		//int StatusOfInsertion = 0;
		try{  
			Connection con=getConnection();  
	        PreparedStatement ps=con.prepareStatement("Insert INTO tblStudent(FirstName, LastName, Email, Branch, Phone) Values (?,?,?,?,?)");  
	        ps.setString(1, mystudent.FirstName);  
	        ps.setString(2, mystudent.LastName);  
	        ps.setString(3, mystudent.Email);  
	        ps.setString(4, mystudent.Branch);  
	        ps.setString(5, mystudent.Phone);
	        ps.executeUpdate();
	        //StatusOfInsertion = ps.executeUpdate(); 
	        
	        /*ps.close();
		     con.close();*/
	    }
		catch(Exception e){System.out.println(e);}  
	    //return StatusOfInsertion;  
	}
}
