package MeikaiJava.Chap03.List;

//読み込んだ値に応ジャンケンの手を表示（その２：switch文）

//Javaでキーボードから標準入力を取得するために必要なScannerクラスをインポート
import java.util.Scanner;

public class List3_16 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		// 引数で標準入力System.inを指定
		Scanner stdIn = new Scanner(System.in);
		
		// 手の選択の入力を促す
		System.out.print("手を選べ（0…グー／1…チョキ／2…パー）：");
		// 入力された手を読み込む
		int hand = stdIn.nextInt();
		
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
