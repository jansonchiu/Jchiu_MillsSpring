package textExcel;

import java.io.FileNotFoundException;
import java.util.Scanner;

// Update this file with your own code.

public class TextExcel
{

	public static void main(String[] args) throws FileNotFoundException
	{
		Scanner userInput = new Scanner(System.in);
		Spreadsheet jdog = new Spreadsheet(); 
		String user= userInput.next();
		//loop runs until user types quit
		while(!userInput.equals("quit")){
		jdog.processCommand(user);
			user = userInput.nextLine();
		}
	    // Add your command loop here
		userInput.close();
	}
}
