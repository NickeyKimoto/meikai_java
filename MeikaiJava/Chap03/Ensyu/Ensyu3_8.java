package MeikaiJava.Chap03.Ensyu;

//Javaでキーボードから標準入力を取得するために必要なScannerクラスをインポート
import java.util.Scanner;

public class Ensyu3_8 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		// 引数で標準入力System.inを指定
		Scanner stdIn = new Scanner(System.in);
										
	    // 点数の入力を促す
		System.out.print("点数：");
	    // 点数を読み込む
		int p = stdIn.nextInt();
		
		// 0～59なら表示
		if (p >= 0 && p <= 59)
			System.out.print("不可");
		// 60～69なら表示
		else if (p >= 60 && p <= 69)
			System.out.print("可");
		// 70～79なら表示
		else if (p >= 70 && p <= 79)
			System.out.print("良");
		// 80～100なら表示
		else if (p >= 80 && p <= 100)
			System.out.print("優");

	}

}
