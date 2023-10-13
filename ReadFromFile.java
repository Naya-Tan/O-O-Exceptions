package Exceptions_Assignment;

import java.util.Scanner;
import java.io.*;

public class ReadFromFile {

	 public String[][] readMatrix(String inputFile) throws FileNotFoundException {
	        Scanner fileScan;
	        int rows = 0;
	        int columns = 0;

	        fileScan = new Scanner(new File(inputFile));
	        
	        // get how many rows and columns from the input file 
	        while (fileScan.hasNextLine()) {
	            Scanner lineScan = new Scanner(fileScan.nextLine());
	            if (rows == 0) {
	                while (lineScan.hasNext()) {
	                    lineScan.next();
	                    columns++;
	                }
	            }
	            rows++;
	        }
	        
	        String[][] matrix = new String[rows][columns]; // read as a string so we can get everything in the file

	        // put the values from the file into a matrix 
	        fileScan = new Scanner(new File(inputFile));
	        int currentRow = 0;
	        while (fileScan.hasNextLine()) {
	            Scanner lineScan = new Scanner(fileScan.nextLine());
	            for (int j = 0; j < columns; j++) {
	                matrix[currentRow][j] = lineScan.next();
	            }
	            currentRow++;
	        }
	        return matrix;
	    }
}
