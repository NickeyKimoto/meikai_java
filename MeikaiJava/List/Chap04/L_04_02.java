package MeikaiJava.List.Chap04;

// 読み込んだ値に応じてジャンケンの手を表示（0, 1, 2のみを受け付ける）

//Javaでキーボードから標準入力を取得するために必要なScannerクラスをインポート
import java.util.Scanner;

public class L_04_02 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		// 引数で標準入力System.inを指定
				Scanner stdIn = new Scanner(System.in);
				
				int hand;
				
				do {
				
				// 手の選択の入力を促す
				System.out.print("手を選べ（0…グー／1…チョキ／2…パー）：");
				// 入力された手を読み込む
				hand = stdIn.nextInt();
				// 0,1,2以外の場合繰り返す
				} while (hand < 0 || hand > 2);
				
				switch (hand) {
				// handが0のときグーを表示しswitch文の実行を終了する
				case 0:  System.out.println("グー"); break;
				// handが0のときチョキを表示しswitch文の実行を終了する
				case 1:  System.out.println("チョキ"); break;
				// handが0のときパーを表示しswitch文の実行を終了する
				case 2:  System.out.println("パー"); break;
				}

	}

}
