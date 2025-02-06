package exception;

import java.io.FileReader;
import java.io.IOException;

public class Checked_FileNotFoundException 
{                            //Trying to access a file that does not exist.

	public static void main(String[] args) 
	{
		try {
        	// Creating an instance of FileReader class
        	FileReader fileReader = new FileReader("input.txt");
        	System.out.println(fileReader.read());
        	fileReader.close();
    	}
    	catch (IOException e) {
        	System.out.println(e);
    	}
	}

}
