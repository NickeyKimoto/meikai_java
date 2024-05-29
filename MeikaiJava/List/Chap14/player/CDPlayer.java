package MeikaiJava.List.Chap14.player;

// CDプレーヤ

public class CDPlayer implements Player  {
	
	public void play() {
		System.out.println("□CD再生開始！"); // ○再生
	}
	
	public void stop() {
		System.out.println("□CD再生終了！"); // ○停止
	}
	
	public void cleaning() {
		System.out.println("□ヘッドをクリーニングしました。"); // クリーニング
	}

}
