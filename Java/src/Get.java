import java.sql.*;
public class Get {
	public static void main(String[]args)throws Exception{
		getData();
}
	public static void getData() throws Exception {
		String url="jdbc:mysql://127.0.0.1:3306/java";
		String username="root";
		String password="2305";
		String Query="Select*from student";
		Connection con=DriverManager.getConnection(url,username,password);
		Statement pst=con.createStatement();
		ResultSet rst=pst.executeQuery(Query);
		while (rst.next()){
			System.out.println("NAME:"+rst.getString(1));
		    System.out.println("AGE:"+rst.getInt(2));
		    System.out.println("EMAIL:"+rst.getString(3));
		
		}
		con.close();
	
	}
}

	