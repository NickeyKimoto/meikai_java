package MeikaiJava.List.Chap07;

// 二つの配列が等しいかどうかを判定

//Javaでキーボードから標準入力を取得するために必要なScannerクラスをインポート
import java.util.Scanner;

public class L_07_18 {

	//--- 二つの配列a, bの全要素は等しいか? ---//
	static boolean equals(int[] a, int[] b) {

		if (a.length != b.length) {

			return false;

		}

		for (int i = 0; i < a.length; i++) {

			if (a[i] != b[i]) {

				return false;

			}

		}

		return true;

	}

	public static void main(String[] args) {

		// Scannerオブジェクトを生成
		Scanner standardInput = new Scanner(System.in);

		// 要素数の入力を促す
		System.out.print("配列aの要素数："); // 配列aの要素数
		// 入力された値を読み込む
		int na = standardInput.nextInt();

		int[] a = new int[na]; // 要素数naの配列

		// 各要素に値を入力する
		for (int i = 0; i < na; i++) {

			// 要素に代入する値の入力を促す
			System.out.print("a[" + i + "]：");
			// 入力された値を読み込む
			a[i] = standardInput.nextInt();

		}

		// 要素数の入力を促す
		System.out.print("配列bの要素数："); // 配列bの要素数
		// 入力された値を読み込む
		int nb = standardInput.nextInt();

		int[] b = new int[nb]; // 要素数nbの配列

		// 各要素に値を入力する
		for (int i = 0; i < nb; i++) {

			// 要素に代入する値の入力を促す
			System.out.print("b[" + i + "]：");
			// 入力された値を読み込む
			b[i] = standardInput.nextInt();

		}
		
		System.out.println("配列aとbは" + (equals(a, b) ? "等しいです。" : "等しくありません"));

	}

}
