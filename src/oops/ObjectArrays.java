package oops;

public class ObjectArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Library lib = new Library("City Library",0);
		
		 lib.addBook(new Book("The Hobbit", "J.R.R. Tolkien", "111", "Fantasy"));
	        lib.addBook(new Book("1984", "George Orwell", "222", "Dystopian"));
	        lib.addBook(new Book("To Kill a Mockingbird", "Harper Lee", "333", "Fiction"));
	        lib.addBook(new Book("The Great Gatsby", "F. Scott Fitzgerald", "444", "Classic"));
	        lib.addBook(new Book("Moby Dick", "Herman Melville", "555", "Adventure"));
	        lib.addBook(new Book("Hamlet", "William Shakespeare", "666", "Drama"));
	        lib.issueBook("1984");
	        lib.issueBook("The Hobbit");
	        lib.returnBook("1984");
		lib.findByAuthor("George Orwell");
		Book found = lib.findByTitle("Hamlet");
        if (found != null) {
            found.displayInfo();
        }
		System.out.println("\nAll Books:");
        lib.displayAllBooks();
	}

}


class Book{
	String title;
	 String author;
	String ISBN;
	 String genre;
	boolean isIssued;
	public Book(String title, String author, String iSBN, String genre) {
		super();
		this.title = title;
		this.author = author;
		ISBN = iSBN;
		this.genre = genre;
		this.isIssued = false;
	}
	void displayInfo() {
		System.out.println("Title: " + title +
                ", Author: " + author +
                ", ISBN: " + ISBN +
                ", Genre: " + genre +
                ", Issued: " + (isIssued ? "Yes" : "No"));
	}
void markIssued() {
	isIssued = true;
	
}
void markReturned() {
	isIssued = false;
}



}
class Library{
	String name;
	Book[] book = new Book[20];
	int bookCount;
	
	
	public Library(String name, int bookCount) {
		super();
		this.name = name;
		  book = new Book[20];
		this.bookCount = bookCount;
	}
	public void addBook(Book b) {
		if (bookCount < book.length) {
            book[bookCount++] = b;
        } else {
            System.out.println("Library is full!");
        }

	}
	public Book findByTitle(String title) {
		for(int i = 0; i <bookCount;i++) {
			if (book[i].title.equalsIgnoreCase(title)) {
                return book[i];
		}}
		System.out.println("not found");
		return null;
	}
	public void findByAuthor(String author) {
		 boolean found = false;
	        for (int i = 0; i < bookCount; i++) {
	            if (book[i].author.equalsIgnoreCase(author)) {
	                book[i].displayInfo();
	                found = true;
	            }
	        }
	        if (!found) {
	            System.out.println("No books found by this author.");
	        }
	}
	public void issueBook(String title) {
		Book b = findByTitle(title);
        if (b != null) {
            if (!b.isIssued) {
                b.markIssued();
                System.out.println("Book issued: " + title);
            } else {
                System.out.println("Book already issued.");
            }
        }
	}
public void returnBook(String title) {
	Book b = findByTitle(title);
    if (b != null) {
        if (b.isIssued) {
            b.markReturned();
            System.out.println("Book returned: " + title);
        } else {
            System.out.println("Book was not issued.");
        }
    }
}
public void displayAllBooks()
{
	
	for (int i = 0; i < bookCount; i++) {
        book[i].displayInfo();
    }
	}
public void countAvailable()
{
	
	int count = 0;
    for (int i = 0; i < bookCount; i++) {
        if (!book[i].isIssued) {
            count++;
        }
    }
    System.out.println("Available books: " + count);
}
	}




/*Create a Book class: Include title, author, ISBN (String), genre, and isIssued (boolean).*/
/*Include a constructor, displayInfo(), markIssued(), and markReturned().
Create a Library class: Include name, an array of Book objects (e.g., Book[] books with a maximum size of 20), and bookCount (int).
Library Methods:
addBook(Book b)
findByTitle(String title): Returns the Book object or prints "Not found".
findByAuthor(String author): Prints all matching books.
issueBook(String title): Marks the book as issued if it is available.
returnBook(String title)
displayAllBooks()
countAvailable()
Testing (in main): Create a Library. Add 6 books. Issue 2 books. Return 1 book. Search for a specific book. Finally, print all books along with their current issue status.
*/