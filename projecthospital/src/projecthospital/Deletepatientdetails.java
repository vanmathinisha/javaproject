package projecthospital;
import java.sql.*;
public class Deletepatientdetails{
	public static void main(String[]args)throws Exception{
    DeleteData();
}
public static void DeleteData()throws Exception {
	String url="jdbc:mysql://127.0.0.1:3306/hospital";
	String username="root";
	String password="2305";
	int AGE=06;
	String Query="delete from PATIENT_INFO Where Age=06";
	Connection con=DriverManager. getConnection(url,username,password);
	PreparedStatement pst=con.prepareStatement(Query);
	int rows=pst.executeUpdate();
	System.out.println(rows);
	con.close();
}
}