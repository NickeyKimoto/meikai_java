package MeikaiJava;

    // Javaでキーボードから標準入力を取得するために必要なScannerクラスをインポート
    import java.util.Scanner;

public class Chap02_3 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		// 引数で標準入力System.inを指定
		Scanner stdIn = new Scanner(System.in);
		
		// 整数値と表示
		System.out.print("整数値");
		// aに数値を読み込む
		int a = stdIn.nextInt();
		
		// 入力された値を表示
		System.out.println(a +"と入力しましたね。");
		
		
		

	}

}
