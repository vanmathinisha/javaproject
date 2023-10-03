import java.sql.*;
public class Delete {
	public static void main(String[]args)throws Exception{
		deletedata();
	}
	public static void deletedata() throws Exception {
		String url="jdbc:mysql://127.0.0.1:3306/java";
		String username="root";
		String password="2305";
		int id=3;
		String Query="delete from employee id where ID=3";
		Connection con=DriverManager. getConnection(url,username,password);
		PreparedStatement pst=con.prepareStatement(Query);
		int ID=pst.executeUpdate();
		System.out.println(ID);
		con.close();
	}
}

