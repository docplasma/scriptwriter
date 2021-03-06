package data;

import java.util.Vector;

public class Rundown {
	
	//-----Data Members
	private Vector<String> columnNames;
	private Vector<String> rows;
	int numColumns;
	int numRows;
	
	//-----Constructors
	public Rundown() {
		columnNames = new Vector<String>();
		
		//Column Names
		columnNames.add("Story");
		columnNames.add("Type");
		columnNames.add("Note");
		columnNames.add("Story Time");
		columnNames.add("RT");
		columnNames.add("OT");
		
	}
	
	public Rundown(Vector<String> rows) {
		this.rows = rows;
		
		columnNames = new Vector<String>();
		
		//Column Names
		columnNames.add("Story");
		columnNames.add("Type");
		columnNames.add("Note");
		columnNames.add("Story Time");
		columnNames.add("RT");
		columnNames.add("OT");
		
	}
	
	public Rundown(Vector<String> columnNames, Vector<String> rows) {
		this.columnNames = columnNames;
		this.rows = rows;
	}

	//-----Getters/Setters
	public Vector<String> getColumnNames() {
		return columnNames;
	}

	public void setColumnNames(Vector<String> columnNames) {
		this.columnNames = columnNames;
	}

	public Vector<String> getRows() {
		return rows;
	}

	public void setRows(Vector<String> rows) {
		this.rows = rows;
	}

	public int getNumColumns() {
		return numColumns;
	}

	public void setNumColumns(int numColumns) {
		this.numColumns = numColumns;
	}

	public int getNumRows() {
		return numRows;
	}

	public void setNumRows(int numRows) {
		this.numRows = numRows;
	}

}
