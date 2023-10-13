package Exceptions_Assignment;

// modified code from class 

public class DataMaker {

	public String[][] createData(String[][] matrix) {
		
		String[][] squaredMatrix = new String[matrix.length][matrix[0].length];
		int errors = 0;
		
		 for (int rows = 0; rows < matrix.length; rows++) {
	            for (int columns = 0; columns < matrix[rows].length; columns++) {
	            	
	            	try {
	            		int number = Integer.parseInt(matrix[rows][columns]);
	            		int square = number * number;
	            		
	            		if (square > Short.MAX_VALUE) {
							 throw new SquareOutOfBounds("Square is out of bounds");
						 }
	            		squaredMatrix[rows][columns] = String.valueOf(square);
	            		
	            	}catch(SquareOutOfBounds e) {
	            		errors++;
	            		squaredMatrix[rows][columns] = String.valueOf(Short.MAX_VALUE);
	            		
	            	}catch(NumberFormatException e) {
	            		errors++;
	            		squaredMatrix[rows][columns] = "err";
	            	}
	            }
	     }
	
		System.out.println("File processed successfully with " + errors + " errors.");
		return squaredMatrix;
	}
}
