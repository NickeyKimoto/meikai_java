package MeikaiJava.List.Chap05;

// 関係演算子・等価演算子・論理否定演算子が生成する値を表示

//Javaでキーボードから標準入力を取得するために必要なScannerクラスをインポート
import java.util.Scanner;

public class L_05_03 {

	public static void main(String[] args) {

		// 引数で標準入力System.inを指定
		Scanner standardInput = new Scanner(System.in);

		// 整数値の入力を促す
		System.out.print("整数a：");
		// 入力された整数値を読み込む
		int a = standardInput.nextInt();
		// 整数値の入力を促す
		System.out.print("整数b：");
		// 入力された整数値を読み込む
		int b = standardInput.nextInt();

		System.out.println("a < b = " + (a < b));
		System.out.println("a <= b = " + (a <= b));
		System.out.println("a > b = " + (a > b));
		System.out.println("a >= b = " + (a >= b));
		System.out.println("a == b = " + (a == b));
		System.out.println("a != b = " + (a != b));
		System.out.println("!(a == 0) = " + !(a == 0));
		System.out.println("!(b == 0) = " + !(b == 0));
		
	}

}
