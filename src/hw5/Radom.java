package hw5;

public class Radom {
	public static void randAvg() {
		int sum = 0;
		int x[] = new int[10];
		for(int i = 0; i< x.length; i++) {
			x[i] = (int)(Math.random()*101);
			sum = sum + x[i];
			System.out.print(x[i] + " ");
		}
		System.out.println();
		System.out.print(sum/x.length);
	}
	public static void main(String[] avgs) {
		randAvg();
	}
	

}
