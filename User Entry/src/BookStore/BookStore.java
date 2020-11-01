package BookStore;

import java.util.HashMap;
import java.util.Scanner;

public class BookStore {
	/*---------------------------------------------------------------------------------------*/
	//BookSore objects property
	public static int bookid=1000;
	private int id;
	private String name;
	private String author;
	private String publish;
	private double price;
	
	/*---------------------------------------------------------------------------------------*/
	/**
	 * @param name
	 * @param author
	 */
	public BookStore(int id, String name, String author) {
		super();
		this.id=id;
		this.name = name;
		this.author = author;
		bookid++;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
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
	 * @return the author
	 */
	public String getAuthor() {
		return author;
	}
	/**
	 * @param author the author to set
	 */
	public void setAuthor(String author) {
		this.author = author;
	}
	/**
	 * @return the publish
	 */
	public String getPublish() {
		return publish;
	}
	/**
	 * @param publish the publish to set
	 */
	public void setPublish(String publish) {
		this.publish = publish;
	}
	/**
	 * @return the price
	 */
	public double getPrice() {
		return price;
	}
	/**
	 * @param price the price to set
	 */
	public void setPrice(double price) {
		this.price = price;
	}
	
	
	/*---------------------------------------------------------------------------------------*/
	
	//Create a HashMap of Book Objects and use menu method to interact with it.
	public static void main(String[] args)
	{
		HashMap <Integer, BookStore> myStore = new HashMap<>();            
         
		menu(myStore);
	}
	
	/*---------------------------------------------------------------------------------------*/
	//Create a selection menu
	public static void menu(HashMap<Integer, BookStore> myStore) {
			
			Scanner scan = new Scanner(System.in);
			
			do {
				
				System.out.println("Choose an option to proceed");
				System.out.println("1: Add a book \n"+
				"2: Search by book id\n"+
				"3: Search by any information\n"+
				"4: Delete by book id\n"+
				"5: List all books\n"+
				"6:Quit");
				
				int option = scan.nextInt();
				
				switch(option) {
					case 1:
						addBook(myStore);
						break;
					case 2:
						searchByID(myStore);
						break;
					case 3:
						searchByAny(myStore);
						break;
					case 4:
						deleteByID(myStore);
						break;
					case 5:
						listAll(myStore);
						break;
					case 6:
						break;

				}
				
			}while(true);
		}
	/*---------------------------------------------------------------------------------------*/
	//Search a  book to Store with Name and Author of the Book
	private static void searchByID( HashMap<Integer, BookStore> myStore) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter an id to search: ");
		int idbook=scan.nextInt();
		System.out.println(idbook);
		if (myStore.containsKey(idbook))
		{
			System.out.println(myStore.get(idbook));
		}
		else {
			System.out.println("This book is not in the store");
		}
		
	}
	
	/*---------------------------------------------------------------------------------------*/
	//Add a  book to Store with Name and Author of the Book
	public static void addBook(HashMap <Integer, BookStore> myStore)
	
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter Book Name: ");
		String name=scan.nextLine();
		System.out.print("Enter Author Name: ");
		String author=scan.nextLine();
		myStore.put(bookid, new BookStore(bookid, name, author));  
		System.out.println(myStore);
		
		
	}
	
	/*---------------------------------------------------------------------------------------*/
	//Add a  book to Store with Name and Author of the Book
	public static void addBook(HashMap <Integer, BookStore> myStore)
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter Book Name: ");
		String name=scan.nextLine();
		System.out.print("Enter Author Name: ");
		String author=scan.nextLine();
		myStore.put(bookid, new BookStore(bookid, name, author));  
		System.out.println(myStore);
		
		
	}
	/*---------------------------------------------------------------------------------------*/
	//List All Books in the Store
	private static void listAll(HashMap<Integer, BookStore> myStore) {
		// TODO Auto-generated method stub
		System.out.print("BookStore inventory ");
		for(int i=0; i<myStore.size(); i++)
		{	
			System.out.println(myStore.get(i+1000));
		}
		
	}
	/*---------------------------------------------------------------------------------------*/
	//Remove a  book from the Store by bookId
	private static void deleteByID(HashMap<Integer, BookStore> myStore) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter an id to delete: ");
		int idbook=scan.nextInt();
		System.out.println(idbook);
		if (myStore.containsKey(idbook))
		{
			System.out.println(myStore.remove(idbook));
		}
		else {
			System.out.println("This book is not in the store");
		}
	}
	/*---------------------------------------------------------------------------------------*/
	//Search a  book with any information
	private static void searchByAny(HashMap<Integer, BookStore> myStore) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter any keyword about the book: ");
		String info=scan.nextLine();
		
		System.out.println(info);
		for (BookStore b : myStore.values())
		{
			if (b.toString().indexOf(info)>-1)
			{
				System.out.println(b);
			}
			else {
				System.out.println("This book is not in the store");
			}
		}
			
			
		
		
	}
	/*---------------------------------------------------------------------------------------*/
	//BookStore object print
	public String toString()
	{
		return "\n---BookInfo---\nName: " +name+"\nAuthor : "+author+"\nPrice: "+price+"\n--------------";
	}


}
