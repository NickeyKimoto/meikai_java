package MeikaiJava.List.Chap04;

//読み込んだ整数値と1, 2, …との差を表示

//Javaでキーボードから標準入力を取得するために必要なScannerクラスをインポート
import java.util.Scanner;

public class L_04_14 {

	public static void main(String[] args) {
		
		// 引数で標準入力System.inを指定
		Scanner standardInput = new Scanner(System.in);

		System.out.print("整数値：");
		int n = standardInput.nextInt();

		for (int i = 1, j =n - 1; i <= n; i++, j--)
			
			System.out.println(i + " " + j);

	}

}
