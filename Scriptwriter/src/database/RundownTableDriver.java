package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import data.Story;

public class RundownTableDriver {

	//-----Connection Data Members
	static final String DRIVER = "com.mysql.jdbc.Driver";
	static final String CONNECTION_HEAD = "jdbc:mysql:";
	static final String CONNECTION_TAIL = "/;create=true";
	String connectionAddress;
	String databaseName;
	static final String USER = "test";
	static final String PASS = "Trojanvision1";
	
	
	//-----Constructors
	public RundownTableDriver() {
		String Connection = CONNECTION_HEAD + connectionAddress + databaseName + CONNECTION_TAIL;
	}
	public RundownTableDriver(String tableName) {
		
		
		connectionAddress = "//localhost:3306/";
		databaseName = "scriptwriter";
		
		String Connection = CONNECTION_HEAD + connectionAddress + databaseName + ";"; //+ CONNECTION_TAIL;
		try {
			Class.forName(DRIVER).newInstance();
		}
		catch (InstantiationException e) {
			e.printStackTrace();
		}
		catch (IllegalAccessException e) {
			e.printStackTrace();
		}
		catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		try (Connection connection = DriverManager.getConnection(Connection,USER,PASS); Statement statement = connection.createStatement()) {
			statement.executeUpdate("create table " + tableName +
					" (Story VARCHAR(32) NOT NULL PRIMARY KEY, " +
					"Type VARCHAR(32), " +
					"Note VARCHAR(32) " +
					"STime TIME() " +
					"OTime TIME())");
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
