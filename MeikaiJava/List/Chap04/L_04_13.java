package MeikaiJava.List.Chap04;

//読み込んだ整数値のすべての約数を表示

//Javaでキーボードから標準入力を取得するために必要なScannerクラスをインポート
import java.util.Scanner;

public class L_04_13 {

	public static void main(String[] args) {
		
		// 引数で標準入力System.inを指定
		Scanner standardInput = new Scanner(System.in);

		System.out.print("整数値：");
		int n = standardInput.nextInt();

		for (int i = 1; i <= n; i++)
			if (n % i == 0) // 割り切れたら
			System.out.println(i); // 表示


	}

}
