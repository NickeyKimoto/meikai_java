package MeikaiJava.Chap03.Ensyu;

//Javaでキーボードから標準入力を取得するために必要なScannerクラスをインポート
	import java.util.Scanner;

public class Ensyu3_5 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		// 引数で標準入力System.inを指定
			Scanner stdIn = new Scanner(System.in);
									
		// 整数値の入力を促す
			System.out.print("整数値：");
		// 整数値を読み込む
			int n = stdIn.nextInt();
									
		// 整数値がn > 0なら表示
			if (n > 0)
			// 5で割り切れれば表示
				if (n % 5 == 0)
					System.out.print("その値は5で割り切れます。");
			// 5で割り切れなければ表示
				else
					System.out.print("その値は5で割り切れません。");
					
		// 整数値がn > 0でないなら表示
			else
				System.out.print("正でない値が入力されました。");

	}

}
