package oleg_Lesson;

import java.io.InvalidObjectException;
import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {

		List<User> userList =null;
		Serilizator serilizator = new Serilizator();
		try {
			userList = serilizator.deserialization();
		} catch (InvalidObjectException e) {
			e.printStackTrace();
		}


		showAllUsers(userList);
		User user = new User("Oleg", "Bojic", "boleg");
		addUserToUserList(user, userList);
		Task task1 = new Task("Read", "Read all");
		showAllUsers(userList);
		
		


		serilizator.serialization(userList);






	}

	

	private static void addUserToUserList(User user, List<User> userList) {
		if(user.getUserName()!=null) {
			for(int i=0; i<userList.size();i++) {
				if(user.getUserName().equals(userList.get(i).getUserName())) {
					throw new RuntimeException("Such User name ["+ user.getUserName() +"] already exists ") ;



				}
			}
			userList.add(user);	
		}


	}


	private static void showAllUsers(List<User> userList) {
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<userList.size();i++) {
			sb.append(userList.get(i).toString()).append("\n");
		}

		System.out.println(sb.toString());

	}


}
