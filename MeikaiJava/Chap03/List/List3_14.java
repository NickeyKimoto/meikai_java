package MeikaiJava.Chap03.List;

// 二つの変数を昇順（小さい順）にソート

//Javaでキーボードから標準入力を取得するために必要なScannerクラスをインポート
import java.util.Scanner;

public class List3_14 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		// 引数で標準入力System.inを指定
				Scanner stdIn = new Scanner(System.in);
				
				// 整数aの入力を促し、読み込む
				System.out.print("整数a："); int a = stdIn.nextInt();
			// 整数bの入力を促し、読み込む
			    System.out.print("整数b："); int b = stdIn.nextInt();
			    
			// aがbより大きければそれらの値を交換
			    if(a > b) {
			    	// tをaで初期化
			    	int t = a;
			    	// aにbを代入
			    	a = b;
			    	// bにtを代入
			    	b = t;
			    }
			    
			 // 文章を表示
			    System.out.println("a≦bとなるようにソートしました。");
			 // 変数aを表示
			    System.out.println("変数aは" + a + "です。");
			 // 変数bを表示
			    System.out.println("変数bは" + b + "です。");



	}

}
