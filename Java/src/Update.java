import java.sql.*;
public class Update {
	public static void main(String[]args)throws Exception{
	updatedata();
}

public static void updatedata()throws Exception {
	String url="jdbc:mysql://127.0.0.1:3306/java";
	String username="root";
	String password="2305";
	int id=23;
	String Query="update employee set NAME ='nisha' where ID=23";
	Connection con=DriverManager. getConnection(url,username,password);
	PreparedStatement pst=con.prepareStatement(Query);
	int rows=pst.executeUpdate();
	System.out.println(rows);
	con.close();
}
	
}




