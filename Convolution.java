// Apply convolution kernel to a primitive 2d inr array (int[][])...

import java.util.Arrays;

public class Convolution {
	
	int[][] output_array;
	
	public Convolution(int[][] array, int[][] kernel) {
		int output_array_size = array.length - kernel.length + 1;
	    int[][] output_array = new int[output_array_size][output_array_size];

	    for (int i=0; i<output_array_size; i++) {
	        for (int j=0; j<output_array_size; j++) {

	            int[][] slice = Arrays.copyOfRange(array, i, i+kernel.length);
	            for (int n=0; n<slice[0].length; n++) {
	                slice[n] = Arrays.copyOfRange(slice[n], j, j+kernel.length);
	            }

	            for (int n=0; n<kernel.length; n++) {
	                for (int m=0; m<kernel.length; m++) {
	                    slice[n][m] = slice[n][m] * kernel[n][m];
	                }
	            }

	            int sum = 0;
	            for (int n=0; n<kernel.length; n++) {
	                for (int m=0; m<kernel.length; m++) {
	                    sum += slice[n][m];
	                }
	            }
	            output_array[i][j] = sum;
	        }
	    }
	    
	    this.output_array = output_array;
	}
	
	public int[][] getArray() {
		return output_array;
	}

}
