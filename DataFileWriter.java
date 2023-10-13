package Exceptions_Assignment;

import java.io.BufferedWriter;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

// reusing code from example in class 

public class DataFileWriter implements DataWriter{

	
	public void writeData(String[][] data, String fileName) //throws IOException
	{
		
		String file = fileName;
		
		FileWriter fw = null;
		BufferedWriter bw = null;
		PrintWriter outFile = null;
		
		try 
		{
		
			fw = new FileWriter (file);
			bw = new BufferedWriter (fw);
			outFile = new PrintWriter (bw);
	    
			for (String[] line : data)
			{
				for (String num: line)
				{
					outFile.print (num + "\t");
				}
				outFile.println ();
			}
		}
		catch (IOException e) {
			System.err.print("File Error: Writing to " + file );  //Use whatever logging tool you have in place.
		}
		finally 
		{
			outFile.close();
		}
	}	
	
}
