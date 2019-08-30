import java.util.ArrayList;

public class Genre {
	private String genreName;
	private ArrayList<Copy> bookList;


	public Genre(String genreName) {
		this.genreName = genreName;
		bookList = new ArrayList<Copy>();
	}

	
	public void addCopy(Copy bookCopy) {
		bookList.add(bookCopy);
	}

	public void removeCopy(String bookTitle) {
		for (int i = 0; i < bookList.size(); ++i) {
			if (bookList.get(i).getCopyTitle().equals(bookTitle)) {
				bookList.remove(i);
			}
		}
	}



	public Copy get(int i) {
		return bookList.get(i);
	}

	public String getGenreName() {
		return genreName;
	}
}
