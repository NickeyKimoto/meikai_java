package MeikaiJava.Chap06;

/*
*クラス名：E_06_10
*概要：要素型がint型である配列を作り、全要素を1～10の乱数で埋め尽くすプログラム(連続する要素が同じ値を持たない)
*作成者：N.Kimoto
*作成日：2024/04/15
*/

//ランダム関数を利用できるようにする
import java.util.Random;
//Javaでキーボードから標準入力を取得するために必要なScannerクラスをインポート
import java.util.Scanner;

public class E_06_10 {
	
	/*
	*関数名：main
	*概要：要素型がint型である配列を作り、全要素を1～10の乱数で埋め尽くす(連続する要素が同じ値を持たない)
	*引数：なし
	*戻り値：なし
	*作成者：N.Kimoto
	*作成日：2024/04/15
	*/


	public static void main(String[] args) {

		// 引数で標準入力System.inを指定
		Scanner standardInput = new Scanner(System.in);
		// ランダムクラスのインスタンスを生成
		Random randomVariable = new Random();

		// 1～10の乱数を生成するための定数を宣言(1)
		final int SPECIFIED_NUMBER = 10;
		// 1～10の乱数を生成するための定数を宣言(2)
		final int ADJUSTMENT_NUMBER = 1;
		// ひとつ前の要素の値を参照するための定数を宣言
		final int INTRGER_ONE = 1;

		// 要素数の入力を促す
		System.out.print("要素数：");
		// 入力された値を読み込む
		int integerVariable = standardInput.nextInt();
		// 正の整数値以外の値を受け付けないようにする
		while (integerVariable <= 0) {

			// 正の整数値の入力を促す
			System.out.print("正の整数値を入力してください:");
			// 入力された値を読み込む
			integerVariable = standardInput.nextInt();

		}

		// 入力された値の要素数を持つ配列を宣言
		int[] firstArray = new int[integerVariable];

		// 各要素に生成した1～10の乱数を代入し値を表示
		for (int i = 0; i < integerVariable; i++) {

			// 乱数を生成し代入する
			do {

				// その要素に生成した1～10の乱数を代入
				firstArray[i] = ADJUSTMENT_NUMBER + randomVariable.nextInt(SPECIFIED_NUMBER);

			// [1]以降で生成された乱数がひとつ前の要素と重ならなくなるまで繰り返す
			} while (i > 0 && firstArray[i] == firstArray[i - INTRGER_ONE]);

			// その要素の値を表示
			System.out.println("a[" + i + "] = " + firstArray[i]);

		}

	}

}
