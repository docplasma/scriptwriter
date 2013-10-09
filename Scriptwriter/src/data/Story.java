package data;

import java.util.Vector;

import org.joda.time.Duration;

public class Story {

	//-----Data members
	private int storyIndex;
	private String title;
	private String storyType;
	private Duration storyDuration;
	private Duration mediaDuration;
	private String cameraIntroShot;
	private String cameraTagShot;
	private int cameraIntroNumber;
	private int cameraTagNumber;
	private String graphicsInfo;
	private String notes;
	private String intro;
	private String tag;
	private StringBuilder sb;

	//-----Constructors
	public Story() {
		String title = "Generic Story";
		storyType = "PKG";
		//storyDuration;
		//mediaDuration;
		cameraIntroShot = "KEYSHOT";
		cameraTagShot = "KEYSHOT";
		cameraIntroNumber = 1;
		cameraTagNumber = 1;
		graphicsInfo = "";
		notes = "";
		intro = "Place the story introduction here.";
		tag = "Place the story tag here.";
	}
	//-----Getters/Setters
	
	public int getStoryIndex() {
		return storyIndex;
	}

	public void setStoryIndex(int storyIndex) {
		this.storyIndex = storyIndex;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getStoryType() {
		return storyType;
	}

	public void setStoryType(String storyType) {
		this.storyType = storyType;
	}
	
	public Duration getStoryDuration() {
		return storyDuration;
	}

	public void setStoryDuration(Duration storyDuration) {
		this.storyDuration = storyDuration;
	}

	public Duration getMediaDuration() {
		return mediaDuration;
	}

	public void setMediaDuration(Duration mediaDuration) {
		this.mediaDuration = mediaDuration;
	}

	public String getCameraIntroShot() {
		return cameraIntroShot;
	}

	public void setCameraIntroShot(String cameraIntroShot) {
		this.cameraIntroShot = cameraIntroShot;
	}

	public String getCameraTagShot() {
		return cameraTagShot;
	}

	public void setCameraTagShot(String cameraTagShot) {
		this.cameraTagShot = cameraTagShot;
	}

	public int getCameraIntroNumber() {
		return cameraIntroNumber;
	}

	public void setCameraIntroNumber(int cameraIntroNumber) {
		this.cameraIntroNumber = cameraIntroNumber;
	}

	public int getCameraTagNumber() {
		return cameraTagNumber;
	}

	public void setCameraTagNumber(int cameraTagNumber) {
		this.cameraTagNumber = cameraTagNumber;
	}

	public String getGraphicsInfo() {
		return graphicsInfo;
	}

	public void setGraphicsInfo(String graphicsInfo) {
		this.graphicsInfo = graphicsInfo;
	}

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	public String getIntro() {
		return intro;
	}

	public void setIntro(String intro) {
		this.intro = intro;
	}

	public String getTag() {
		return tag;
	}

	public void setTag(String tag) {
		this.tag = tag;
	}
	
	//-----Methods
	
	public Vector<String> toStoryVector() {
		Vector<String> story = new Vector<String>();
		
		//TODO Implement conversion of fields to a vector
		
		return story;
		
	}
	
	public Vector<String> toRundownVector() {
		Vector<String> story = new Vector<String>();
		
		//TODO Implement conversion of fields to a vector
		
		return story;
		
	}
	
	public String toString() {
		sb = new StringBuilder();
		sb.append(getTitle());
		sb.append("/n");
		sb.append(getStoryType());
		sb.append("/n");
		//sb.append(getStoryDuration());
		//sb.append("/n");
		return sb.toString();
	}
	
}
