package MeikaiJava.List.Chap04;

// 入力された月の季節を表示

//Javaでキーボードから標準入力を取得するために必要なScannerクラスをインポート
import java.util.Scanner;

public class L_04_01 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		// 引数で標準入力System.inを指定
				Scanner stdIn = new Scanner(System.in);
				
				// もう一度行うかどうかを初期化
				int retry;
				
				// 繰り返される範囲、ループ本体
				do {
					
				// 月の入力を促す
				System.out.print("季節を求めます。\n何月ですか：");
			    // 月を読み込む
				int month = stdIn.nextInt();
				
				// 3月から5月なら表示
				if (month >= 3 && month <= 5)
					System.out.println("それは春です。");
				// 6月から8月なら表示
				else if (month >= 6 && month <= 8)
					System.out.println("それは夏です。");
				// 9月から11月なら表示
				else if (month >= 9 && month <= 11)
					System.out.println("それは秋です。");
				// 12月から2月なら表示
				else if (month == 12 || month == 1 || month == 2)
					System.out.println("それは冬です。");
				
				// 繰り返しの選択の入力を促す
				System.out.print("もう一度？。１…Yes／０…No：");
				// 繰り返しの選択を読み込む
				retry = stdIn.nextInt();
				
				// 制御式がtrueであればループ本体が再び実行される
				} while (retry == 1);

	}

}
