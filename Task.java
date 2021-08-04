package oleg_Lesson;

import java.io.Serializable;

public class Task implements Serializable {
	
	private static final long serialVersionUID = 1L;
	String  title; 
	String	description;
	
	public Task(String title, String description) {
		this.title = title;
		this.description = description;
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Title: [").append(this.title).append("] Description: [").append(this.description).append("]");
		return sb.toString();
	}

}
