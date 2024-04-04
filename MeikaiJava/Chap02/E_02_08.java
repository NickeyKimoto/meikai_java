package MeikaiJava.Chap02;

	/*
	*クラス名：E_02_08
	*概要：入力された整数値±5の範囲の整数値を
	       ランダムに生成して表示するプログラム
	*作成者：N.Kimoto
	*作成日：2024/04/04
	*/
	
	//ランダム関数を利用できるようにする
	import java.util.Random;
//Javaでキーボードから標準入力を取得するために必要なScannerクラスをインポート
	import java.util.Scanner;

public class E_02_08 {
	
	/*
	*関数名：main
	*概要：入力された整数値±5の範囲の整数値を
	       ランダムに生成して表示するプログラム
	*引数：なし
	*戻り値：なし
	*作成者：N.Kimoto
	*作成日：2024/04/04
	*/

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		// ランダムクラスのインスタンスを生成
		Random rand = new Random();
					
		// 引数で標準入力System.inを指定
		Scanner stdIn = new Scanner(System.in);
				
		// 0から10の正の整数値をランダムに生成
		int firstRandom = rand.nextInt(11);
			
		// -5から+5の範囲の整数値に初期化
		int generatedNumber = firstRandom - 5;
			
		// 整数値の入力を促す
		System.out.print("整数値：");
		// xに整数値を読み込む
		int firstVariable = stdIn.nextInt();
		    
		// 読み込んだ整数値±5の範囲の整数値をランダムに生成して表示
		System.out.println("その値の±5の乱数を生成しま\nした。それは" + (firstVariable + generatedNumber) + "です。");

	}

}
