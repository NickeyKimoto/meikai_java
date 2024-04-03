
// Javaでキーボードから標準入力を取得するために必要なScannerクラスをインポート
	import java.util.Scanner;

public class List2_10 {
	
	// 整数値を読み込んで符号を反転した値を表示

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		// 引数で標準入力System.inを指定
			Scanner stdIn = new Scanner(System.in);
				
		// 整数値と表示
			System.out.print("整数値");
		// aに数値を読み込む
			int a = stdIn.nextInt();
				
		// aの符号を反転した値でbを初期化
			int b = -a; 
				
		// 「の符号を反転した値は」と「です。」を表示
				System.out.println(a + "の符号を反転した値は" + b + "です。");

	}

}
