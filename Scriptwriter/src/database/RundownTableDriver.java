package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.joda.time.Duration;

import data.Rundown;
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
			statement.executeUpdate("CREATE TABLE IF NOT EXISTS `" + databaseName +"`.`" + tableName +
					"` (`Index` INT NOT NULL," + "`StoryIndex` INT NOT NULL," + 
					" `title` TEXT NULL DEFAULT NULL, `storyType` TEXT NULL DEFAULT NULL, `cameraIntroShot` TEXT NULL DEFAULT NULL," + 
					" `cameraTagShot` TEXT NULL DEFAULT NULL, `cameraIntroNumber` INT NULL DEFAULT NULL," + 
					" `cameraTagNumber` INT NULL DEFAULT NULL, `graphicsInfo` TEXT NULL DEFAULT NULL, `notes` TEXT NULL DEFAULT NULL," + 
					" `intro` TEXT NULL DEFAULT NULL, `tag` TEXT NULL DEFAULT NULL, `storyDuration` TIME NULL DEFAULT NULL," + 
					" `mediaDuration` TIME NULL DEFAULT NULL, PRIMARY KEY (`Index`), UNIQUE INDEX `storyIndex_UNIQUE` (`storyIndex` ASC))");
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	//-----Methods
	public void insertStory(Story story, String tableName) {
		
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
			statement.executeUpdate("INSERT INTO " + tableName + " (storyIndex, title, storyType, cameraIntroShot, cameraTagShot," +
					" cameraIntroNumber, cameraTagNumber, graphicsInfo, notes, intro, tag, STime, OTime)" +
					" VALUES ('" + story.getStoryIndex() + "', '" +  story.getTitle() + "', '" + story.getStoryType() + "', '" + story.getCameraIntroShot() + "'," +
					story.getCameraTagShot() +  "', '" + story.getCameraIntroNumber() + "', '" + story.getCameraTagNumber() + "'," +
					story.getGraphicsInfo() + "', '" + story.getNotes() + "', '" + story.getIntro() + "', '" + story.getTag() +
					story.getStoryDuration() + "', '" + story.getMediaDuration() + "', )");
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		
		
	}
public void updateStory(Story story, String tableName) {
		
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
			statement.executeUpdate("UPDATE " + tableName + " SET storyIndex=" + story.getStoryIndex() + ", title=" +
					story.getTitle() + ", storyType=" + story.getStoryType() + ", cameraIntroShot=" + story.getCameraIntroShot() +
					", cameraTagShot=" + story.getCameraTagShot() + ", cameraIntroNumber=" + story.getCameraIntroNumber() +
					", cameraTagNumber=" + story.getCameraTagNumber() + ", graphicsInfo=" + story.getNotes() + ", intro=" +
					story.getIntro() + ", tag=" + story.getTag() + ", storyDuration=" + story.getStoryDuration() +
					", mediaDuration=" + story.getMediaDuration() + ";");
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		
		
	}
	public void newRundownFromTemplate(String template, String newRundown) {
			
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
			String cloneRundown = "CREATE TABLE" + newRundown + " LIKE " + template + ";";
			String cloneRundownData = "INSERT INTO " + newRundown + "SELECT * FROM " + template + ";";
			statement.executeUpdate(cloneRundown + cloneRundownData);
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	public Story getStory() {
		Story story = new Story();
		
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
			ResultSet rs = statement.executeQuery("");
			story = rsToStory(rs);
			
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		
		return story;
	}
	
	protected Story rsToStory(ResultSet rs) {
		Story story = new Story();
		try {
			
			story.setStoryIndex(rs.getInt("storyIndex"));
			story.setTitle(rs.getString("Title"));
			story.setStoryType(rs.getString("storyType"));
			story.setStoryDuration(new Duration(rs.getTime("mediaDuration")));
			story.setMediaDuration(new Duration(rs.getString("storyDuration")));
			story.setCameraIntroShot(rs.getString("cameraIntroShot"));
			story.setCameraTagShot(rs.getString("cameraTagShot"));
			story.setCameraIntroNumber(rs.getInt("cameraIntroNumber"));
			story.setCameraTagNumber(rs.getInt("cameraTagNumber"));
			story.setGraphicsInfo(rs.getString("graphicsInfo"));
			story.setNotes(rs.getString("notes"));
			story.setIntro(rs.getString("intro"));
			story.setTag(rs.getString("tag"));
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		return story;
	}
	
	public Rundown getRundown() {
		
		Rundown rundown = new Rundown();
		
		return rundown;
		
	}
	
	public int getStoryCount(String rundown) {
		
		connectionAddress = "//localhost/";
		databaseName = "scriptwriter";
		int count = 0;
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
			ResultSet rs = statement.executeQuery("SELECT COUNT(*) FROM " + rundown + ";");
			count = rs.getInt(1);
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		
		return count;
	}
	
	public String toString() {
		//TODO flesh this out
		return "This object implements a sql connection to manipulate the scriptwriter database";
	}
}