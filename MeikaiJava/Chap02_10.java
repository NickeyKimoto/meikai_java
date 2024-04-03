package MeikaiJava;

import java.util.Scanner;

public class Chap02_10 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		// 引数で標準入力System.inを指定
			Scanner stdIn = new Scanner(System.in);
					
		// 姓の入力を促す
			System.out.print("姓：");
	    // 文字列を読み込む
			String a = stdIn.next();
			
		// 名の入力を促す
			System.out.print("名：");
        // 文字列を読み込む
			String b = stdIn.next();
			        
	    // 表示したい文章を表示する
			System.out.println("こんにちは" + a + b + "さん。");

	}

}
