package Student;

import dao.StudentDao;

/*import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;*/

public class StudentDetails {

	public int StudentID;
	public String FirstName;
	public String LastName;
	public String Email;
	public String Branch;
	public String Phone;
	
	public int getStudentID() {
		return StudentID;
	}
	public void setStudentID(int studentID) {
		StudentID = studentID;
	}
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getBranch() {
		return Branch;
	}
	public void setBranch(String branch) {
		Branch = branch;
	}
	public String getPhone() {
		return Phone;
	}
	public void setPhone(String phone) {
		Phone = phone;
	}
	
	
	/*public static void main(String[] args) {
		try{
	    	Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
	        Connection con=DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=JavaTrain;", "sa", "root" );  
	        PreparedStatement ps=con.prepareStatement("Insert INTO tblStudent(StudentID, FirstName, LastName, Email, Branch, Phone) Values (?,?,?,?,?,?)");  
	        ps.setString(1, StudentDetails.getStudentID)
	        ResultSet rs=ps.executeQuery();
	        while(rs.next()){  
	        	
	        	String userdata = rs.getInt(1) + ";" + rs.getString(2) + ";" + rs.getString(3) + ";" + rs.getString(4) + ";" + rs.getString(5) + ";" + rs.getString(6);
	        	System.out.println(userdata);
	        	StudentDetails mystudent=new StudentDetails();  
	            mystudent.setStudentID(rs.getInt("StudentID"));  
	            mystudent.setFirstName(rs.getString("FirstName"));  
	            mystudent.setLastName(rs.getString("LastName"));  
	            mystudent.setEmail(rs.getString("Email"));  
	            mystudent.setBranch(rs.getString("Branch"));  
	            mystudent.setPhone(rs.getString("Phone"));  
	            //list.add(mystudent);  
	       // }      
	     ps.close();
	     con.close();
	        
	    }catch(Exception e){System.out.println(e);}  
	    //return list;  
	}*/
	
	public static void main(String[] args) {
		StudentDao dao = new StudentDao();
		StudentDetails s1 = new StudentDetails();
		s1.FirstName = "HJFJ";
		s1.LastName = "jggjh";
		s1.Email = "jhvajh@email.com";
		s1.Branch = "hft";
		s1.Phone = "5256";
		StudentDao.getConnection();
		dao.CreateStudent(s1);
	}
	}


