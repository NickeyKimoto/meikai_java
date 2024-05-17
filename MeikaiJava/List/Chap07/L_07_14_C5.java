package MeikaiJava.List.Chap07;

public class L_07_14_C5 {
	
	static int countBits(int x) {
		
		x = (x & 0x55555555) + (x >> 1 & 0x55555555);
		x = (x & 0x33333333) + (x >> 2 & 0x33333333);
		x = (x & 0x0f0f0f0f) + (x >> 4 & 0x0f0f0f0f);
		x = (x & 0x00ff00ff) + (x >> 8 & 0x00ff00ff);
		
		return (x & 0x0000ffff) + (x >> 16 & 0x0000ffff);
		
	}

	public static void main(String[] args) {

	}

}
