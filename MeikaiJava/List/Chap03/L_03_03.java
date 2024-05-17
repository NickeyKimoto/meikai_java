package MeikaiJava.List.Chap03;

	//読み込んだ二つの整数値は等しいか
	
	//Javaでキーボードから標準入力を取得するために必要なScannerクラスをインポート
		import java.util.Scanner;

public class L_03_03 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		// 引数で標準入力System.inを指定
			Scanner stdIn = new Scanner(System.in);
					
	    // 整数aの入力を促し読み込む
			System.out.print("整数a："); int a = stdIn.nextInt();
		// 整数bの入力を促し読み込む
			System.out.print("整数b："); int b = stdIn.nextInt();
			
		// もしも左右のオペランドが等しいなら文章を表示
			if (a == b)
				System.out.println("二つの値は等しいです。");
		// もしも左右のオペランドが等しくないなら文章を表示
			else
				System.out.println("二つの値は等しくありません。");

	}

}
