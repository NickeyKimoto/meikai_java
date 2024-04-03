package MeikaiJava;

//ランダム関数を利用できるようにする
import java.util.Random;
import java.util.Scanner;

public class Chap02_8 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		// ランダムクラスのインスタンスを生成
			Random rand = new Random();
			
		// 引数で標準入力System.inを指定
			Scanner stdIn = new Scanner(System.in);
				
		// 0から10の正の整数値をランダムに生成
			int a = rand.nextInt(11);
			
		// -5から+5の範囲の整数値に初期化
			int b = a - 5;
			
		// 整数値の入力を促す
		    System.out.print("整数値：");
		 // xに整数値を読み込む
		    int x = stdIn.nextInt();
		    
		// 読み込んだ整数値±5の範囲の整数値をランダムに生成して表示
		    System.out.println("その値の±5の乱数を生成しま\nした。それは" + (x + b) + "です。");

	}

}
