package com.docplasma.rundownmultiview.data;

public class Story {
	
	//-----Data Members
	String name;
	String type;
	String note;
	String directorNotes;
	
	Story() {
		
	}

	
	//-----Getters/Setters
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}

	/**
	 * @param type the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}

	/**
	 * @return the note
	 */
	public String getNote() {
		return note;
	}

	/**
	 * @param note the note to set
	 */
	public void setNote(String note) {
		this.note = note;
	}

	/**
	 * @return the directorNotes
	 */
	public String getDirectorNotes() {
		return directorNotes;
	}

	/**
	 * @param directorNotes the directorNotes to set
	 */
	public void setDirectorNotes(String directorNotes) {
		this.directorNotes = directorNotes;
	}
	
}
