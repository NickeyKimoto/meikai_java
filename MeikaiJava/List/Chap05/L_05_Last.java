package MeikaiJava.List.Chap05;

//Javaでキーボードから標準入力を取得するために必要なScannerクラスをインポート
import java.util.Scanner;

public class L_05_Last {

	public static void main(String[] args) {

		// 引数で標準入力System.inを指定
		Scanner standardInput = new Scanner(System.in);
		
		System.out.println("15   / 2   = " + 15   / 2  );
		System.out.println("15.0 / 2.0 = " + 15.0 / 2.0);
		System.out.println("15.0 / 2   = " + 15.0 / 2  );
		System.out.println("15   / 2.0 = " + 15   / 2.0);
		
		System.out.print("変数x："); int x = standardInput.nextInt();
		System.out.print("変数y："); int y = standardInput.nextInt();
		
		boolean eq = (x == y);
		

		System.out.println("それらは等し" + (eq ? "いです。" : "くないです。"));
		
		System.out.println("平均値は" + (double)(x + y) / 2 + "です。");
		
		for (int i = 0; i <= 1000; i++) {
			
			System.out.printf("x = %6.5f\n", (float)i / 1000); // キャスト
			
		}
		
		System.out.println("\"ABC\"は文字列リテラル。"); // 単一の二重引用符"を表す
		
		for (int i = 0; i <= 3; i++) {
			
			for(int j = 0; j <= i; j ++) {
				
				System.out.print('\\'); // 単一の逆斜線\を表す
				
			}
			
			System.out.println();
			
		}
		
	}

}
