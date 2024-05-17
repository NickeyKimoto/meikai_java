package MeikaiJava.List.Chap02;

	//円周の長さと円の面積を求める（その２：円周率をfinal変数で表す）
	
	//Javaでキーボードから標準入力を取得するために必要なScannerクラスをインポート
	import java.util.Scanner;

public class L_02_13 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		// 円周率の初期化
	    final double PI = 3.1416;
		// 引数で標準入力System.inを指定
		Scanner stdIn = new Scanner(System.in);
					
		// 半径の値の入力を促す
		System.out.print("半径の値：");
		// rに実数値を読み込む
		double r = stdIn.nextDouble();
				    
		// 円周の長さを表示
		System.out.println("円周の長さは" + 2 * PI * r + "です。");
		// 面積を表示
		System.out.println("面積は" + PI * r * r + "です。");

	}

}
