package MeikaiJava.List.Chap02;

	//名前を読み込んで挨拶する（その２：nextLine()版）
	
	//Javaでキーボードから標準入力を取得するために必要なScannerクラスをインポート
	import java.util.Scanner;

public class L_02_16 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		// 引数で標準入力System.inを指定
			Scanner stdIn = new Scanner(System.in);
							
		// 名前の入力を促す
			System.out.print("お名前は：");
		// 1行分の文字列を読み込む
			String s = stdIn.nextLine();
			        
		// 表示したい文章を表示する
			System.out.println("こんにちは" + s + "さん。");

	}

}
