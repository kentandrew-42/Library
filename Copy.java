import java.util.Date;

public class Copy {
	private Date arrivalDate;
	private Date checkoutDate;
	private Date dueDate;
	private Date returnDate;
	private boolean inStock;
	private final int DAYS_OF_CHECKOUT = 14;
	private final long MILLIS_OF_CHECKOUT = DAYS_OF_CHECKOUT * 1000 * 3600 * 24 * 14;

	public Copy() {
		arrivalDate = new Date(); // Use DateFormat to format the date when printed.
	}
	

	// Operations

	public Date checkoutCopy() {
		checkoutDate = new Date();
		dueDate = new Date(System.currentTimeMillis() + MILLIS_OF_CHECKOUT);
		inStock = false;
		return dueDate;
	}

	public void returnCopy() {
		inStock = true;
		returnDate = new Date();
	}


	// Accessors

	public String getCopyTitle() {
		return bookTitle;
	}

	public String getAuthor() {
		return authorName;
	}
	
	public boolean inStock() {
		return inStock;
	}

	public Date getArrivalDate() {
		return arrivalDate;
	}

	public Date getCheckoutDate() {
		return checkoutDate;
	}

	public Date getDueDate() {
		return dueDate;
	}

	public Date getReturnDate() {
		return returnDate;
	}
}
