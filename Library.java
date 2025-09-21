package Week2.day1;

public class Library {
	
	
	//Define a method to add books
	
	public 	String addBook(String bookTitle) {
		
		
	  System.out.println("Book added successfully");
		return bookTitle;
		
	}
	//Define method to issue book
	public void issueBook() {
		
		System.out.println("Book issued successfully" );			
	
	}
//main method call both method
	public static void main(String[] args) {
		Library book=new Library();
		String title= book.addBook("science");
		System.out.println(title);
		book.issueBook();
		
        
        

		
        
	}

}
