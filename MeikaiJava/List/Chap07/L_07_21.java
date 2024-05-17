package MeikaiJava.List.Chap07;

// 二値の最大値・三値の最大値を求めるメソッド(多重定義)

//Javaでキーボードから標準入力を取得するために必要なScannerクラスをインポート
import java.util.Scanner;

public class L_07_21 {

	//--- a, bの最大値を返却 ---//
	static int max(int a, int b) {

		return a > b ? a : b;

	}

	//--- a, b, cの最大値を返却 ---//
	static int max(int a, int b, int c) {

		int max = a;
		if (b > max) max = b;
		if (c > max) max = c;

		return max;

	}

	public static void main(String[] args) {

		// Scannerオブジェクトを生成
		Scanner standardInput = new Scanner(System.in);

		System.out.print("xの値："); int x = standardInput.nextInt();
		System.out.print("yの値："); int y = standardInput.nextInt();
		System.out.print("zの値："); int z = standardInput.nextInt();
		
		// 二値の最大値
		System.out.println("x, yの最大値は" + max(x, y) + "です。");
		// 三値の最大値
		System.out.println("x, y, zの最大値は" + max(x, y, z) + "です。");

	}

}
