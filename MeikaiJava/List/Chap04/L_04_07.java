package MeikaiJava.List.Chap04;

// 読み込んだ個数だけ*を表示（その1）

//Javaでキーボードから標準入力を取得するために必要なScannerクラスをインポート
import java.util.Scanner;

public class L_04_07 {

	public static void main(String[] args) {
		
		// 引数で標準入力System.inを指定
		Scanner standardInput = new Scanner(System.in);
		
		System.out.print("何個*を表示しますか：");
		int n = standardInput.nextInt();
		
		int i = 0;
		
		while (i < n) {
			
			System.out.print('*');
			i ++;
			
		}
		
		System.out.println();

	}

}
