import java.sql.*;

public class Advance {
	public static void main(String[]args)throws Exception{
		insertData();
}
	public static void insertData() throws Exception {
		String url="jdbc:mysql://127.0.0.1:3306/java";
		String username="root";
		String password="2305";
		String Query="insert into student values(?,?,?)";
		Connection con=DriverManager.getConnection(url,username,password);
		PreparedStatement pst=con.PreparedStatement(Query);
		pst.setString(1,"vanmathi");
		pst.setInt(2,22);
		pst.setString(3,"vanmathivanmathi643@gmail.com");
		pst.executeupdate;
		con.close();
	}
