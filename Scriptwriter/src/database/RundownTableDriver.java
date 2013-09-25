package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import data.Story;

public class RundownTableDriver {

	
	
	RundownTableDriver(String tableName, Story story) {
		
		final String DRIVER = "com.mysql.jdbc.Driver";
		final String CONNECTION_HEAD = "jdbc:mysql://";
		final String CONNECTION_TAIL = "/;create=true";
		String connectionAddress = "localhost";
		
		String Connection = CONNECTION_HEAD + connectionAddress + tableName + CONNECTION_TAIL;
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
		try (Connection connection = DriverManager.getConnection(Connection); Statement statement = connection.createStatement()) {
			statement.executeUpdate("create table " + tableName +
					" (Story VARCHAR(32) NOT NULL PRIMARY KEY, " +
					"Type VARCHAR(32), " +
					"Note VARCHAR(32) " +
					"STime TIME() " +
					"OTime TIME())");
			statement.executeUpdate("insert into " + tableName + " ");
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
