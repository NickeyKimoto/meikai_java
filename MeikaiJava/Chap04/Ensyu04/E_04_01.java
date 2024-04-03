package MeikaiJava.Chap04.Ensyu04;

//Javaでキーボードから標準入力を取得するために必要なScannerクラスをインポート
import java.util.Scanner;

public class E_04_01 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		// 引数で標準入力System.inを指定
					Scanner stdIn = new Scanner(System.in);
					
					// もう一度行うかどうかを初期化
					int retry;
					
					// 繰り返される範囲、ループ本体
					do {
							
				// 整数値の入力を促す
					System.out.print("整数値：");
				// 整数値を読み込む
					int n = stdIn.nextInt();
							
				// 整数値がn > 0なら表示
					if (n > 0)
						System.out.println("その値は正です。");
				// 整数値がn < 0なら表示
					else if (n < 0)
					    System.out.println("その値は負です。");
				// 整数値がn = 0なら表示
					else
					    System.out.println("その値は０です。");
					
					// 繰り返しの選択の入力を促す
					System.out.print("もう一度？。１…Yes／０…No：");
					// 繰り返しの選択を読み込む
					retry = stdIn.nextInt();
					
					// 制御式がtrueであればループ本体が再び実行される
					} while (retry == 1);

	}

}
