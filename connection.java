package Mini_project;
import java.sql.*;

import javax.swing.JOptionPane;
public class connection {                            //class for setting connection
	public Connection get_connection() {
		String driver = "com.mysql.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/miniprojectjava?useSSL=false";
		String username = "root";		//user name of MySQL
		String password = "Garvita@25";	//password of MySQL
		Connection con = null;
		try
		{
			Class.forName(driver);
		}catch(Exception e){JOptionPane.showMessageDialog(null, "Database loading failed");}
	
		try 
	     {
	         con = DriverManager.getConnection(url, username, password);
	     } 
	     catch (Exception e) 
	     {
	         // TODO Auto-generated catch block
	         e.printStackTrace();
	     }
	    return con;
	    }
	}

   