package MeikaiJava.List.Chap03;

// 三つの整数値の最大値を求める

// Javaでキーボードから標準入力を取得するために必要なScannerクラスをインポート
import java.util.Scanner;

public class L_03_12 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		// 引数で標準入力System.inを指定
		Scanner stdIn = new Scanner(System.in);
										
	// 整数aの入力を促し、読み込む
		System.out.print("整数a："); int a = stdIn.nextInt();
	// 整数bの入力を促し、読み込む
	    System.out.print("整数b："); int b = stdIn.nextInt();
	// 整数cの入力を促し、読み込む
	    System.out.print("整数c："); int c = stdIn.nextInt();
	    
	// maxをaの値で初期化する
	    int max = a;
	// bの値がmaxよりも大きければ、maxにbの値を代入する。
	    if (b > max) max = b;
	// cの値がmaxよりも大きければ、maxにcの値を代入する。
	    if (c > max) max = c;
	    
	// 最大値を表示
	    System.out.print("最大値は" + max + "です。");

	}

}
