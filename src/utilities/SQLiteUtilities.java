package utilities;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import dao.*;

public class SQLiteUtilities {
	private static Connection connection;
	
	public static synchronized Connection getConnection() {
		try {
			String url = "insert database url path here";
			connection = DriverManager.getConnection(url);
			System.out.println("Connection established.");
			
			if (connection.isClosed()) {
				System.out.println("Opening connection...");
				connection = DriverManager.getConnection(url);
			}
		}
		catch(SQLException e) {
			System.out.println(e.getMessage());
		}
		
		return connection;
	}
	
	//Insert DAO's here
}
