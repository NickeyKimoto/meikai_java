package MeikaiJava.List.Chap06;

// 点数を読み込んで合計点・平均点を表示

//Javaでキーボードから標準入力を取得するために必要なScannerクラスをインポート
import java.util.Scanner;

public class L_06_01 {

	public static void main(String[] args) {

		// 引数で標準入力System.inを指定
		Scanner standardInput = new Scanner(System.in);
		
		int sum = 0; // 合計
		System.out.println("5人の点数を入力せよ。");
		
		System.out.print("1番の点数：");
		int yamane = standardInput.nextInt();
		sum += yamane;
		
		System.out.print("2番の点数：");
		int takada = standardInput.nextInt();
		sum += takada;
		
		System.out.print("3番の点数：");
		int kawachi = standardInput.nextInt();
		sum += kawachi;
		
		System.out.print("4番の点数：");
		int koga = standardInput.nextInt();
		sum += koga;
		
		System.out.print("5番の点数：");
		int tozuka = standardInput.nextInt();
		sum += tozuka;
		
		// ほぼ同じ処理の繰り返し
		
		System.out.println("合計は" + sum + "点です。");
		System.out.println("平均は" + (double)sum / 5 + "点です。"); // 実数で求めるためのキャスト

	}

}
