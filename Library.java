import java.util.Scanner;
import java.util.ArrayList;

public class Library {

	private ArrayList<Genre> genreList;
	// private ScholarDatabase scholarList;
	private boolean exitCalled = false;

	public static void main(String[] args) {
		// initialize by using startup sequence (reading file, etc.)

		while (!exitCalled) {
			printMenu();
		}
		
	}

	public void printMenu () {
		// TODO do we want to use swing to make a GUI, or nah?

		System.out.println("MENU\n");
	}
}
