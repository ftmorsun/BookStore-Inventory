package UserDB;
/* 	Let’s write an application for User Info
Rules
You should create book id for every book. It should be start from 1000
Every book should have some information like name, author, year of publication and price
Program should start with a menu for user can pick any option
1) Add user
2) Search by book id
3) Search by any information
4) Delete by book id

5) List All Users
6) Quit
*/

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Scanner;

public class UserDB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<String, String> user = new HashMap<>();
		String option = "";
		select(option, user);

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
					addUser(hm);
					break;
				case "2":
					//getInfo(hm);
					break;
				case "3":
					//removeInfo(hm);
					break;
			}
			
		}while(true);
	}

public static void addUser(HashMap<String, String> hm)
{
	Scanner scan = new Scanner(System.in);
	String ssn="";
	do
	{
		System.out.println("Enter SSN:");
		System.out.println("To stop Enter , Please press Q:");
		ssn=scan.next();
		String ssn2=ssn;
		
			//check duplicates
			if (hm.keySet().contains(ssn)) {
				System.out.println(ssn+ "exists. Enter another ssn");
			}
			//If you need to use nextLine() after the next() please use an empty nextLine() 
			scan.nextLine();
			
			System.out.println("Enter your full name");
			String name = scan.nextLine();
			
			System.out.println("Enter your address");
			String address = scan.nextLine();
			
			System.out.println("Enter phone number (10 digits)");
			String phone = scan.nextLine();
			
			String personInfo = "Name: " + name + "\nAddress: " + address + "\nPhone: " + phone;
			
			hm.put(ssn, personInfo);
			PrintWriter writer=null;
			   try {
			        FileWriter fw=new FileWriter("src/UserDB/Users", false);
			        writer=new PrintWriter(fw);
			        
			        writer.println(hm);
			      //  writer.println(personInfo);
			    }catch(FileNotFoundException e) {
			    	 break;
			    }
			    catch(IOException e) {
			    	break;
			    }
			   writer.close();

		
	
	}while(true);
	System.out.println(hm);
			
}



}
