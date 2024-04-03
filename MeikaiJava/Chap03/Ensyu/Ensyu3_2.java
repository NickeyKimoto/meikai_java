package MeikaiJava.Chap03.Ensyu;

//Javaでキーボードから標準入力を取得するために必要なScannerクラスをインポート
import java.util.Scanner;

public class Ensyu3_2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		// 引数で標準入力System.inを指定
			Scanner stdIn = new Scanner(System.in);
							
		// 正の整数Aの入力を促し読み込む
			System.out.print("整数A："); int a = stdIn.nextInt();
		// 正の整数Bの入力を促し読み込む
			System.out.print("整数B："); int b = stdIn.nextInt();
					
		// もしもBがAの約数なら文章を表示
			if (a % b == 0)
				System.out.println("BはAの約数です。");
		// BがAの約数でないなら文章を表示
			else
				System.out.println("BはAの約数ではありません。");

	}

}
