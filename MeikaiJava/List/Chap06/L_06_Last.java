package MeikaiJava.List.Chap06;

//Javaでキーボードから標準入力を取得するために必要なScannerクラスをインポート
import java.util.Scanner;

public class L_06_Last {

	public static void main(String[] args) {

		// 引数で標準入力System.inを指定
		Scanner standardInput = new Scanner(System.in);

		// 全要素を既定値0で初期化
		int[] a = new int[5];

		// 明示的に初期化
		int[] b = { 1, 2, 3, 4, 5 };

		for (int i = 0; i < a.length; i++) {

			System.out.println("a[" + i + "] = " + a[i]);

		}

		for (int i = 0; i < b.length; i++) {

			System.out.println("b[" + i + "] = " + b[i]);

		}

		// 配列aの全要素に値を読み込む
		for (int i = 0; i < a.length; i++) {

			System.out.print("a[" + i + "] = ");
			a[i] = standardInput.nextInt();

		}

		// 配列aの全要素の合計を求める
		int sum = 0;

		for (int i : a) { // 拡張for文

			sum += i;

		}

		System.out.println("aの合計 = " + sum);

		// 2行4列の異なる2次元配列
		int[][] c = new int[2][4];

		System.out.println("配列c");
		for (int i = 0; i < c.length; i++) {

			for (int j = 0; j < c[i].length; j++) {

				System.out.printf("%3d", c[i][j]);

			}

			System.out.println();

		}

		// 行によって列数の異なる2次元配列
		int[][] d = { new int[5], new int[3], new int[4] };
		
		System.out.println("配列d");
		for (int i = 0; i < d.length; i++) {

			int j = 0;

			for (; j < d[i].length; j++) {

				System.out.printf("%3d", d[i][j]);

			}

			for (; j < 5; j++) {

				System.out.print("  -");

			}

			System.out.println();

		}

	}

}
