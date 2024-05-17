package MeikaiJava.List.Chap03;

// 読み込んだ値に応ジャンケンの手を表示（その１：if文）

//Javaでキーボードから標準入力を取得するために必要なScannerクラスをインポート
import java.util.Scanner;

public class L_03_15 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		// 引数で標準入力System.inを指定
				Scanner stdIn = new Scanner(System.in);
				
				// 手の選択の入力を促す
				System.out.print("手を選べ（0…グー／1…チョキ／2…パー）：");
				// 入力された手を読み込む
				int hand = stdIn.nextInt();
				
				// もしグーが選択された場合
				if (hand == 0)
				// 文章を表示
			    System.out.println("グー");
				// もしチョキが選択された場合
				else if (hand == 1)
				// 文章を表示
			    System.out.println("チョキ");
				// もしパーが選択された場合
				else if (hand == 2)
				// 文章を表示
			    System.out.println("パー");

	}

}
