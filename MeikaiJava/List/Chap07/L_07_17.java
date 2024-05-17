package MeikaiJava.List.Chap07;

// 配列の要素に値を読み込んで並びを反転する

//Javaでキーボードから標準入力を取得するために必要なScannerクラスをインポート
import java.util.Scanner;

public class L_07_17 {

	//--- 配列の要素a[idx1]とa[idx2]を交換 ---//
	static void swap(int[] a, int idx1, int idx2) {

		int t = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = t;

	}

	//--- 配列の要素の並びを逆転 ---//
	static void reverse(int[] a) {

		for (int i = 0; i < a.length / 2; i++) {

			swap(a, i, a.length - i - 1);

		}

	}

	public static void main(String[] args) {

		// Scannerオブジェクトを生成
		Scanner standardInput = new Scanner(System.in);

		System.out.print("要素数：");
		int num = standardInput.nextInt(); // 要素数
		
		int[] x = new int[num]; // 要素数numの配列

		for (int i = 0; i < num; i++) {

			System.out.print("x[" + i + "]：");
			x[i] = standardInput.nextInt();

		}
		
		reverse(x); // 配列xの並びを逆転
		
		System.out.println("要素の並びを逆転しました。");
		
		for (int i = 0; i < num; i++) {

			System.out.println("x[" + i + "] = " + x[i]);

		}

	}

}
