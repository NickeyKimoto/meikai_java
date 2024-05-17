package MeikaiJava.List.Chap07;

// 3人の身長・体重・年齢の最大値を求めて表示

//Javaでキーボードから標準入力を取得するために必要なScannerクラスをインポート
import java.util.Scanner;

public class L_07_01 {

	public static void main(String[] args) {

		// 引数で標準入力System.inを指定
		Scanner standardInput = new Scanner(System.in);

		int[] height = new int[3]; // 身長
		int[] weight = new int[3]; // 体重
		int[] age = new int[3]; // 年齢

		for (int i = 0; i < 3; i++) { // 読み込み

			System.out.print("[" + (i + 1) + "]");
			System.out.print("身長：");
			height[i] = standardInput.nextInt();
			System.out.print("   体重：");
			weight[i] = standardInput.nextInt();
			System.out.print("   年齢：");
			age[i] = standardInput.nextInt();

		}

		// 身長の最大値を求める
		int maxHeight = height[0];
		if (height[1] > maxHeight) maxHeight = height[1];
		if (height[2] > maxHeight) maxHeight = height[2];

		// 体重の最大値を求める
		int maxWeight = weight[0];
		if (weight[1] > maxWeight) maxWeight = weight[1];
		if (weight[2] > maxWeight) maxWeight = weight[2];
		
		// 年齢の最大値を求める
		int maxAge = age[0];
		if (age[1] > maxAge) maxAge = age[1];
		if (age[2] > maxAge) maxAge = age[2];
		
		System.out.println("身長の最大値は" + maxHeight + "です。");
		System.out.println("体重の最大値は" + maxWeight + "です。");
		System.out.println("年齢の最大値は" + maxAge    + "です。");

	}

}
