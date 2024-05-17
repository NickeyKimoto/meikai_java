package MeikaiJava.List.Chap05;

//二つの整数値の平均値を実数で求める(合計を2.0で割る)

//Javaでキーボードから標準入力を取得するために必要なScannerクラスをインポート
import java.util.Scanner;

public class L_05_06 {

	public static void main(String[] args) {

		// 引数で標準入力System.inを指定
		Scanner standardInput = new Scanner(System.in);

		// プログラムの内容を説明
		System.out.println("整数値xとyの平均値を求めます。");

		// 整数値の入力を促す
		System.out.print("x：");
		// 入力された整数値を読み込む
		int x = standardInput.nextInt();
		// 整数値の入力を促す
		System.out.print("y：");
		// 入力された整数値を読み込む
		int y = standardInput.nextInt();

		double ave = (x + y) / 2.0; // 平均値
		System.out.println("xとyの平均値は" + ave + "です。");

	}

}
