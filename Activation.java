// Activation functions... (Linear, Step, ReLU)

public class Activation {
	
	int[][] output_array;
	
	public Activation(int[][] array, String activationFunction) {
		
		int[][] output_table = array;
		
		int rowCount = array.length;
		int colCount = array[0].length;
		
		if (activationFunction == "Linear") {
			output_table = array;
			
		} else if (activationFunction == "Step") {
			for (int i=0; i<rowCount; i++) {
				for (int j=0; j<colCount; j++) {
					if (array[i][j] < 0) {
						array[i][j] = 0;
					} else {
						array[i][j] = 1;
					}
				}
			}
			output_table = array;
			
		} else if (activationFunction == "ReLU") {
			for (int i=0; i<rowCount; i++) {
				for (int j=0; j<colCount; j++) {
					if (array[i][j] < 0) {
						array[i][j] = 0;
					} else {
						array[i][j] = array[i][j];
					}
				}
			}
			output_table = array;
			
		}
		
		
		this.output_array = output_table;
	}
	
	public int[][] getArray() {
		return output_array;
	}

}
