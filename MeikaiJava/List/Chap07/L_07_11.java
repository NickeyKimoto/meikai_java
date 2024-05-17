package MeikaiJava.List.Chap07;

// 暗算力トレーニング

//ランダム関数を利用できるようにする
import java.util.Random;
//Javaでキーボードから標準入力を取得するために必要なScannerクラスをインポート
import java.util.Scanner;

public class L_07_11 {
	
	// 引数で標準入力System.inを指定
	static Scanner standardInput = new Scanner(System.in);
	
	//--- 続行の確認 ---//
	static boolean confirmRetry() { // 引数を受け取らない
		
		int cont;
		
		do {
			
			System.out.println("もう一度? <Yes ... 1 / No ... 0>：");
			cont = standardInput.nextInt();
			
		} while(cont != 0 && cont != 1);
		
		return cont == 1; // contが1であればtrue、そうでなければfalse
		
	}

	public static void main(String[] args) {

		// ランダムクラスのインスタンスを生成
		Random randomVariable = new Random();
		
		System.out.println("暗算力トレーニング!!");
		
		do {
			
			int x = randomVariable.nextInt(900) + 100; // 3桁の数
			int y = randomVariable.nextInt(900) + 100; // 3桁の数
			int z = randomVariable.nextInt(900) + 100; // 3桁の数
			
			while(true) {
				
				System.out.print(x + " + " + y + " + " + z + " = ");
				int k = standardInput.nextInt(); // 読み込んだ値
				
				if(k == x + y + z) { // 正解
					
					break;
					
				}
				
				System.out.println("違いますよ!!");
				
			}
			
		} while(confirmRetry());

	}

}
