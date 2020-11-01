package DataEntry;
import java.util.*;

public class DataEntryMap {
	/*
	 Create saveInfo() method
	 1)Get multiple ssn(9 digits), full name, address, phone number from user.
	 2)Put data into a map like; ssn will be key, all the other informations will be value
	 3)If user tries to use repeated ssn, give an error message and ask user to enter a new ssn
	 4)Tell user to stop entrance by pressing "Q"
	*/
	
	/*
	 Create getInfo() method
	 1)Get personal information by using SSN
	 2)If SSN does not exist, give an error message then ask user to enter again 
	*/
	
	/*
	 Create removeInfo() method
	 1)Remove data by using SSN
	 2)If SSN does not exist give a message to the user, and ask him to enter again
	 3)If the map is empty, give a message to the user and end the program.
	*/
	public static void main(String[] args) {
		HashMap<String, String> hm = new HashMap<>();
		String option = "";
		select(option,hm);
	}
    
	//write to file : "Users"
 
	
	//save the date inside the map
	public static void saveInfo(HashMap<String, String> hm)
	{
		Scanner scan = new Scanner(System.in);
		String ssn="";
		do
		{
			System.out.println("Enter SSN:");
			System.out.println("To stop Enter , Please press Q:");
			ssn=scan.next();
			if (ssn.equalsIgnoreCase("Q"))
			{
				break;
			}
			else
			{
				//check duplicates
				while (hm.keySet().contains(ssn)) {
					System.out.println(ssn+ "exists. Enter another ssn");
				     ssn=scan.next();
				}
				//If you need to use nextLine() after the next() please use an empty nextLine() 
				scan.nextLine();
				
				System.out.println("Enter your full name");
				String name = scan.nextLine();
				
				System.out.println("Enter your address");
				String address = scan.nextLine();
				
				System.out.println("Enter phone number (10 digits)");
				String phone = scan.nextLine();
				
				String personInfo = "\nName: " + name + "\nAddress: " + address + "\nPhone: " + phone;
				
				hm.put(ssn, personInfo);

			}
		
		}while(true);
		System.out.println(hm);
				
	}
    
	//retrieve the data
	public static void getInfo(HashMap<String, String> hm) {
		
		Scanner scan = new Scanner(System.in);
		String ssn = "";
		
		do {
			System.out.println("Enter SSN to get detailed information");
			System.out.println("To stop entrance press 'Q'");
			ssn = scan.next();
			
			if(ssn.equalsIgnoreCase("Q")) {
				break;
			}
			if(hm.isEmpty()) {
				System.out.println("There is no any data to display");
				break;
			}else if(hm.containsKey(ssn)) {
				String personInfo = hm.get(ssn);
				System.out.println(ssn + " has following data:\n" + personInfo);
			}else {
				System.out.println(ssn + " is not valid ssn. Please enter a valid ssn.");
			}
			
			
		}while(true);
		
	}
	
		
	public static void select(String option, HashMap<String, String> hm) {
		
		Scanner scan = new Scanner(System.in);
		
		do {
			
			System.out.println("Select option (1-2-3)");
			System.out.println("1: Add data\n2: Get data\n3:Delete data");
			System.out.println("To end the program press'Q'");
			option = scan.next();
			if(option.equalsIgnoreCase("Q")) {
				break;
			}
			switch(option) {
				case "1":
					saveInfo(hm);
					break;
				case "2":
					getInfo(hm);
					break;
				case "3":
					removeInfo(hm);
					break;
			}
			
		}while(true);
	}

	
public static void removeInfo(HashMap<String, String> hm) {
		
		Scanner scan = new Scanner(System.in);
		String ssn = "";
		
		do {
			System.out.println("Enter SSN to remove data");
			System.out.println("To stop removing press 'Q'");
			ssn = scan.next();
			if(ssn.equalsIgnoreCase("Q")) {
				break;
			}
			if(hm.isEmpty()) {
				System.out.println("There is no any data to remove");
				break;
			}else if(hm.containsKey(ssn)) {
				String removedData = hm.remove(ssn);
				System.out.println("Removed Data:\n" + removedData);
			}else {
				System.out.println(ssn + " is not valid. Please enter a valid SSN");
			}	
		}while(true);
		
		System.out.println(hm);
	}

	}
