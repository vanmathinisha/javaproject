package projecthospital;

import java.sql.*;

public class Insertdetails {
	public static void main(String[]args)throws Exception{
	insertdata();
}
public static void insertdata()throws Exception{
	String url="jdbc:mysql://127.0.0.1:3306/hospital";
	String username="root";
	String password="2305";
	String Query="insert into hospital_details values(?,?,?,?,?,?,?,?,?)";
	Connection con=DriverManager. getConnection(url,username,password);
	PreparedStatement pst=con.prepareStatement(Query);
	pst.setString(1,"saravanan");
	pst.setInt(2,007);
	pst.setString(3,"trichy");
	pst.setString(4,"pharmacy");
	pst.setInt(5,16);
	pst.setString(6,"Chennai" );
	pst.setString(7, "saravana");
	pst.setString(8, "sar235");
	pst.setString(9, "sara1234@gmail.com");
	pst.executeUpdate();
	con.close();
	
	
	
	
	
	
	
	
	
	
	
	
	
}

























}