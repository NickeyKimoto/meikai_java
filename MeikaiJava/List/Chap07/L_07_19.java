package MeikaiJava.List.Chap07;

// 全要素がインデックスと同じ値を持つ配列の生成

//Javaでキーボードから標準入力を取得するために必要なScannerクラスをインポート
import java.util.Scanner;

public class L_07_19 {
	
	//--- 全要素がインデックスと同じ値を持つ要素数nの配列を生成して返却 ---//
	static int[] idxArray(int n) {
		
		int[] a = new int[n]; // 要素数nの配列
		
		for (int i = 0; i < n; i++) {
			
			a[i] = i;

		}
		
		return a;
		
	}

	public static void main(String[] args) {

		// Scannerオブジェクトを生成
		Scanner standardInput = new Scanner(System.in);
		
		System.out.print("要素数は："); // 要素数
		int n = standardInput.nextInt();

		int[] firstArray = idxArray(n); // 要素数nの配列
		
		for (int i = 0; i < n; i++) {
			
			System.out.println("a[" + i + "] = " + firstArray[i]);
			
		}

	}

}
