package MeikaiJava.Chap03.Ensyu;

//Javaでキーボードから標準入力を取得するために必要なScannerクラスをインポート
import java.util.Scanner;

public class Ensyu3_13 {

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
	    
	    int man;
	    
	    if (min == a)
	    	if (b < c)
	    		man = b;
	    
	    	else
	    		man = c;
	    
	    else if (min == b)
	    	if (a < c)
	    		man = a;
	    
	    	else
	    		man = c;
	    else
	    	if (a < b)
	    		man = a;
	    
	    	else
	    		man = b;
	    
	// 中央値を表示
	    System.out.print("中央値は" + man + "です。");

	}

}
