package MeikaiJava.List.Chap06;

//ランダム関数を利用できるようにする
import java.util.Random;

// 線形探索

//Javaでキーボードから標準入力を取得するために必要なScannerクラスをインポート
import java.util.Scanner;

public class L_06_09 {

	public static void main(String[] args) {

		// 引数で標準入力System.inを指定
		Scanner standardInput = new Scanner(System.in);
		// ランダムクラスのインスタンスを生成
		Random randomVariable = new Random();

		final int n = 12; // 要素数
		int[] a = new int[n]; // 配列を宣言

		for (int j = 0; j < n; j++) {

			a[j] = randomVariable.nextInt(10);

		}

		System.out.print("配列aの全要素の値\n{ ");

		for (int j = 0; j < n; j++) {

			System.out.print(a[j] + " ");

		}
		
		System.out.println("}");
		
		System.out.print("探す数値：");
		int key = standardInput.nextInt();
		
		int i;
		
		for (i = 0; i < n; i++) {

			if (a[i] == key) {
				
				break;
				
			}

		}
		
		if (i < n) {
			
			System.out.println("それはa[" + i + "]にあります。");
			
		} else {
			
			System.out.println("それはありません。");
			
		}
		

	}

}
