package MeikaiJava.List.Chap04;

//正の整数値を０までカウントダウン（その２）

//Javaでキーボードから標準入力を取得するために必要なScannerクラスをインポート
import java.util.Scanner;

public class L_04_05 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		// 引数で標準入力System.inを指定
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("カウントダウンします。");
	    // xを初期化する
	    int x;
	    
	    do {
	    	// 正の整数値の入力を促す
	    	System.out.print("正の整数値：");
	    	// 入力された正の整数値を読み込む
	    	x = stdIn.nextInt();
	    	
	    	// xが正の整数値になるまで繰り返す
	    } while (x <= 0);
	    
	 // xが0になるまで繰り返す
	    while (x >= 0) {
	    	// xの値を表示
	    	System.out.println(x--);
	    }
	}

}
