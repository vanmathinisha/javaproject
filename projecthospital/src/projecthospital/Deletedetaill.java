package projecthospital;
import java.sql.*;
public class Deletedetaill{
	public static void main(String[]args)throws Exception{
		deleteData();
	}
public static void deleteData()throws Exception{
	String url="jdbc:mysql://127.0.0.1:3306/hospital";
	String username="root";
	String password="2305";
	int department_code =15;
	String Query="delete from hospital_details where department_code =15";
	Connection con=DriverManager. getConnection(url,username,password);
	PreparedStatement pst=con.prepareStatement(Query);
	int rows=pst.executeUpdate();
	System.out.println(rows);
	con.close();
}

}
