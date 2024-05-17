package MeikaiJava.List.Chap04;

// 負の整数値の絶対値を求める(ラベル付きbreak文の利用例)

//Javaでキーボードから標準入力を取得するために必要なScannerクラスをインポート
import java.util.Scanner;

public class L_04_21_C1 {

	public static void main(String[] args) {

		// 引数で標準入力System.inを指定
		Scanner standardInput = new Scanner(System.in);
		
		a: {
			
			System.out.print("負の整数：");
			int t = standardInput.nextInt(); 
			
			if (t >= 0) {
				
				break a;
				
			}
			
			t = -t;
			
			System.out.println("絶対値は" + t + "です。");
			
		}

	}

}
