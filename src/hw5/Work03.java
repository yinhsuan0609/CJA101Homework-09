package hw5;

public class Work03 {
	//預設max為x陣列的[0][0]，透過迴圈依序做大小比較，比到更大數值者放入max變數，以此找出最大值
	 public int maxElement(int x[][]) {
	        int max = x[0][0];
	        for (int i = 0; i < x.length; i++) {
	            for (int j = 0; j < x[i].length; j++) {
	                if (x[i][j] > max) {
	                    max = x[i][j];
	                }
	            }
	        }
	        //回傳max的值
	        return max;
	    }
	 //同上，double陣列比照辦理
	 public double maxElement(double x[][]) {
	        double max = x[0][0]; 
	        for (int i = 0; i < x.length; i++) {
	            for (int j = 0; j < x[i].length; j++) {
	                if (x[i][j] > max) {
	                    max = x[i][j];
	                }
	            }
	        }
	        return max;
	    }

}
