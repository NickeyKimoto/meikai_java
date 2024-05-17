package MeikaiJava.List.Chap10;

// 円周の長さと円の面積を求める(円周率Math.PIを利用)

// Javaでキーボードから標準入力を取得するために必要なScannerクラスをインポート
import java.util.Scanner;

class Circle {

	public static void main(String[] args) {

		// Scannerオブジェクトを生成
		Scanner standardInput = new Scanner(System.in);
		
		System.out.print("半径：");
		double r = standardInput.nextDouble(); // rに実数値を読み込む
		
		System.out.println("円周の長さは" + 2 * Math.PI * r + "です。");
		System.out.println("面積は" + Math.PI * r * r + "です。");

	}

}
