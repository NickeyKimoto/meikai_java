package MeikaiJava.List.Chap07;

public class L_07_Last {

	// xのn乗を返す
	static double power(double x, int n) {

		double tmp = 1.0;

		while (n-- > 0) {

			tmp *= x;

		}

		return tmp;

	}

	// 文字cをn個連続表示
	static void putChars(char c, int n) {

		while (n-- > 0) {

			System.out.print(c);

		}

	}

	// aとbの最大値を返す
	static int max(int a, int b) {

		return (a > b) ? a : b;

	}

	// aとbの差を返す
	static int diff(int a, int b) {

		return (a > b) ? a - b : b - a;

	}

	// 配列aの全要素に0を代入
	static void arrayFill0(int[] a) {

		for (int i = 0; i < a.length; i++) {

			a[i] = 0;

		}

	}

	// 配列の最大値を返却
	static int max(int[] a) {

		int max = a[0];

		for (int i = 0; i < a.length; i++) {

			if (a[i] > max) {

				max = a[i];

			}

		}

		return max;

	}

	// aとbの和を返す
	static int sum0f(int a, int b) {

		return a + b;

	}

	// "Hello!"と表示
	static void hello() {

		System.out.print("Hello!");

	}

	// 要素数がnで値がkの配列を返す
	static int[] arrayFill0f(int n, int k) {

		int[] a = new int[n];

		for (int i = 0; i < n; i++) {

			a[i] = k;

		}

		return a;

	}

	// xの2乗を返す
	static int sqr(int x) {

		return x * x;

	}

	// xの3乗を返す
	static int cube(int x) {

		return x * sqr(x);

	}
	
	// aとbの平均を実数で返す
	static double ave0f(int a, int b) {
		
		return (double) (a + b) / 2;
		
	}

	public static void main(String[] args) {

	}

}
