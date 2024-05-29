package MeikaiJava.List.Chap11;

import static java.lang.Math.*;

// 円の面積を求める(円周率Math.PIを静的インポート)

import java.util.Scanner;

class Circle2 {

	public static void main(String[] args) {

		// Scannerオブジェクトを生成
		Scanner standardInput = new Scanner(System.in);
		
		System.out.println("円の面積を求めます。");
		System.out.print("半径：");
		double r = standardInput.nextDouble();
		System.out.println("面積は" + (PI * r * r) + "です。");

	}

}
