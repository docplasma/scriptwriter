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
	static final String CONNECTION_TAIL = ";create=true";
	String connectionAddress;
	String databaseName;
	static final String USER = "editor";
	static final String PASS = "Trojanvision1";
	
	
	//-----Constructors
	public RundownTableDriver() {
		String connection = CONNECTION_HEAD + connectionAddress + databaseName + CONNECTION_TAIL;
	}
	public RundownTableDriver(String tableName) {
		
		
		connectionAddress = "//localhost/";
		databaseName = "scriptwriter";
		
		String connection = CONNECTION_HEAD + connectionAddress + databaseName + "?user=" + USER + "&password=" + PASS;
	
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
		try (Connection con = DriverManager.getConnection(connection); Statement statement = con.createStatement()) {
			statement.executeUpdate("CREATE TABLE IF NOT EXISTS `" + databaseName +"`.`" + tableName + "` (`StoryIndex` INT(11) NOT NULL," +
					" `Story` TEXT NULL DEFAULT NULL, `Type` TEXT NULL DEFAULT NULL, `Note` TEXT NULL DEFAULT NULL," + 
					" `STime` TIME NULL DEFAULT NULL, `OTime` TIME NULL DEFAULT NULL, PRIMARY KEY (`StoryIndex`))");
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	//-----Methods
	public void insertStory(Story story) {
		//TODOs
	}
}
