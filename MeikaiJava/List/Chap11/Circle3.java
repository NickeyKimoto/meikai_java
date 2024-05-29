package MeikaiJava.List.Chap11;

import static java.lang.Math.*;
import static java.lang.System.*;

//円の面積を求める(System.inとSystem.outを静的インポート)

import java.util.Scanner;

public class Circle3 {

	public static void main(String[] args) {

		// Scannerオブジェクトを生成
		Scanner standardInput = new Scanner(in);
		
		out.println("円の面積を求めます。");
		out.print("半径：");
		double r = standardInput.nextDouble();
		out.println("面積は" + (PI * r * r) + "です。");

	}

}
