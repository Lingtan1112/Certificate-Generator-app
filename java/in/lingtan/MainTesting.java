package in.lingtan;

import java.util.ArrayList;
import java.util.Scanner;

public class MainTesting {
	
	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		UserCredentials.certificateType();
		
		System.out.println("Number of users");
		int noOfUsers= input.nextInt();
		ArrayList<String>  user =UserCredentials.addUsers(noOfUsers);
		UserCredentials.displayUsers(user);
		String deleteOrNotOption = UserCredentials.deleteOrNextOption();
		if(deleteOrNotOption.equalsIgnoreCase("x")) {
			ArrayList<String> updatedUserList = UserCredentials.deletePosition(user);
			UserCredentials.displayUsers(updatedUserList);
			UserCredentials.certificateRegistrationDetails(updatedUserList);
		}
		else if(deleteOrNotOption.equalsIgnoreCase("y")) {
			//UserCredentials.certificateRegistrationDetails(updatedUserList);
		}
		
	}

}
