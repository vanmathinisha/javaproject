package projecthospital;
import java.sql.*;
public class Updatepatientdetails{
	public static void main (String[]args)throws Exception{
	updateData();
}
	public static void updateData()throws Exception{
		String url="jdbc:mysql://127.0.0.1:3306/hospital";
		String username="root";
		String password="2305";
		int age=15;
		String Query="update patient_info set disease='stomach pain' where age =15";
		Connection con=DriverManager. getConnection(url,username,password);
		PreparedStatement pst=con.prepareStatement(Query);
		int rows=pst.executeUpdate();
		System.out.println(rows);
		con.close();
		
	}
}
