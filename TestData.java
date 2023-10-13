package Exceptions_Assignment;

import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

public class TestData {
	
	public static void main(String[] args) throws IOException {
		
		PrintStream out = System.out;
		Scanner in = new Scanner(System.in);
		
		ReadFromFile read = new ReadFromFile();
		DataFileWriter writer = new DataFileWriter();
		DataMaker makeData = new DataMaker();
		String inputFile;
		String[][] matrix;
		String[][] squaredMatrix;

		while(true) {
			out.println("Enter the name of the input file: ");
			inputFile = in.nextLine();
			
			try {
				matrix = read.readMatrix(inputFile);
				break;
			}catch(FileNotFoundException e){
				out.println("File doesn't exist - try again ");
			}
		}
		
		// write the new data into the file 
		squaredMatrix = makeData.createData(matrix);
		writer.writeData(squaredMatrix, "squares.dat");

		
		
	}

}
