package MeikaiJava.List.Chap12.pet;

class RobotPet extends Pet implements Work, Skinnable{
	
	// コンストラクタ
	public RobotPet(String name, String masterName) {
		
		super(name, masterName); // スーパークラスのコンストラクタ
		
	}
	
	// 自己紹介
	public void introduce() {
		
		System.out.println("◇私はロボット。名前は" + getName() + "。");
		System.out.println("◇ご主人様は" + getMasterName() + "。");
		
	}
	
	// 家事をする
	public void work(int sw) {
		
		switch (sw) {
		
		case 0 : System.out.println("掃除します。"); break;
		case 1 : System.out.println("洗濯します。"); break;
		case 2 : System.out.println("炊事します。"); break;
		
		}
		
	}
	
	public void changeSkin(int skin) {
		System.out.print("スキンを");
		
		switch (skin) {
		case BLACK:		System.out.print("漆黒"); break;
		case RED:		System.out.print("深紅"); break;
		case GREEN:		System.out.print("柳葉"); break;
		case BLUE:		System.out.print("露草"); break;
		case LEOPARD:	System.out.print("豹柄"); break;
		default :		System.out.print("無地"); break;
		}
		System.out.println("に変更しました。");
		
	}
	
}
