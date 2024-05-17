package MeikaiJava.List.Chap04;

// 読み込んだ整数のグループを加算(整数5*10グループ)

//Javaでキーボードから標準入力を取得するために必要なScannerクラスをインポート
import java.util.Scanner;

public class L_04_21 {

	public static void main(String[] args) {

		// 引数で標準入力System.inを指定
		Scanner standardInput = new Scanner(System.in);

		// プログラム内容を表示
		System.out.println("整数を加算します。");
		int total = 0; // 全グループの合計
		
		Outer:
			
			for(int i = 1; i <= 10; i++) {
				
				System.out.println("■第" + i + "グループ");
					
				for (int j = 0; j < 5; j++) {
					
					System.out.print("整数：");
					int t = standardInput.nextInt();
					
					if (t == 99999) { // 99999を入力すると全体の入力を終了する
						
						break Outer;
						
					// 88888を入力すると現在入力中グループの入力を終了する
					} else if (t == 88888) { 
						
						continue Outer;
						
					}
						
						total += t;
						
				}
				
			}
		
		System.out.println("\n合計は" + total + "です。");

	}

}