package MeikaiJava.Chap02;

	/*
	*クラス名：E_02_10
	*概要：名前の姓と名を個別に読み込んで挨拶を行うプログラム
	*作成者：N.Kimoto
	*作成日：2024/04/04
	*/
	
	//Javaでキーボードから標準入力を取得するために必要なScannerクラスをインポート
	import java.util.Scanner;

public class E_02_10 {
	
	/*
	*関数名：main
	*概要：名前の姓と名を個別に読み込んで挨拶を行うプログラム
	*引数：なし
	*戻り値：なし
	*作成者：N.Kimoto
	*作成日：2024/04/04
	*/

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		// 引数で標準入力System.inを指定
			Scanner stdIn = new Scanner(System.in);
							
		// 姓の入力を促す
			System.out.print("姓：");
	    // 文字列を読み込む
			String familyName = stdIn.next();
			
		// 名の入力を促す
			System.out.print("名：");
        // 文字列を読み込む
			String firstName = stdIn.next();
			        
	    // 表示したい文章を表示する
			System.out.println("こんにちは" + familyName + firstName + "さん。");

	}

}
