import java.sql.*;
public class Insertinsql {
public static void main(String[]args)throws Exception{
	insertData();
}

public static void insertData()throws Exception {
	String url="jdbc:mysql://127.0.0.1:3306/java";
	String username="root";
	String password="2305";
	String Query="insert into employee values (?,?,?,?)";
	Connection con=DriverManager. getConnection(url,username,password);
	PreparedStatement pst=con.prepareStatement(Query);
	pst.setString(1,"vanmathinisha");
	pst.setString(2,"TNAGAR");
	pst.setString(3,"Chennai");
	pst.setInt(4,23);
	pst.setString(1,"nisha");
	pst.setString(2,"vallioor");
	pst.setString(3,"tirunelveli");
	pst.setInt(4,235);
	pst.executeUpdate();
	con.close();
}
	
}
