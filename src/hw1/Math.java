package hw1;

public class Math {
	public static void main(String[] args) {
		//請設計一隻Java程式,計算12,6這兩個數值的和與積
		System.out.println("12 + 6 = "+ (12 + 6));
		System.out.println("12 * 6 = "+ (12 * 6));
		//請設計一隻Java程式,計算200顆蛋共是幾打幾顆? (一打為12顆)
		System.out.println("200 顆蛋總共為 " + (200 / 12) + " 打 " + (200 % 12) + " 顆");
		//請由程式算出256559秒為多少天、多少小時、多少分與多少秒
		int seconds = 256559 % 60;
		int totalMinutes = 256559 / 60;
		int minutes = totalMinutes % 60;
		int totalHours = totalMinutes / 60;
		int hours = totalHours % 24;
		int days = totalHours / 24;
		System.out.println(days + " 天 " + hours + " 時 " + minutes + " 分 " + seconds + " 秒 ");
		//請定義一個常數為3.1415(圓周率),並計算半徑為5的圓面積與圓周長
		final double PI = 3.1415;
		System.out.println("圓面積 = "+ PI * 5 * 5);
		System.out.println("圓周長 = "+ PI * 2 * 5);
		/*某人在銀行存入150萬,銀行利率為2%,如果每年利息都繼續存入銀行,請用程式計算10年後,
		本金加利息共有多少錢 (用複利計算,公式請自行google)*/
		double fv = 1500000 * java.lang.Math.pow((1 + 0.02), 10);
		System.out.println(fv + " 元");
		/*請寫一隻程式,利用System.out.println()印出以下三個運算式結果:
		5 + 5
		5 + ‘5’
		5 + “5”
		並請用註解各別說明答案的產生原因*/
		System.out.println(5 + 5);//兩個整數相加，結果為10
		System.out.println(5 + '5');//整數 5 和字元 5 相加，5 的 ASCII 碼為 53，因此 5 + 53 = 58
		System.out.println(5 + "5");//整數 5 和字串 5 做字串的相連接，因此結果為 55 



	}
}




