package MeikaiJava.List.car1;

//自動車クラス【第1版】の利用例(その2：対話的に自動車を移動)

//Javaでキーボードから標準入力を取得するために必要なScannerクラスをインポート
import java.util.Scanner;

public class CarTester2 {

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
		
		Car myCar = new Car(name, width, height, length, fuel);
		
		while (true) {
			
			System.out.println("現在地(" + myCar.getX() + "km, " 
			+ myCar.getY() + "km)・残り燃料 "+ myCar.getFuel() + "L");
			System.out.print("移動しますか[0…No / 1…Yes]：");
			
			if (standardInput.nextInt() == 0) {
				
				break;
				
			}
			
			System.out.print("X方向の移動距離：");
			double dx = standardInput.nextDouble();
			System.out.print("Y方向の移動距離：");
			double dy = standardInput.nextDouble();
			
			if (!myCar.move(dx, dy)) {
				
				System.out.println("燃料が足りません！");
				
			}
			
			
			
		}

	}

}
