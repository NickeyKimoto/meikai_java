package MeikaiJava.List.Chap15;
// 文字列を1文字ずつ走査して表示

import java.util.Scanner;

public class L_15_05 {

	public static void main(String[] args) {
		Scanner standardInput = new Scanner(System.in);
		
		System.out.print("文字列s：");
		String s = standardInput.next();
		
		for (int i = 0; i < s.length(); i++)
			System.out.println("s[" + i + "] = " + s.charAt(i));

	}

}
