package database;

public class CreateRundownTable {

	
	
	CreateRundownTable(String tableName) {
		
		final String DRIVER = "com.mysql.jdbc.Driver";
		final String CONNECTION_HEAD = "jdbc:mysql://localhost/";
		final String CONNECTION_TAIL = ";create=true";
		
		String Connection = CONNECTION_HEAD + tableName + CONNECTION_TAIL;
		try {
			
		}
		catch {
			
		}
		
	}
}
