package hw4;

public class Array {
	public static void main(String[] args) {
		int sum = 0;
		int arrayOne[] = {29, 100, 39, 41, 50, 8, 66, 77, 95, 15};
		//計算陣列總和
		for(int i = 0; i < arrayOne.length ; i ++) {
			sum = sum + arrayOne[i];
		}
		//計算陣列平均值
		int avg = sum / arrayOne.length ; 
		//計算大於平均值的元素數量
		int count = 0;
		for(int j = 0; j < arrayOne.length; j++) {
			if(arrayOne[j] > avg) {
				count++ ;
			}
		}
		//將大於平均值的元素存入陣列並印出
		int greater[] = new int[count];
		int l = 0;
		System.out.print("大於平均值的元素：");
		for(int k = 0; k < arrayOne.length; k++) {
			if(arrayOne[k] > avg) {
				greater[l] = arrayOne[k];
				System.out.print(greater[l]+" ");
				l++;
			}
		}
		System.out.println();
		//印出元素平均值
		System.out.println("元素平均值：" + avg);
		
	}

}
