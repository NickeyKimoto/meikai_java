package MeikaiJava.List.Chap06;

// 月を表す英単語の学習プログラム

//ランダム関数を利用できるようにする
import java.util.Random;
//Javaでキーボードから標準入力を取得するために必要なScannerクラスをインポート
import java.util.Scanner;

public class L_06_14 {

	public static void main(String[] args) {

		// 引数で標準入力System.inを指定
		Scanner standardInput = new Scanner(System.in);
		// ランダムクラスのインスタンスを生成
		Random randomVariable = new Random();
		
		String[] monthString = {
				
				"January", "February", "March", "April", "May", "June", "July", "August", 
				"September", "October", "November", "December"
				
		};

		int month =randomVariable.nextInt(12); // 当てるべき月：0～11の乱数
		
		System.out.println("問題は" + monthString[month]);
		
		while (true) {
			
			System.out.print("何月かな：");
			int m = standardInput.nextInt();
			
			if (m == month + 1) {
				
				break;
				
			}
			
			System.out.println("違います。");
			
		}
		
		System.out.println("正解です。");
		
	}

}
