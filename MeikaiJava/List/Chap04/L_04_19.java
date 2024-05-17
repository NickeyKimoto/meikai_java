package MeikaiJava.List.Chap04;

// 読み込んだ整数を加算(負の値は加算しない)

//Javaでキーボードから標準入力を取得するために必要なScannerクラスをインポート
import java.util.Scanner;

public class L_04_19 {

	public static void main(String[] args) {

		// 引数で標準入力System.inを指定
		Scanner standardInput = new Scanner(System.in);

		System.out.println("整数を加算します。:");
		System.out.print("何個加算しますか:");
		int n = standardInput.nextInt(); // 加算する個数

		int sum = 0; // 合計値

		for (int i = 0; i < n; i++) {

			System.out.print("整数:");
			int t = standardInput.nextInt();

			if (t < 0) {
				
				System.out.println("負の値は加算しません。");
				
				continue;

			}

			sum += t; // tが負のときは実行されない
		}

		System.out.println("合計は" + sum + "です。");

	}

}
