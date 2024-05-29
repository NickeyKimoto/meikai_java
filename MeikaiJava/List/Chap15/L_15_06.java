package MeikaiJava.List.Chap15;
// 文字列探索

import java.util.Scanner;

public class L_15_06 {

	public static void main(String[] args) {
		Scanner standardInput = new Scanner(System.in);
		
		System.out.print("文字列s1：");
		String s1 = standardInput.next();
		
		System.out.print("文字列s2：");
		String s2 = standardInput.next();

		int idx = s1.indexOf(s2);
		if (idx == -1)
			System.out.println("s1中にs2は含まれません。");
		else
			System.out.println("s1の" + (idx + 1) + "文字目にs2が含まれます。");
	}

}
