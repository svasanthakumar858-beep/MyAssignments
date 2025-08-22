package week2.day1;

public class Library {
	public void addBook() {
		System.out.println("Book added successfully");
	}
	
    public void issueBook() {
    	System.out.println("Book issued successfully");
    }
    public String bookTitle()
    {
    	return "bookTitle";
    }
	public static void main(String[] args) {
		Library books=new Library();
		books.addBook();
		books.issueBook();
		String bookTitle=books.bookTitle();
		System.out.println(bookTitle);
			}

}
