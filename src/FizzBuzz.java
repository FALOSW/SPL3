
public class FizzBuzz {

	public static void main(String[] args) {
//		for (int i = 1; i <= 100; i++) {
//			FizzerBuzzer(i);
//		}
		for (int i = 0; i <= 100; i+=4) {
			FizzerBuzzer(i, false);
		}
	}

	public static void FizzerBuzzer(int i, boolean showFizzBuzz) {
		if (i % 4 == 0 && i % 7 == 0 && showFizzBuzz == true) {
			System.out.print("FizzerBuzzer");
		} else if (i % 4 == 0) {
			System.out.print("Fizzer ("+ i +")");
		} else if (i % 7 == 0) {
			System.out.print("Buzzer("+ i +")");
		} else {
			System.out.print(i);
		}
		System.out.println();

	}
}
