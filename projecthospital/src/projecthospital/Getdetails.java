package projecthospital;
import java.sql.*;
public class Getdetails {
	public static void main(String[]args)throws Exception{
		getdata();
	}
public static void getdata()throws Exception{
	String url="jdbc:mysql://127.0.0.1:3306/hospital";
	String username="root";
	String password="2305";
	String Query="Select*from hospital_details";
	Connection con= DriverManager.getConnection(url,username,password);
	Statement pst=con.createStatement();
	ResultSet rst=pst.executeQuery(Query);
	while(rst.next()) {
		System.out.println("Docters_name:"+rst.getString(1));
	    System.out.println("Docters_id:"+rst.getInt(2));
	    System.out.println("Branch:"+rst.getString(3));
	    System.out.println("Department:"+rst.getString(4));
	    System.out.println("Department_code:"+rst.getInt(5));
	    System.out.println("City:"+rst.getString(6));
	    System.out.println("Username:"+rst.getString(7));
	    System.out.println("Password:"+rst.getString(8));
	    System.out.println("Email:"+rst.getString(9));
	}
	con.close();

}
		
	
	
}

