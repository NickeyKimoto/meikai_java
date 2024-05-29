package MeikaiJava.List.Chap14.player;

/*
*クラス名：DVDPlayerTester
*概要：DVDPlayerクラスのテスト
*作成者：N.Kimoto
*作成日：2024/05/24
*/
public class DVDPlayerTester {

	/*
	*関数名：main
	*概要：DVDPlayerクラスのテスト
	*引数：なし
	*戻り値：なし
	*作成者：N.Kimoto
	*作成日：2024/05/24
	*/
	public static void main(String[] args) {
		// DVDPlayerのインスタンスを生成
		DVDPlayer playDVD = new DVDPlayer();
		// DVDを再生する
		playDVD.play();
		// DVDを停止する
		playDVD.stop();
		// DVDをスロー再生する
		playDVD.slow();

	}

}
