package oleg_Lesson;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
public class User implements Serializable {

	private static final long serialVersionUID = 1L;
	String firstName;
	String lastName;
	String userName;
	List<Task> listTask = null;

	public User(String firstName, String lastName, String userName) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.userName = userName;
		listTask = new ArrayList<Task>();
	}

	public String getName() {
		return firstName + lastName;
	}
	
	public String getUserName() {
		return userName;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("FirstName: [").append(this.firstName).append("] LastName: [").append(this.lastName).append("] numberOfTasks: [").append(listTask.size()).append("]");
		return sb.toString();
	}

}
