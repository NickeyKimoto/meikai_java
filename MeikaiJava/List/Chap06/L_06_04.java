package MeikaiJava.List.Chap06;

// 配列の全要素に値を読み込んで表示

//Javaでキーボードから標準入力を取得するために必要なScannerクラスをインポート
import java.util.Scanner;

public class L_06_04 {

	public static void main(String[] args) {

		// 引数で標準入力System.inを指定
		Scanner standardInput = new Scanner(System.in);
		
		System.out.print("要素数：");
		int n = standardInput.nextInt(); // 要素数を読み込む
		int[] a = new int[n]; // 配列を生成
		
		for (int i = 0; i < n; i++) {
			
			System.out.print("a[" + i + "] = ");
			a[i] = standardInput.nextInt();
			
		}
		
		for (int i = 0; i < n; i++) {
			
			System.out.println("a[" + i + "] = " + a[i]);
			
		}

	}

}
