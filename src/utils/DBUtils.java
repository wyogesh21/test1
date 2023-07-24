package utils;

import java.sql.*;

public class DBUtils {
	private static Connection cn;

	// write static method to open db connection
	public static Connection openConnection() throws SQLException {
		String url = "jdbc:mysql://ContainerTest1:33606/dbtest1?useSSL=false&allowPublicKeyRetrieval=true";
		cn = DriverManager.getConnection(url, "root", "1234");
		return cn;
	}
	//add a static method to close DB connection
	public static void closeConnection() throws SQLException
	{
		if(cn != null)
			cn.close();
		System.out.println("db cn closed!");
	}
}
