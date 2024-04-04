package MeikaiJava.Chap02;

	/*
	*クラス名：E_02_07
	*概要：1桁の正の整数値、1桁の負の整数値、2桁の正の整数値を
	       それぞれランダムに生成して表示するプログラム
	*作成者：N.Kimoto
	*作成日：2024/04/04
	*/
	
	//ランダム関数を利用できるようにする
	import java.util.Random;

public class E_02_07 {
	
	/*
	*関数名：main
	*概要：1桁の正の整数値、1桁の負の整数値、2桁の正の整数値を
	       それぞれランダムに生成して表示するプログラム
	*引数：なし
	*戻り値：なし
	*作成者：N.Kimoto
	*作成日：2024/04/04
	*/

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		// ランダムクラスのインスタンスを生成
		Random rand = new Random();
		
		// 0から9の正の整数値をランダムに生成
		int firstRandom = rand.nextInt(10);
		// 0から9の正の整数値をランダムに生成
		int secondRandom = rand.nextInt(10);
		// 0から89の正の整数値をランダムに生成
		int thirdRandom = rand.nextInt(90);
		
		// 1桁の正の整数値をランダムに生成して表示
		System.out.println( firstRandom );
		// 1桁の負の整数値をランダムに生成して表示
		System.out.println( -secondRandom );
		// 2桁の正の整数値をランダムに生成して表示
		System.out.println(10 + thirdRandom);

	}

}
