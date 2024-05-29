package MeikaiJava.List.Chap14.player;

// インタフェースPlayerの利用例

public class PlayerTester {

	public static void main(String[] args) {
		Player[] a = new Player[2];
		a[0] = new VideoPlayer(); // ビデオプレーヤ
		a[1] = new CDPlayer();    // CDプレーヤ
		
		for (Player p : a) {
			p.play(); // 再生
			p.stop(); // 停止
			System.out.println();
		}
	}

}
