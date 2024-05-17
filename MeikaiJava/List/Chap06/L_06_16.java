package MeikaiJava.List.Chap06;

//ランダム関数を利用できるようにする
import java.util.Random;
//Javaでキーボードから標準入力を取得するために必要なScannerクラスをインポート
import java.util.Scanner;

public class L_06_16 {

	public static void main(String[] args) {

		// 引数で標準入力System.inを指定
		Scanner standardInput = new Scanner(System.in);
		// ランダムクラスのインスタンスを生成
		Random randomVariable = new Random();
		
		System.out.print("行数：");
		int h = standardInput.nextInt(); // 行数を読み込む
		
		System.out.print("列数：");
		int w = standardInput.nextInt(); // 列数を読み込む
		
		int[][] x = new int[h][w];
		
		for (int i = 0; i < h; i++) {
			
			for (int j = 0; j < w; j++) {
			
				x[i][j] = randomVariable.nextInt(100);
			
				System.out.println("x[" + i + "][" + j + "] = " + x[i][j]);
				
			}
			
		}

	}

}
