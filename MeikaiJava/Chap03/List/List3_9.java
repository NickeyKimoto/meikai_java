package MeikaiJava.Chap03.List;

// 読み込んだ月の季節を表示

//Javaでキーボードから標準入力を取得するために必要なScannerクラスをインポート
import java.util.Scanner;

public class List3_9 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		// 引数で標準入力System.inを指定
				Scanner stdIn = new Scanner(System.in);
												
			    // 月の入力を促す
				System.out.print("季節を求めます。\n何月ですか：");
			    // 月を読み込む
				int month = stdIn.nextInt();
				
				// 3月から5月なら表示
				if (month >= 3 && month <= 5)
					System.out.print("それは春です。");
				// 6月から8月なら表示
				else if (month >= 6 && month <= 8)
					System.out.print("それは夏です。");
				// 9月から11月なら表示
				else if (month >= 9 && month <= 11)
					System.out.print("それは秋です。");
				// 12月から2月なら表示
				else if (month == 12 || month == 1 || month == 2)
					System.out.print("それは冬です。");
	}

}
