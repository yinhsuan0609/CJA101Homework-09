package hw4;

public class Score {
	public static void main(String[] args) {
	int[][] student = {{10, 37, 100, 77, 98, 90}, 
			{35, 75, 70, 95, 70, 80}, 
			{40, 77, 79, 70, 89, 100}, 
			{100, 89, 90, 89, 90, 75}, 
			{90, 64, 75, 60, 75, 50},
			{85, 75, 70, 75, 90, 20},
			{75, 70, 70, 85, 89, 99},
			{70, 95, 90, 89, 90, 75}};
	int[] highest = new int[student.length];
			
	for(int i = 0; i < student.length; i++) {
		int max = student[i][0];
		for(int j = 0; j < student[i].length; j++) {
			if(student[i][j] > max) {
				max = student[i][j];
			}
			highest[i] = max;
		}
		System.out.println(1+i + "號同學最高分：" + highest[i]);
	}
	
}
}
