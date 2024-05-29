package MeikaiJava.List.Chap14.player;

/*
*クラス名：DVDPlayer
*概要：DVDプレーヤの操作を行う
*作成者：N.Kimoto
*作成日：2024/05/24
*/
class DVDPlayer implements ExPlayer {
	
	/*
	*関数名：play
	*概要：DVDを再生する
	*引数：なし
	*戻り値：なし
	*作成者：N.Kimoto
	*作成日：2024/05/24
	*/
	public void play() {
		// DVDを再生したことを表示
		System.out.println("■DVD再生開始！");
	}
	
	/*
	*関数名：stop
	*概要：DVDを停止する
	*引数：なし
	*戻り値：なし
	*作成者：N.Kimoto
	*作成日：2024/05/24
	*/
	public void stop() {
		// DVDを停止したことを表示
		System.out.println("■DVD再生終了！");
	}
	
	/*
	*関数名：slow
	*概要：DVDをスロー再生する
	*引数：なし
	*戻り値：なし
	*作成者：N.Kimoto
	*作成日：2024/05/24
	*/
	public void slow() {
		// DVDをスロー再生したことを表示
		System.out.println("■DVDスロー再生開始！");
	}

}
