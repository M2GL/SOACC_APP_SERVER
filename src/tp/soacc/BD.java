package tp.soacc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

//Making a static function
public class BD {

	static Connection cn = null;
	static Statement st = null;

	static Statement connect(String url, String user, String password) throws ClassNotFoundException {

		try {
			Class.forName("org.postgresql.Driver");
			cn = DriverManager.getConnection(url, user, password);
			st = cn.createStatement();
			return st;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	static ResultSet execute(String query) throws SQLException{
		return st.executeQuery(query);
	
	
		
	}

}
