package MeikaiJava.Chap03.Ensyu;

//Javaでキーボードから標準入力を取得するために必要なScannerクラスをインポート
	import java.util.Scanner;

public class Ensyu3_7 {

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
					// 3で割り切れれば表示
						if (n % 3 == 0)
							System.out.print("その値は3で割り切れます。");
					// 余りが1であれば表示
						else if (n % 3 == 1)
							System.out.print("その値を3で割った余りは1です。");
					// 余りが2であれば表示
						else
							System.out.print("その値を3で割った余りは2です。");
									
				// 整数値がn > 0でないなら表示
					else
					    System.out.print("正でない値が入力されました。");


	}

}
