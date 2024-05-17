package MeikaiJava.List.Chap04;

// 読み込んだ整数を加算(合計が1,000を超えない範囲で加算する)

//Javaでキーボードから標準入力を取得するために必要なScannerクラスをインポート
import java.util.Scanner;

public class L_04_18 {

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

			if (sum + t > 1000) {
				
				System.out.println("合計が1,000を超えました。");
				System.out.println("最後の数値は無視します。");

				break; // for文から抜け出る

			}

			sum += t;
		}

		System.out.println("合計は" + sum + "です。");

	}

}
