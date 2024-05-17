package MeikaiJava.List.car2;

// 自動車クラス【第2版】の利用例(その3)

//Javaでキーボードから標準入力を取得するために必要なScannerクラスをインポート
import java.util.Scanner;

public class CarTester3 {

	public static void main(String[] args) {

		// Scannerオブジェクトを生成
		Scanner standardInput = new Scanner(System.in);
		
		System.out.println("車のデータを入力せよ。");
		
		System.out.print("名前は：");
		String name = standardInput.next();
		System.out.print("車幅は：");
		int width = standardInput.nextInt();
		System.out.print("高さは：");
		int height = standardInput.nextInt();
		System.out.print("長さは：");
		int length = standardInput.nextInt();
		System.out.print("ガソリン量は：");
		double fuel = standardInput.nextDouble();
		System.out.print("購入年：");
		int y = standardInput.nextInt();
		System.out.print("購入月：");
		int m = standardInput.nextInt();
		System.out.print("購入日：");
		int d = standardInput.nextInt();
		
		Car car2 = new Car(name, width, height, length, fuel, new Day(y, m, d));
		
		car2.putSpec();
		System.out.println("購入日：" + car2.getPurchaseDay());

	}

}
