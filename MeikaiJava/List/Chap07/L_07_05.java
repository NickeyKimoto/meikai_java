package MeikaiJava.List.Chap07;

// べき乗を求める

//Javaでキーボードから標準入力を取得するために必要なScannerクラスをインポート
import java.util.Scanner;

public class L_07_05 {

	//--- xのn乗を返す ---//
	static double power(double x, int n) {

		double tmp = 1.0;

		for (int i = 1; i <= n; i++) {

			tmp *= x; // tmpにxを掛ける

		}

		return tmp;

	}

	public static void main(String[] args) {

		// 引数で標準入力System.inを指定
		Scanner standardInput = new Scanner(System.in);

		System.out.println("aのb乗を求めます。");
		System.out.print("実数a：");
		double a = standardInput.nextDouble();
		System.out.print("整数b：");
		int b = standardInput.nextInt();

		System.out.println(a + "の" + b + "乗は" + power(a, b) + "です。");

	}

}
