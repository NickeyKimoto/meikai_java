package MeikaiJava.List.Chap07;

//3人の身長・体重・年齢の最大値を求めて表示(メソッド版)

//Javaでキーボードから標準入力を取得するために必要なScannerクラスをインポート
import java.util.Scanner;

public class L_07_02 {
	
	//--- a, b, cの最大値を返却 ---//
	static int max (int a, int b, int c) {
		
		int max = a;
		if (b > max) max = b;
		if (c > max) max = c;
		return max;
		
	}

	public static void main(String[] args) {

		// 引数で標準入力System.inを指定
		Scanner standardInput = new Scanner(System.in);
		
		int[] height = new int[3]; // 身長
		int[] weight = new int[3]; // 体重
		int[] age    = new int[3]; // 年齢

		for (int i = 0; i < 3; i++) { // 読み込み

			System.out.print("[" + (i + 1) + "]");
			System.out.print("身長："); height[i] = standardInput.nextInt();
			System.out.print("   体重："); weight[i] = standardInput.nextInt();
			System.out.print("   年齢："); age[i] = standardInput.nextInt();

		}
		
		int maxHeight = max(height[0], height[1], height[2]); // 身長の最大値
		int maxWeight = max(weight[0], weight[1], weight[2]); // 体重の最大値
		int maxAge = max(age[0], age[1], age[2]); // 年齢の最大値
		
		System.out.println("身長の最大値は" + maxHeight + "です。");
		System.out.println("体重の最大値は" + maxWeight + "です。");
		System.out.println("年齢の最大値は" + maxAge    + "です。");

	}

}
