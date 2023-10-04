package projecthospital;
import java.sql.*;
public class Updatedetails {
	public static void main (String[]args)throws Exception{
		updatedata();
		
	}
	public static void updatedata()throws Exception{
		String url="jdbc:mysql://127.0.0.1:3306/hospital";
		String username="root";
		String password="2305";
		int department_code=12;
		String Query="update hospital_details set Branch='Trisulam' where department_code =12";
		Connection con=DriverManager. getConnection(url,username,password);
		PreparedStatement pst=con.prepareStatement(Query);
		int rows=pst.executeUpdate();
		System.out.println(rows);
		con.close();
		
	}

}
