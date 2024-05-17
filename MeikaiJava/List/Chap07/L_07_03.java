package MeikaiJava.List.Chap07;

// 三つの整数値の最大値を求める(メソッド版)

//Javaでキーボードから標準入力を取得するために必要なScannerクラスをインポート
import java.util.Scanner;

public class L_07_03 {

	//--- a, b, cの最大値を返却 ---//
	static int max(int a, int b, int c) {

		int max = a;
		if (b > max) max = b;
		if (c > max) max = c;
		return max;

	}

	public static void main(String[] args) {

		// 引数で標準入力System.inを指定
		Scanner standardInput = new Scanner(System.in);
		
		System.out.print("整数a："); int a = standardInput.nextInt();
		System.out.print("整数b："); int b = standardInput.nextInt();
		System.out.print("整数c："); int c = standardInput.nextInt();
		
		System.out.println("最大値は" + max(a, b, c) + "です。");

	}

}
