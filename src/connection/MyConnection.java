
package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MyConnection {

	public static Connection getConnection() {

		Connection connection = null;
		try {
			var url = "jdbc:mysql://localhost:3306/XMLExercise";
			var user = "root";
			var password = "";
			connection = DriverManager.getConnection(url, user, password);
		} catch (SQLException throwable) {
			System.err.println("Error");
		}
		return connection;
	}

	public static void closeConnection(Connection c) {
		try {
			if(c!=null) {
				c.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}


}
