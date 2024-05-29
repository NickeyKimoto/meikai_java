package MeikaiJava.List.Chap14.player;

// 着せかえ可能な携帯プレーヤ

class PortablePlayer implements Player, Skinnable {
	private int skin = BLACK;
	
	public PortablePlayer() { } // コンストラクタ
	
	public void play() {
		System.out.println("◇再生開始！"); // ○再生
	}
	
	public void stop() {
		System.out.println("◇再生終了！"); // ○停止
	}
	
	/*
	*関数名：changeSkin
	*概要：スキンを変更する
	*引数：スキンの色を表す数値(int型)
	*戻り値：なし
	*作成者：N.Kimoto
	*作成日：2024/05/24
	*/
	public void changeSkin(int skin) {
		// スキンを変えることを表示
		System.out.print("スキンを");
		// 引数によってスキンの色を決定する
		switch (skin) {
		// 漆黒に決定する場合
		case BLACK:
			// 変更先の色の名前を表示
			System.out.print("漆黒"); 
			// 変更を完了
			break;
		// 深紅に決定する場合
		case RED:
			// 変更先の色の名前を表示
			System.out.print("深紅");
			// 変更を完了
			break;
		// 柳葉に決定する場合
		case GREEN:
			// 変更先の色の名前を表示
			System.out.print("柳葉");
			// 変更を完了
			break;
		// 露草に決定する場合
		case BLUE:
			// 変更先の色の名前を表示
			System.out.print("露草");
			// 変更を完了
			break;
		// 豹柄に決定する場合
		case LEOPARD:
			// 変更先の色の名前を表示
			System.out.print("豹柄");
			// 変更を完了
			break;
		// 無地に決定する場合
		default :
			// 変更先の色の名前を表示
			System.out.print("無地");
			// 変更を完了
			break;
		}
		// 変更を完了したことを表示
		System.out.println("に変更しました。");
		
	}

}
