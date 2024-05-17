package MeikaiJava.List.Chap03;

//読み込んだ整数値の桁数（２桁以上かどうか）を判断

//Javaでキーボードから標準入力を取得するために必要なScannerクラスをインポート
	import java.util.Scanner;

public class L_03_08 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		// 引数で標準入力System.inを指定
		Scanner stdIn = new Scanner(System.in);
										
	    // 整数値の入力を促す
		System.out.print("整数値：");
	    // 整数値を読み込む
		int n = stdIn.nextInt();
										
	    // 整数値が2桁以上なら表示
		if (n <= -10 || n >= 10)
			System.out.print("その値は2桁以上です。");
	// 整数値が2桁未満であれば表示
		else
			System.out.print("その値は2桁未満です。");

	}

}
