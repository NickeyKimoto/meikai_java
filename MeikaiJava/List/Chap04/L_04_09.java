package MeikaiJava.List.Chap04;

// 正の整数値を読み込んで逆順に表示

//Javaでキーボードから標準入力を取得するために必要なScannerクラスをインポート
import java.util.Scanner;

public class L_04_09 {

	public static void main(String[] args) {

		// 引数で標準入力System.inを指定
		Scanner standardInput = new Scanner(System.in);
		
		System.out.println("正の整数値を逆順に表示します。");
		int x;
		
		do {
			
			System.out.print("正の整数値:");
			x = standardInput.nextInt();
			
		} while (x <= 0);
		
		System.out.print("逆から読むと");
		
		while (x > 0) {
			
			System.out.print(x % 10); // xの最下位桁を表示
			x /= 10; // xを10で割る
			
		}
		
		System.out.println("です。");

	}

}
