package MeikaiJava.List.Chap04;

// 整数値と実数値を読み込んで表示

//Javaでキーボードから標準入力を取得するために必要なScannerクラスをインポート
import java.util.Scanner;

public class L_04_25 {

	public static void main(String[] args) {

		// 引数で標準入力System.inを指定
		Scanner standardInput = new Scanner(System.in);
		
		System.out.print("整数x：");
		int x = standardInput.nextInt();
		
		System.out.print("実数y：");
		double y = standardInput.nextDouble();

		
		System.out.printf("x = %3d y =%6.2f\n", x, y);
		
	}

}
