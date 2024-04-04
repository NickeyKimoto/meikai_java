package MeikaiJava.Chap02;

	/*
	*クラス名：E_02_09
	*概要：0.0以上1.0未満の実数値、0.0以上10.0未満の実数値、-1.0以上1.0未満の実数値を
		   それぞれランダムに生成して表示するプログラム
	*作成者：N.Kimoto
	*作成日：2024/04/04
	*/
	
	
	//ランダム関数を利用できるようにする
	import java.util.Random;

public class E_02_09 {
	
	/*
	*関数名：main
	*概要：0.0以上1.0未満の実数値、0.0以上10.0未満の実数値、-1.0以上1.0未満の実数値を
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
			
		// 0から1.0未満の実数値をランダムに生成
		double firstRandom = rand.nextDouble(1.0);
		// 0から10.0未満の実数値をランダムに生成
		double secondRandom = rand.nextDouble(10.0);
		// 0から2.0未満の実数値をランダムに生成
		double thirdRandom = rand.nextDouble(2.0);
				
		// 0.0以上1.0未満の実数値をランダムに生成して表示
		System.out.println(firstRandom);
		// 0.0以上10.0未満の実数値をランダムに生成して表示
		System.out.println(secondRandom);
		// -1.0以上1.0未満の実数値をランダムに生成して表示
		System.out.println(thirdRandom - 1.0);

	}

}
