package MeikaiJava.List.Chap04;

// 1からnまでの和を求める

//Javaでキーボードから標準入力を取得するために必要なScannerクラスをインポート
import java.util.Scanner;

public class L_04_10 {

	public static void main(String[] args) {

		// 引数で標準入力System.inを指定
		Scanner standardInput = new Scanner(System.in);
		
		System.out.println("1からnまでの和を求めます。");
		int n;
		
		do {
			
			System.out.print("nの値:");
			n = standardInput.nextInt();
			
		} while (n <= 0);
		
		int sum = 0; // 合計
		int i = 1;
		
		while (i <= n) {
			
			sum += i; // sumにiを加える
			i++; // iをインクリメント
			
		}
		
		System.out.println("1から" + n + "までの和は" + sum + "です。");

	}

}
