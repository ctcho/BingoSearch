package utilities;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseCreator {
	public static void main(String[] args) {
		//makeDatabase("inverted-index.db");
		//addTable();
	}
	
	public static void makeDatabase(String fileName) {
		String url = "jdbc:sqlite:C:\\Users\\Cameron\\sqlite\\sqlite3\\db\\" + fileName;
		try (Connection conn = DriverManager.getConnection(url)) {
            if (conn != null) {
                DatabaseMetaData meta = conn.getMetaData();
                System.out.println("The driver name is " + meta.getDriverName());
                System.out.println("A new database has been created.");
            }
            
//            try {
//				if (conn != null)
//					conn.close();
//			} catch (SQLException e) {
//				System.out.println("Could not close connection!");
//				e.printStackTrace();
//			}
 
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
	}
	
	public static void addTable() {
		String url = "jdbc:sqlite:C:\\Users\\Cameron\\sqlite\\sqlite3\\db\\inverted-index.db";
		String sql = "CREATE TABLE IF NOT EXISTS WikiPages (\n"
                + "	id integer PRIMARY KEY,\n"
                + "	url text NOT NULL,\n"
                + "	title text NOT NULL,\n"
                + " content text NOT NULL\n"
                + ");";
        
        try (Connection conn = DriverManager.getConnection(url);
                Statement stmt = conn.createStatement()) {
            // create a new table
            stmt.execute(sql);
            System.out.println("database created.");
            
            try {
				if (stmt != null)
					stmt.close();
			} catch (SQLException e) {
				System.out.println("Could not close statement!");
				e.printStackTrace();
			}
			
			try {
				if (conn != null)
					conn.close();
			} catch (SQLException e) {
				System.out.println("Could not close connection!");
				e.printStackTrace();
			}
            
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
	}
}
