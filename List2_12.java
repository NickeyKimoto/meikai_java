
// 円周の長さと円の面積を求める（その１：円周率を浮動小数点リテラルで表す）

// Javaでキーボードから標準入力を取得するために必要なScannerクラスをインポート
	import java.util.Scanner;

public class List2_12 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		// 引数で標準入力System.inを指定
			Scanner stdIn = new Scanner(System.in);
			
		// 半径の値の入力を促す
	        System.out.print("半径の値：");
	    // rに実数値を読み込む
		    double r = stdIn.nextDouble();
		    
		// 円周の長さを表示
		    System.out.println("円周の長さは" + 2 * 3.14 * r + "です。");
		// 面積を表示
		    System.out.println("面積は" + 3.14 * r * r + "です。");

	}

}
