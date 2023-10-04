package projecthospital;
import java.sql.*;
public class Insertpatientdetails {
	public static void main (String[]args)throws Exception{
		insertData();
}
public static void insertData()throws Exception{
	String url="jdbc:mysql://127.0.0.1:3306/hospital";
	String username="root";
	String password="2305";
	String Query="insert into patient_info values(?,?,?,?,?,?,?,?)";
	Connection con=DriverManager. getConnection(url,username,password);
	PreparedStatement pst=con.prepareStatement(Query);
	pst.setString(1,"Zara");
	pst.setInt(2,15);
	pst.setString(3,"F");
	pst.setString(4,"cold,cough");
	pst.setString(5,"01/100,north street,perambur");
	pst.setString(6,"Chennai" );
	pst.setString(7, "2023-12-17");
	pst.setInt(8,68590832);
	pst.executeUpdate();
	con.close();
}

}
