package MeikaiJava.List.Chap06;

//ランダム関数を利用できるようにする
import java.util.Random;
//Javaでキーボードから標準入力を取得するために必要なScannerクラスをインポート
import java.util.Scanner;

// 配列の要素の順序を逆順に並べ替えて表示

public class L_06_11 {

	public static void main(String[] args) {

		// 引数で標準入力System.inを指定
		Scanner standardInput = new Scanner(System.in);
		// ランダムクラスのインスタンスを生成
		Random randomVariable = new Random();

		System.out.print("要素数：");
		int n = standardInput.nextInt(); // 要素数を読み込む
		int[] a = new int[n]; // 配列を宣言

		for (int i = 0; i < n; i++) {

			a[i] = 1 + randomVariable.nextInt(90);
			System.out.println("a[" + i + "] = " + a[i]);

		}

		for (int i = 0; i < n / 2; i++) {
			
			int t = a[i];
			a[i] = a[n - i - 1];
			a[n - i - 1] = t;
			
		}

			System.out.println("要素の並びを逆転しました。");
			
			for (int i = 0; i < n; i++) {
				
				System.out.println("a[" + i + "] = " + a[i]);
				
			}

	}

}
