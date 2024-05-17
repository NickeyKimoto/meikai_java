package MeikaiJava.List.account3;

// 銀行口座クラス【第3版】

/*
*クラス名：Account
*概要：銀行口座情報を入力し管理、表示する
*作成者：N.Kimoto
*作成日：2024/05/07
*/

public class Account {
	
	// クラス変数(静的フィールド)
	private static int counter = 0; // 何番までの識別番号を与えたか
	
	// インスタンス変数(非静的フィールド)
	// 口座名義を表すインスタンス変数を宣言
	private String name;
	// 口座番号を表すインスタンス変数を宣言
	private String no;
	// 預金残高を表すインスタンス変数を宣言
	private long balance;
	// 識別番号を表すインスタンス変数を宣言
	private int id;
	
	/*
	*コンストラクタ名：Account
	*概要：インスタンスの初期化
	*引数：口座名義(String型)、口座番号(String型)、預金残高(long型)、
	*戻り値：なし
	*作成者：N.Kimoto
	*作成日：2024/05/07
	*/
	
	public Account(String n, String num, long z) {

		// 口座名義を表すインスタンス変数を初期化
		this.name = n;
		// 口座番号を表すインスタンス変数を初期化
		this.no = num;
		// 預金残高を表すインスタンス変数を初期化
		this.balance = z;
		// 識別番号を表すインスタンス変数を初期化
		id = ++ counter;
		

	}
	
	/*
	*関数名：getName
	*概要：口座名義を表すフィールドの値を取得
	*引数：なし
	*戻り値：口座名義(String型)
	*作成者：N.Kimoto
	*作成日：2024/05/07
	*/
	
	public String getName() {

		// 口座名義を表すフィールドの値を返却
		return name;

	}

	/*
	*関数名：getNo
	*概要：口座番号を表すフィールドの値を取得
	*引数：なし
	*戻り値：口座番号(String型)
	*作成者：N.Kimoto
	*作成日：2024/05/07
	*/
	
	public String getNo() {

		// 口座番号を表すフィールドの値を返却
		return no;

	}

	/*
	*関数名：getBalance
	*概要：預金残高を表すフィールドの値を取得
	*引数：なし
	*戻り値：預金残高(long型)
	*作成者：N.Kimoto
	*作成日：2024/05/07
	*/
	
	public long getBalance() {

		// 預金残高を表すフィールドの値を返却
		return balance;

	}
	
	/*
	*関数名：getId
	*概要：識別番号を表すフィールドの値を取得
	*引数：なし
	*戻り値：識別番号(int型)
	*作成者：N.Kimoto
	*作成日：2024/05/08
	*/
	
	public int getId() {
		
		// 識別番号を表すフィールドの値を返却
				return id;
		
	}
	
	/*
	*関数名：deposit
	*概要：指定した口座にお金を預ける
	*引数：預けたお金
	*戻り値：なし
	*作成者：N.Kimoto
	*作成日：2024/05/02
	*/
	
	void deposit(long k) {

		// 預金残高に預けたお金を加算する
		balance += k;

	}

	/*
	*関数名：withdraw
	*概要：指定した口座からお金をおろす
	*引数：おろしたお金
	*戻り値：なし
	*作成者：N.Kimoto
	*作成日：2024/05/02
	*/
	
	void withdraw(long k) {

		// 預金残高からおろしたお金を減算する
		balance -= k;

	}

}
