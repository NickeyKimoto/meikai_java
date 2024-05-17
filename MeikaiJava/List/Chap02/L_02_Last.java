package MeikaiJava.List.Chap02;

//ランダム関数を利用できるようにする
import java.util.Random;
//Javaでキーボードから標準入力を取得するために必要なScannerクラスをインポート
import java.util.Scanner;

public class L_02_Last {

	public static void main(String[] args) {

		// 引数で標準入力System.inを指定
		Scanner standardInput = new Scanner(System.in);
		// ランダムクラスのインスタンスを生成
		Random randomVariable = new Random();
		
		int a; // aはint型の変数
		
		a = 2; // 代入(生成済みの変数に値を入れる)
		
		int b = -1; // 初期化(変数の生成時に値を入れる)
		
		double x = 1.5 * 2;
		
		final double PI = 3.14; // 値を書き換えられない変数(定数に名前を与える)
		
		x = randomVariable.nextDouble();
		
		System.out.println("半径" + x + "の円の面積は" + (PI * x * x) + "です。");
		
		System.out.print("整数aの値：");
		
		a = standardInput.nextInt();
		
		System.out.println("a / 2 = " + a / 2);
		
		System.out.println("a % 2 = " + a % 2);
		
		String s = "ABC"; // 文字列型
		
		System.out.println("文字列sは" + s + "です。");

	}

}
