package MeikaiJava.List.Chap03;

// switch文とbreak文の働きの理解を深めるためのプログラム

//Javaでキーボードから標準入力を取得するために必要なScannerクラスをインポート
import java.util.Scanner;

public class L_03_17 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		// 引数で標準入力System.inを指定
				Scanner stdIn = new Scanner(System.in);
				
				// 整数の入力を促す
				System.out.print("整数を入力せよ：");
				// 入力された整数を読み込む
				int n = stdIn.nextInt();
				
				switch (n) {
				// nが0のときAを表示する
				case 0:  System.out.print("A");
				// nが0のときBを表示する
				         System.out.print("B");
				         // switch文の実行を終了する
				         break;
				// nが2のときCを表示する
				case 2:  System.out.print("C");
				// nが2、5のときDを表示する
				case 5:  System.out.print("D");
				         // switch文の実行を終了する
				         break;
				// nが6のとき
				case 6:
			    // nが6、7のときEを表示する
				case 7:  System.out.print("E");
				         // switch文の実行を終了する
				         break;
				// nがどのラベルとも一致しないときFを表示する
				default:  System.out.print("F");
				         // switch文の実行を終了する
		                 break;
				}
				// 文字を表示する
				System.out.println();


	}

}
