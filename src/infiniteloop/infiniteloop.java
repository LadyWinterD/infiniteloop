package infiniteloop;

public class infiniteloop {
	private static int num;
	
	private static void method1(int endNum) {
		if (num < endNum) {
			System.out.println("method"+ num);
			num += 1;
			method2(endNum);
		}
	}

	private static void method2(int endNum) {
		method3(endNum);
	}

	private static void method3(int endNum) {
		method4(endNum);
	}

	private static void method4(int endNum) {
		method1(endNum);
	}

	public static void main(String[] args) {
		infiniteloop.method1(4);
	}

}