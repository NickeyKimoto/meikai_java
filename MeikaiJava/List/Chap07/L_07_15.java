package MeikaiJava.List.Chap07;

// 最も背が高い人の身長と最も太っている人の体重を求める

//Javaでキーボードから標準入力を取得するために必要なScannerクラスをインポート
import java.util.Scanner;

public class L_07_15 {
	
	//--- 配列aの最大値を求めて返却 ---//
	static int max0f(int[] a) {
		
		int max = a[0];
		
		for(int i = 1;i < a.length; i++) {
			
			if(a[i] > max) {
				
				max = a[i];
				
			}
			
		}
		
		return max;
		
	}

	public static void main(String[] args) {

		// Scannerオブジェクトを生成
		Scanner standardInput = new Scanner(System.in);
		
		System.out.print("人数は：");
		int ninzu = standardInput.nextInt(); // 人数を読み込む
		
		int[] height = new int[ninzu]; // 身長用の配列を生成
		int[] weight = new int[ninzu]; // 体重用の配列を生成
		
		System.out.println(ninzu + "人の身長と体重を入力せよ。");
		
		for(int i = 0; i < ninzu; i++) {
			
			System.out.print((i + 1) + "番目の身長");
			height[i] = standardInput.nextInt();
			System.out.print((i + 1) + "番目の体重");
			weight[i] = standardInput.nextInt();
			
		}
		
		System.out.println("最も背が高い人の身長："   + max0f(height) + "cm");
		System.out.println("最も太っている人の体重：" + max0f(weight) + "kg");

	}

}
