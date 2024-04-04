package MeikaiJava.Chap02;

/*
*クラス名：E_02_01
*概要：小数部を持つ実数値をxとyに代入した場合の検証
*作成者：N.Kimoto
*作成日：2024/04/04
*/

public class E_02_01 {
	
	/*
	*関数名：main
	*概要：小数部を持つ実数値をxとyに代入した場合の検証
	*引数：なし
	*戻り値：なし
	*作成者：N.Kimoto
	*作成日：2024/04/04
	*/

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		// List2-6の該当箇所を小数部を持つ実数値をxとy代入
		// 結果の予想は「代入された実数値の小数部を切り捨てられてから計算される」
		
		int x; // xはint型の変数
		int y; // yはint型の変数
		
		x = 63.5; // xに63.5を代入
		y = 18.2; // yに18.2を代入
				
		// xの値を表示
		System.out.println("xの値は" + x + "です。");
		// yの値を表示
		System.out.println("yの値は" + y + "です。");
		// 合計を表示
		System.out.println("合計は" + (x + y) + "です。");
		// 平均を表示
		System.out.println("平均は" + (x + y) / 2 + "です。");
		
		// 結果、エラーのため表示できず。

	}

}
