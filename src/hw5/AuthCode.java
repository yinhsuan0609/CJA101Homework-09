package hw5;

public class AuthCode {
	public void getAuthCode() {
		//將所有數字和字母存入陣列
		char[] x = {
			    'a','b','c','d','e','f','g','h','i','j',
			    'k','l','m','n','o','p','q','r','s','t',
			    'u','v','w','x','y','z',
			    'A','B','C','D','E','F','G','H','I','J',
			    'K','L','M','N','O','P','Q','R','S','T',
			    'U','V','W','X','Y','Z',
			    '1','2','3','4','5','6','7','8','9','0'
			};
		char[] result = new char[8];
		//用亂數隨機陣列索引值來產生驗證碼並印出
		System.out.println("本次隨機產生驗證碼為：");
		for(int i = 0 ; i <= 7; i++) {
			result[i] = x[(char)(Math.random()*62)];
			System.out.print(result[i]);
		}

	}

}
