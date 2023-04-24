package Demo;
import java.sql.*;
public class Tester {

	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/JSPIDER","root","root");
		Statement s=c.createStatement();
		s.execute("create table details(id integer,name varchar(50))");
		c.close();
		System.out.println("table created");
				
  
	}

}
   