// Create predefined convolution kernel (int[][])...
// (Sharpen, HorizontalLine, VerticalLine, 45DegLine, 135DegLine,
// HorizontalSobel, VerticalSobel, Laplacian, LaplacianIncludeDiagonals)

public class ConvolutionKernel {
	
	private int[][] kernel;
	
	public ConvolutionKernel(String kernel_type) {
		if (kernel_type == "Sharpen") {
			int[][] kernel = new int[3][3];
			kernel[0][0] = 0;
			kernel[0][1] = -1;
			kernel[0][2] = 0;
			kernel[1][0] = -1;
			kernel[1][1] = 5;
			kernel[1][2] = -1;
			kernel[2][0] = 0;
			kernel[2][1] = -1;
			kernel[2][2] = 0;
			this.kernel = kernel;
		} else if (kernel_type == "HorizontalLine") {
			int[][] kernel = new int[3][3];
			kernel[0][0] = -1;
			kernel[0][1] = -2;
			kernel[0][2] = -1;
			kernel[1][0] = 0;
			kernel[1][1] = 0;
			kernel[1][2] = 0;
			kernel[2][0] = 1;
			kernel[2][1] = 2;
			kernel[2][2] = 1;
			this.kernel = kernel;
		} else if (kernel_type == "VerticalLine") {
			int[][] kernel = new int[3][3];
			kernel[0][0] = -1;
			kernel[0][1] = 0;
			kernel[0][2] = 1;
			kernel[1][0] = -2;
			kernel[1][1] = 0;
			kernel[1][2] = 2;
			kernel[2][0] = -1;
			kernel[2][1] = 0;
			kernel[2][2] = 1;
			this.kernel = kernel;
		} else if (kernel_type == "45DegLine") {
			int[][] kernel = new int[3][3];
			kernel[0][0] = -1;
			kernel[0][1] = -1;
			kernel[0][2] = 2;
			kernel[1][0] = -1;
			kernel[1][1] = 2;
			kernel[1][2] = -1;
			kernel[2][0] = 2;
			kernel[2][1] = -1;
			kernel[2][2] = -1;
			this.kernel = kernel;
		} else if (kernel_type == "135DegLine") {
			int[][] kernel = new int[3][3];
			kernel[0][0] = 2;
			kernel[0][1] = -1;
			kernel[0][2] = -1;
			kernel[1][0] = -1;
			kernel[1][1] = 2;
			kernel[1][2] = -1;
			kernel[2][0] = -1;
			kernel[2][1] = -1;
			kernel[2][2] = 2;
			this.kernel = kernel;
		} else if (kernel_type == "HorizontalSobel") {
			int[][] kernel = new int[3][3];
			kernel[0][0] = -1;
			kernel[0][1] = -2;
			kernel[0][2] = -1;
			kernel[1][0] = 0;
			kernel[1][1] = 0;
			kernel[1][2] = 0;
			kernel[2][0] = 1;
			kernel[2][1] = 2;
			kernel[2][2] = 1;
			this.kernel = kernel;
		} else if (kernel_type == "VerticalSobel") {
			int[][] kernel = new int[3][3];
			kernel[0][0] = -1;
			kernel[0][1] = 0;
			kernel[0][2] = 1;
			kernel[1][0] = -2;
			kernel[1][1] = 0;
			kernel[1][2] = 2;
			kernel[2][0] = -1;
			kernel[2][1] = 0;
			kernel[2][2] = 1;
			this.kernel = kernel;
		} else if (kernel_type == "Laplacian") {
			int[][] kernel = new int[3][3];
			kernel[0][0] = 0;
			kernel[0][1] = -1;
			kernel[0][2] = 0;
			kernel[1][0] = -1;
			kernel[1][1] = 4;
			kernel[1][2] = -1;
			kernel[2][0] = 0;
			kernel[2][1] = -1;
			kernel[2][2] = 0;
			this.kernel = kernel;
		} else if (kernel_type == "LaplacianIncludeDiagonals") {
			int[][] kernel = new int[3][3];
			kernel[0][0] = -1;
			kernel[0][1] = -1;
			kernel[0][2] = -1;
			kernel[1][0] = -1;
			kernel[1][1] = 8;
			kernel[1][2] = -1;
			kernel[2][0] = -1;
			kernel[2][1] = -1;
			kernel[2][2] = -1;
			this.kernel = kernel;
		}
	}
	
	public int[][] getKernel() {
		return kernel;
	}
}
