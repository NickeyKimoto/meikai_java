package MeikaiJava.List.Chap06;

// 点数を読み込んで合計点・平均点を表示(配列版)

//Javaでキーボードから標準入力を取得するために必要なScannerクラスをインポート
import java.util.Scanner;

public class L_06_07 {

	public static void main(String[] args) {

		// 引数で標準入力System.inを指定
		Scanner standardInput = new Scanner(System.in);

		int sum = 0; // 合計
		final int ninzu = 5; // 人数
		int[] tensu = new int[ninzu]; // 点数

		System.out.println(ninzu + "人の点数を入力せよ:");
		
		for (int i = 0; i < ninzu; i++) {
			
			System.out.print((i + 1) + "番の点数");
			
			tensu[i] = standardInput.nextInt(); // tensu[i]を読み込んで
			sum += tensu[i]; // sumにtensu[i]を加える
			
		}

		System.out.println("合計は" + sum + "点です。");
		System.out.println("平均は" + (double)sum / ninzu + "点です。");
		
	}

}
