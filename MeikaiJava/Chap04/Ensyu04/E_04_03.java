package MeikaiJava.Chap04.Ensyu04;

//Javaでキーボードから標準入力を取得するために必要なScannerクラスをインポート
import java.util.Scanner;

public class E_04_03 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		// 引数で標準入力System.inを指定
		Scanner stdIn = new Scanner(System.in);
		
		// 整数aの入力を促し、読み込む
		System.out.print("整数a："); int a = stdIn.nextInt();
	// 整数bの入力を促し、読み込む
	    System.out.print("整数b："); int b = stdIn.nextInt();
	    
	    int min, max;
	    
	// aがbより大きければそれらの値を交換
	    if(a > b) {
	    	max = a;
	    	min = b;
	    } else {
	    	max = b;
	    	min = a;
	    }
	    
	    System.out.print(min + " ");
	    
//	    if (min != max)
	    
	    do {
	    	min = min + 1;
	    	System.out.print(min + " ");
	    	
	    } while (min != max);
	    
	    
	    	

	}

}
