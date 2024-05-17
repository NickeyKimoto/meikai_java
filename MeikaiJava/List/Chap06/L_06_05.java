package MeikaiJava.List.Chap06;

//ランダム関数を利用できるようにする
import java.util.Random;

// 配列の全要素に乱数を代入して横向きの棒グラフで表示

//Javaでキーボードから標準入力を取得するために必要なScannerクラスをインポート
import java.util.Scanner;

public class L_06_05 {

	public static void main(String[] args) {

		// 引数で標準入力System.inを指定
		Scanner standardInput = new Scanner(System.in);
		// ランダムクラスのインスタンスを生成
		Random randomVariable = new Random();

		System.out.print("要素数：");
		int n = standardInput.nextInt(); // 要素数を読み込む
		int[] a = new int[n]; // 配列を生成

		for (int i = 0; i < n; i++) {

			a[i] = 1 + randomVariable.nextInt(10); // 1～10の乱数

		}

		for (int i = 0; i < n; i++) {

			System.out.print("a[" + i + "] : ");
			
			for (int j = 0; j < a[i]; j++) {
				
			
				System.out.print('*');
				
			}
			
			System.out.println();

		}

	}

}
