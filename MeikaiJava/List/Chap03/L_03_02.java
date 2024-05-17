package MeikaiJava.List.Chap03;

	//読み込んだ整数値は正の値か／そうでないか？
	
	//Javaでキーボードから標準入力を取得するために必要なScannerクラスをインポート
		import java.util.Scanner;

public class L_03_02 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		// 引数で標準入力System.inを指定
			Scanner stdIn = new Scanner(System.in);
							
	    // 整数値の入力を促す
			System.out.print("整数値：");
		// 整数値を読み込む
			int n = stdIn.nextInt();
					
		// もしもnが>0なら文章を表示、n > 0がtrueのときに実行される
			if (n > 0)
			    System.out.println("その値は正です。");
			
		// nが>0でなければ文章を表示、n > 0がfalseのときに実行される
			else
				System.out.println("その値は0か負です。");

	}

}
