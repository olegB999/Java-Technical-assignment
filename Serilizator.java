package oleg_Lesson;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class Serilizator {
	private static final String USERS_CONFIG_PATH = "C:\\user\\users.config";
	public void serialization(List<User> userList) {
		 try
	        {   
	            //Saving of object in a file
	            FileOutputStream file = new FileOutputStream(USERS_CONFIG_PATH);
	            ObjectOutputStream out = new ObjectOutputStream(file);
	              
	            // Method for serialization of object
	            out.writeObject(userList);
	              
	            out.close();
	            file.close();
	              
	            System.out.println("UserList has been serialized");
	  
	        }
	          
	        catch(IOException ex)
	        {
	            System.out.println("IOException is caught");
	        }
	}



	public List<User> deserialization() throws InvalidObjectException{
		List<User> ul = null;
		File f = new File(USERS_CONFIG_PATH);
		if(!f.exists()) {
			return new ArrayList<User>();
		}	
		
		try
        {   
            // Reading the object from a file
            FileInputStream file = new FileInputStream(USERS_CONFIG_PATH);
            ObjectInputStream in = new ObjectInputStream(file);
              
            // Method for deserialization of object
            ul = (List<User>)in.readObject();
              
            in.close();
            file.close();
              
            System.out.println("Object has been deserialized ");            
        }
          
        catch(IOException ex)
        {
            System.out.println("IOException is caught");
        }
          
        catch(ClassNotFoundException ex)
        {
            System.out.println("ClassNotFoundException is caught");
        }
		return ul;
	}




}
