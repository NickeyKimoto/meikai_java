package MeikaiJava.List.Chap15;
// 文字列の配列(読み込んで表示)

//Javaでキーボードから標準入力を取得するために必要なScannerクラスをインポート
import java.util.Scanner;

public class L_15_12 {

	public static void main(String[] args) {
		Scanner standardInput = new Scanner(System.in);
		
		System.out.print("文字列の個数：");
		int n = standardInput.nextInt();
		String[] sx = new String[n];

		for (int i= 0; i < sx.length; i++) {
			System.out.print("sx[" + i + "] = ");
			sx[i] = standardInput.next();
		}
		
		for (int i= 0; i < sx.length; i++) {
			System.out.println("sx[" + i + "] = \"" + sx[i] + "\"");
		}
		
	}

}
