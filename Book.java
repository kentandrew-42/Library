#hello kentoon

public class Book {
	private String bookTitle;
	private String authorName;
	private ArrayList<Copy> listOfCopies;
	
	public Book(String bookTitle) {
		this.bookTitle = bookTitle;
	}


	// Mutators

	public void addCopy() {
		listOfCopies.add(new Copy());
	}


	// Accessors

	public String getBookTitle() {
		return bookTitle;
	}

	public String getAuthor() {
		return authorName;
	}

	public int numCopies() {
		return listOfCopies.size();
	}

	public void printCopyList() {
		// TODO print out a list of copies, due dates, and other stuff.
	}
}
