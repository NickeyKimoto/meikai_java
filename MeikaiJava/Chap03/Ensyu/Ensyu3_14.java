package MeikaiJava.Chap03.Ensyu;

//Javaでキーボードから標準入力を取得するために必要なScannerクラスをインポート
import java.util.Scanner;

public class Ensyu3_14 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		// 引数で標準入力System.inを指定
		Scanner stdIn = new Scanner(System.in);
										
	// 整数aの入力を促し、読み込む
		System.out.print("整数a："); int a = stdIn.nextInt();
	// 整数bの入力を促し、読み込む
	    System.out.print("整数b："); int b = stdIn.nextInt();
	    
	// 小さいほうの値／大きいほうの値
	    int min, max;
	    
	    if (a == b) {
	    	// 値が同じであることを表示
		    System.out.println("二つの値は同じです。");
	    } else {
	    
	// aがbより小さければ
	    if(a < b) {
	    	// 最小値はa
	    	min = a;
	    	// 最大値はb
	    	max = b;
	// そうでなければ
	    } else {
	    	// 最小値はb
	    	min = b;
	    	// 最大値はa
	    	max = a;
	    }
	    
	    
	 // 最小値を表示
	    System.out.println("小さいほうの値は" + min + "です。");
	 // 最大値を表示
	    System.out.println("大きいほうの値は" + max + "です。");
	    }

	}

}
