package MeikaiJava.Chap03.Ensyu;

//Javaでキーボードから標準入力を取得するために必要なScannerクラスをインポート
import java.util.Scanner;

public class Ensyu3_1 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		// 引数で標準入力System.inを指定
					Scanner stdIn = new Scanner(System.in);
							
			    // 整数値の入力を促す
					System.out.print("整数値：");
				// 整数値を読み込む
					int n = stdIn.nextInt();
							
				// もしもn < 0なら文章を表示
					if (n < 0)
					    System.out.println("その絶対値は" + (-n) + "です。");
					
				// n < 0でなければ文章を表示
					else
						System.out.println("その絶対値は" + n + "です。");

	}

}
