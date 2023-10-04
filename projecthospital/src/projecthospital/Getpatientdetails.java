package projecthospital;
import java.sql.*;
public class Getpatientdetails {
	public static void main(String[]args)throws Exception {
	getData();
}
public static void getData()throws Exception{
	String url="jdbc:mysql://127.0.0.1:3306/hospital";
	String username="root";
	String password="2305";
	String Query="Select*from patient_info";
	Connection con= DriverManager.getConnection(url,username,password);
	Statement pst=con.createStatement();
	ResultSet rst=pst.executeQuery(Query);
	while(rst.next()) {
		System.out.println("Patient_name:"+rst.getString(1));
	    System.out.println("age:"+rst.getInt(2));
	    System.out.println("Gender:"+rst.getString(3));
	    System.out.println("Disease:"+rst.getString(4));
	    System.out.println("Address:"+rst.getString(5));
	    System.out.println("City:"+rst.getString(6));
	    System.out.println("Date:"+rst.getString(7));
	    System.out.println("Mob_no:"+rst.getInt(8));
	}
	con.close();

}
	
	
	
	
	
	
	
	
	
	
	
	
}
