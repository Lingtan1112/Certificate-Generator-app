package in.lingtan;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class UserCredentials {
	static Scanner input = new Scanner(System.in);
	public static boolean digitsVerification(long number) {
		boolean isLengthValid = false;
		int length = String.valueOf(number).length();
		if(length == 10) {
			isLengthValid = true;
		}
		return isLengthValid;
	}
	
	public static boolean usernameVerification(long number) {
		boolean isValid = false;
		if(number == 9600923846l) {
			isValid = true;
		}		
	return isValid;		
	}
	
	public static boolean passwordLengthVerification(String password) {
		boolean isLengthValid = false;
		int length = String.valueOf(password).length();
		if(length >= 6) {
			isLengthValid = true;
		}
		return isLengthValid;
		
	}
	
	public static boolean passwordVerification(String password) {
		boolean isValid = false;
		if(password == ("Lingtan123")) {
			isValid = true;
		}		
	return isValid;		
	}
	
	public static void certificateChoiceList() {
		ArrayList<String> paperTypeList = new ArrayList<String>();
		paperTypeList.add("A4 size Certificate - Rs.100/copy");
		paperTypeList.add("A5 size Certificate - Rs.50/copy");
		paperTypeList.add("A6 size Certificate - Rs.25/copy");
		for(String paperType : paperTypeList) {
			System.out.println(paperType);
		}
		
	}
	
	public static int certificateSelection(String paperType) {
		int paperPrice = 0;
		//System.out.println(paperType);
		switch(paperType) {
		case "1":
			paperPrice = 100;
			break;
		case "2":
			paperPrice = 50;
			break;
		case "3":
			paperPrice = 25;
			break;
		}
	return paperPrice;
}
	
	public static void certificateType() {
		ArrayList<String> certificateType = new ArrayList<String>();
		certificateType.add("1.Participation Certificate");
		certificateType.add("2.Winning Certificate");
		for(String type : certificateType) {
			System.out.println(type);
		}
	}
	
	public static ArrayList<String> addUsers(int sizeOfArray) {
		Scanner input = new Scanner(System.in);
		ArrayList<String> createUsers = new ArrayList<String>();
		for(int i=0; i<sizeOfArray; i++) {
			System.out.println("Enter the UserName "+(i+1));
			String user = input.next();			
			createUsers.add(user);
		}
		return createUsers;	
		}
	
	public static void displayUsers(ArrayList<String> usersList) {
		int i=1;
		for(String userDisplay : usersList) {
			System.out.println(i +" . "+ userDisplay);
			i++;
		}
		
		
	}
	public static String deleteOrNextOption() {
		System.out.println("Press 'x' to delete a item\nPress 'y' to next page ");
		System.out.println("Enter an option");
		String deleteOrNotOption = input.next();
	return deleteOrNotOption;
	}
	public static ArrayList<String> deletePosition(ArrayList<String> userListToDelete) {
		System.out.println("Enter the number position to delete");
		int position = input.nextInt();
		ArrayList<String> updatedUserList = deleteUser(userListToDelete,position);
		return updatedUserList;
						
	}
	public static ArrayList<String> deleteUser(ArrayList<String> userListToDelete, int position){
		userListToDelete.remove(position-1);
		return userListToDelete;
		
	}
	public static void certificateRegistrationDetails(ArrayList<String> updatedUserList) {
		ArrayList<String> filledDatasAlone1 = new ArrayList<String>();
		ArrayList<String> filledDatasAlone2 = new ArrayList<String>();
		ArrayList<String> filledDatasAlone3 = new ArrayList<String>();
		String[] dataFields = certificationFields();
		int i=0;
		for(String individualName : updatedUserList) {
			System.out.println("Enter the data for "+individualName);
			for( String dataField :dataFields ) {
				System.out.println("Enter the "+dataField);
				String dataForField = input.next();
				if(i==0) {
					filledDatasAlone1.add(dataForField);
				}
				else if(i==1){
					filledDatasAlone2.add(dataForField);
				}
				else if(i==2) {
					filledDatasAlone3.add(dataForField);
				}
				
			}
			i++;
		}
		System.out.println(filledDatasAlone1+""+filledDatasAlone2+""+filledDatasAlone3);
	}
	public static String[] certificationFields() {
		HashMap<String,String> UserDetailFields = new HashMap<String,String>();
		String[] dataFields = {"Gender", "Position","Event-Name", "Event-Time(HH:MM)","Event-Date(YYYY-MM-DD)", "Institution-Name"};	
		return dataFields;
		
	}
	
}