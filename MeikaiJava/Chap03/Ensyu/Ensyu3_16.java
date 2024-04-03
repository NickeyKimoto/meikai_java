package MeikaiJava.Chap03.Ensyu;

//Javaでキーボードから標準入力を取得するために必要なScannerクラスをインポート
import java.util.Scanner;

public class Ensyu3_16 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		// 引数で標準入力System.inを指定
		Scanner stdIn = new Scanner(System.in);
		
		// 整数aの入力を促し、読み込む
		System.out.print("整数a："); int a = stdIn.nextInt();
	    // 整数bの入力を促し、読み込む
	    System.out.print("整数b："); int b = stdIn.nextInt();
	    // 整数cの入力を促し、読み込む
	    System.out.print("整数c："); int c = stdIn.nextInt();
	    
	// minをaの値で初期化する
	    int min = a;
	// bの値がminよりも小さければ、minにbの値を代入する。
	    if (b < min) min = b;
	// cの値がminよりも小さければ、minにcの値を代入する。
	    if (c < min) min = c;
	    
	// aが最小値だった場合
	    if (min == a) {
	    	// bよりcのほうが小さい場合
	    	
	    	if (b > c) {
	    		// tをbで初期化
		    	int t = b;
		    	// bにcを代入
		    	b = c;
		    	// cにtを代入
		    	c = t;
	    	}
	    	
	// bが最小値だった場合
	    } else if (min == b) {
	    	// cよりaのほうが小さい場合
	    	if (c > a) {
	    		// uをaで初期化
	    		int u = a;
	    		// aにbを代入
	    		a = b;
	    		// bにuを代入
	    		b = u;
	        // aよりcのほうが小さい場合
	    	} else {
	    		// uをaで初期化
	    		int u = a;
	    		// aにbを代入
	    		a = b;
	    		// bにcを代入
	    		b = c;
	    		// cにuを代入
	    		c = u;
	    	}
	    
	// cが最小値だった場合
	    } else {
	    	// bよりaのほうが小さい場合
	        if (b > a) {
	        	// vをaで初期化
	        	int v = a;
	        	// aにcを代入
	        	a = c;
	        	// cにbを代入
	        	c = b;
	        	// bにvを代入
	        	b = v;
	        // aよりbのほうが小さい場合
	        } else {
	        	// vをaで初期化
	        	int v = a;
	        	// aにcを代入
	        	a = c;
	        	// cにvを代入
	        	c = v;
	        }
	    	
	    }
	    
	 // 文章を表示
	    System.out.println("a≦b≦cとなるようにソートしました。");
	 // 変数aを表示
	    System.out.println("変数aは" + a + "です。");
	 // 変数bを表示
	    System.out.println("変数bは" + b + "です。");
	 // 変数cを表示
	    System.out.println("変数cは" + c + "です。");

	}

}