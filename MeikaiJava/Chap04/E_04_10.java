package MeikaiJava.Chap04;

/*
*クラス名：E_04_10
*概要：読み込んだ値が1未満の場合改行文字を出力しないList4-11
*作成者：N.Kimoto
*作成日：2024/04/09
*/

//Javaでキーボードから標準入力を取得するために必要なScannerクラスをインポート
import java.util.Scanner;

public class E_04_10 {

	/*
	*関数名：main
	*概要：読み込んだ個数だけ*を表示し、1未満の場合改行文字を出力しない
	*引数：なし
	*戻り値：なし
	*作成者：N.Kimoto
	*作成日：2024/04/09
	*/

	public static void main(String[] args) {

		// 引数で標準入力System.inを指定
		Scanner standardInput = new Scanner(System.in);

		// 表示させる個数である正の整数値の入力を促す
		System.out.print("何個*を表示しますか：");
		// 入力された値を読み込み表示(教本準拠のため変数n)
		int n = standardInput.nextInt();

		// 正の整数値か0が入力されるまで繰り返す
		while (n < 0) {

			// 正の整数値の入力を促す
			System.out.print("不正な値が入力されました。\nもう一度入力してください:");
			// 読み込んだ正の整数値を表示
			n = standardInput.nextInt();

		}

		// 読み込まれた整数の回数だけ繰り返す(教本準拠のため変数i)
		for (int i = 0; i < n; i++) {

			// *を表示する
			System.out.print('*');

		}

		// 読み込んだ値が1未満でない場合
		if (n >= 1) {

			// 改行文字を出力
			System.out.println();

		}

	}

}
