package hw5;

public class Work03 {
	 int maxElement(int x[][]) {
	        int max = x[0][0]; // 初始化最大值為第一個元素
	        for (int i = 0; i < x.length; i++) {
	            for (int j = 0; j < x[i].length; j++) {
	                if (x[i][j] > max) {
	                    max = x[i][j]; // 更新最大值
	                }
	            }
	        }
	        return max;
	    }
	    
	    double maxElement(double x[][]) {
	        double max = x[0][0]; // 初始化最大值為第一個元素
	        for (int i = 0; i < x.length; i++) {
	            for (int j = 0; j < x[i].length; j++) {
	                if (x[i][j] > max) {
	                    max = x[i][j]; // 更新最大值
	                }
	            }
	        }
	        return max;
	    }

}
