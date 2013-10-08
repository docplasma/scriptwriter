package data;

import java.util.Vector;

public class Rundown {
	
	//-----Data Members
	private Vector<String> columnNames;
	private Vector<String> rows;
	
	//-----Constructors
	public Rundown() {
		
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

}
