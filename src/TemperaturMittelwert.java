
public class TemperaturMittelwert {

	public static void main(String[] args) {
		int[] temp = new int[1000];
		// 0 bis 40 Grad
		for (int i = 0; i < temp.length; i++) {
			temp[i] = (int) (Math.random() * 41);
		}

		// # Temperaturwerte < 10 Grad
		int unter10Grad = 0;
		for (int i = 0; i < temp.length; i++) {
			if (temp[i] < 10) {
				unter10Grad++;
			}
		}
		System.out.println(unter10Grad + " Werte < 10 Grad.");

		// # Temperaturwerte >= 10 und < 20 Grad
		int zwichen10und20Grad = 0;
		for (int i = 0; i < temp.length; i++) {
			if (temp[i] >= 10 && temp[i] < 20) {
				zwichen10und20Grad++;
			}
		}
		System.out.println(zwichen10und20Grad + " Werte >=10 und < 20 Grad.");
		
		// # Temperaturwerte >= 20 Grad
		int größerAls20Grad = 0;
		for (int i = 0; i < temp.length; i++) {
			if (temp[i] >= 20) {
				größerAls20Grad++; 
			}
		}
		System.out.println(größerAls20Grad + " Werte >= 20 Grad.");
	}
		public static void TemperaturWerteAnzahl(int[] temp, int i) {
			int unter10Grad = 0;
			int zwichen10und20Grad = 0;
			int größerAls20Grad = 0;
			
			
			
			
			
			
			
			
		}
}
