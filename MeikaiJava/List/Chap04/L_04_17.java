package MeikaiJava.List.Chap04;

// 読み込んだ整数を加算(0が加算されたら終了)

//Javaでキーボードから標準入力を取得するために必要なScannerクラスをインポート
import java.util.Scanner;

public class L_04_17 {

	public static void main(String[] args) {

		// 引数で標準入力System.inを指定
		Scanner standardInput = new Scanner(System.in);

		System.out.println("整数を加算します。:");
		System.out.print("何個加算しますか:");
		int n = standardInput.nextInt(); // 加算する個数
		
		int sum = 0; // 合計値
		
		for (int i = 0; i < n; i++) {
			
			System.out.print("整数(0で終了):");
			int t = standardInput.nextInt();
			
			if (t == 0) {
				
				break; // for文から抜け出る
				
			}
			
			sum += t;
		}
		
		System.out.println("合計は" + sum + "です。");

	}

}
