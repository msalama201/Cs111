public class MatrixOps {	
	public static double[][] multiply(double[][] matrix1, double[][] matrix2) {
		
	
		if(matrix1[0].length != matrix2.length) {
			IO.reportBadInput();
			return null;
		}
		
		if(matrix1[0].length == 0 || matrix2.length == 0) {
			IO.reportBadInput();
			double[][] x = new double[0][0];
			return x;
		}
		
		double[][] x = new double[matrix1.length][matrix2[0].length];
		
		for (int i=0; i<matrix1.length ; i++) {
			for (int j=0 ; j<matrix2[0].length ; j++) {
				for (int k=0 ; k <matrix1[0].length ; k++) {
					x[i][j] += matrix1[i][k]*matrix2[k][j];
				}
			}
		}
		
		return x;
	}
}