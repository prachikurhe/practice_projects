package Cursor;

import java.util.Iterator;
import java.util.LinkedList;

class Book{
	int id;
	String name,author,pulisher;
	int quantity;
	
	public Book(int id,String name,String author,String publisher,int quantity) {
		this.id=id;
		this.name=name;
		this.author=author;
		this.pulisher=pulisher;
		this.quantity=quantity;
	}
}
public class LinkedListDemo {

	public static void main(String[] args) {
		LinkedList<Book> list=new LinkedList();
		
		Book b1=new Book(101,"Let us C","Yashwant Kanetkar","BPB",8);
		Book b2=new Book(102,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);  
	    Book b3=new Book(103,"Operating System","Galvin","Wiley",6); 
	    
	    list.add(b1);
	    list.add(b2);
	    list.add(b3);
	     
	    
	    
	    
	    for(Book b:list) {
	    		System.out.println(b.id+" "+b.name+"  "+b.author+" "+b.pulisher+" "+b.quantity);
	    }
	    
		
		


	}

}
