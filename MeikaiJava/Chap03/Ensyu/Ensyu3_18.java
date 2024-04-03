package MeikaiJava.Chap03.Ensyu;

//Javaでキーボードから標準入力を取得するために必要なScannerクラスをインポート
import java.util.Scanner;

public class Ensyu3_18 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		// 引数で標準入力System.inを指定
		Scanner stdIn = new Scanner(System.in);
										
	    // 月の入力を促す
		System.out.print("季節を求めます。\n何月ですか：");
	    // 月を読み込む
		int month = stdIn.nextInt();
		
		switch (month) {
		// 月が3のとき文章を表示
		case 3:
		// 月が4のとき文章を表示
		case 4:
		// 月が5のとき文章を表示しswitch文の実行を終了する
		case 5:  System.out.println("春"); break;
		// 月が6のとき文章を表示
		case 6:
		// 月が7のとき文章を表示
		case 7:
		// 月が8のとき文章を表示しswitch文の実行を終了する
		case 8:  System.out.println("夏"); break;
		// 月が9のとき文章を表示
		case 9:
		// 月が10のとき文章を表示
		case 10:
		// 月が11のとき文章を表示しswitch文の実行を終了する
		case 11:  System.out.println("秋"); break;
		// 月が12のとき文章を表示
		case 12:
		// 月が1のとき文章を表示
		case 1:
		// 月が2のとき文章を表示しswitch文の実行を終了する
		case 2:  System.out.println("冬"); break;
		}

	}

}
