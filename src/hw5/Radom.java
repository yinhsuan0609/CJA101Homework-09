package hw5;

public class Radom {
	public static void randAvg() {
		int sum = 0;
		int x[] = new int[10];
		
		//使用Math.radom得到變數，並透過for依序存入迴圈中印出，再透過sum計算得到數值總合
		for(int i = 0; i< x.length; i++) {
			x[i] = (int)(Math.random()*101);
			sum = sum + x[i];
			System.out.print(x[i] + " ");
		}
		System.out.println();
		//以陣列內數值總和除以陣列長度得到平均值
		System.out.print(sum/x.length);
	}
	public static void main(String[] avgs) {
		//呼叫印出陣列及計算平均值的方法
		randAvg();
	}
	

}
