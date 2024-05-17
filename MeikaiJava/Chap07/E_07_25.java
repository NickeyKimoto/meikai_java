package MeikaiJava.Chap07;

/*
*クラス名：E_07_25
*概要：配列から指定した要素を基準に指定した個数の要素を消去する
*作成者：N.Kimoto
*作成日：2024/04/23
*/

//Javaでキーボードから標準入力を取得するために必要なScannerクラスをインポート
import java.util.Scanner;

public class E_07_25 {
	
	/*
	*関数名：arrayRmv0fN
	*概要：配列から指定した要素を基準に指定した個数の要素を消去した配列を生成
	*引数：配列(int型), インデックス番号(int型), 消去する要素数(int型)
	*戻り値：元の配列から指定された要素を消去した配列(int型)
	*作成者：N.Kimoto
	*作成日：2024/04/23
	*/

	static int[] arrayRmv0fN(int[] a, int idx, int n) {

		// 元の配列から指定された要素を基準に指定した個数の要素を消去した配列を宣言
		int[] firstArray = new int[a.length - n];

		// 先ほど宣言した配列に元の配列の消去箇所以前の全要素をコピー
		for (int i = 0; i < a.length - n; i++) {

			// その要素に元の配列の消去箇所以前の要素の値を代入
			firstArray[i] = a[i];

		}

		// 指定した箇所の要素とそれ以降の要素を消去した要素分前に代入する
		for (int i = 0; i < a.length - idx - n; i++) {

			// その要素に元の配列の消去した要素分後ろの要素の値を代入する
			firstArray[idx + i] = a[idx + i + n];

		}

		// 元の配列から指定した要素を基準に指定した個数の要素を消去した配列を返却
		return firstArray;

	}
	
	/*
	*関数名：main
	*概要：配列から指定した要素を基準に指定した個数の要素を消去する
	*引数：なし
	*戻り値：なし
	*作成者：N.Kimoto
	*作成日：2024/04/23
	*/

	public static void main(String[] args) {

		// Scannerオブジェクトを生成
		Scanner standardInput = new Scanner(System.in);

		// 要素数が一つしかなかった場合のための定数を宣言
		final int ONLY_ONE = 1;

		// 要素数の入力を促す
		System.out.print("要素数：");
		// 入力された値を読み込む
		int integerVariable = standardInput.nextInt();

		// 0か負の整数の値を入力された場合
		while (integerVariable <= 0) {

			// 正の整数値の入力を促す
			System.out.print("正の整数値を入力してください：");
			// 入力された値を読み込む
			integerVariable = standardInput.nextInt();

		}

		// 入力された値の要素数を持つ配列を宣言
		int[] firstArray = new int[integerVariable];

		// 各要素に値を入力する
		for (int i = 0; i < integerVariable; i++) {

			// 要素に代入する値の入力を促す
			System.out.print("x[" + i + "]：");
			// 入力された値を読み込む
			firstArray[i] = standardInput.nextInt();

		}

		// 消去する基準となる要素のインデックス番号の入力を促す
		System.out.print("消去する基準となるインデックス：");
		// 入力された値を読み込む
		int deleteElements = standardInput.nextInt();

		// 負の整数値や存在しないインデックスが入力された場合
		while (deleteElements < 0 || deleteElements >= firstArray.length) {

			// 消去する要素のインデックスの入力を促す
			System.out.print("有効なインデックスを入力してください：");
			// 入力された値を読み込む
			deleteElements = standardInput.nextInt();

		}

		// 消去する要素の個数の入力を促す
		System.out.print("消去する要素の個数：");
		// 入力された値を読み込む
		int deleteCount = standardInput.nextInt();

		// 0や負の整数値、要素数以上の値を入力された場合
		while (deleteCount <= 0 || deleteCount > firstArray.length - deleteElements) {

			// 消去する要素の個数の入力を促す
			System.out.print("有効な個数を入力してください：");
			// 入力された値を読み込む
			deleteCount = standardInput.nextInt();

		}

		// 配列から指定した要素を基準に指定した個数の要素を消去したことを表示
		System.out.println("x[" + deleteElements + "]から" + deleteCount + "個の要素を消去しました。");

		// 指定した要素を消去した配列の要素を順番に表示
		for (int i = 0; i < arrayRmv0fN(firstArray, deleteElements, deleteCount).length; i++) {

			// 配列の各要素を表示
			System.out.println("x[" + i + "] = " + arrayRmv0fN(firstArray, deleteElements, deleteCount)[i]);

		}

	}

}
