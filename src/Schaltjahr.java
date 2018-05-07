import javax.swing.JOptionPane;

public class Schaltjahr {

	public static void main(String[] args) {
		// Jahr eingeben

		// Überprüfen, ob ein Schaltjahr
		// mit Funktionen

		// z.B. 2016 ist ein Schaltjahr
		int Jahr = 0;
		String j = JOptionPane.showInputDialog("Bite geben sie ein Jahr ein");
		Jahr = Integer.parseInt(j);
		Schaltjahr(Jahr);
		
	}

	public static void Schaltjahr(int j) {
		if (j % 4 == 0) {
			if (j % 100 != 0 || j % 400 == 0) {
				System.out.println(j + " ist ein Schaltjahr");
			}
		} else {
			System.out.println(j + " ist KEIN Schaltjahr");
		}

	}
}