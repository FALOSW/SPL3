import javax.swing.JOptionPane;

public class WörterRaten {

	public static void main(String[] args) {
		
		String wort = JOptionPane.showInputDialog("Bitte geben sie ein Wort ein!");
//		char[] w = wort.toCharArray();
		
		System.out.println("Das Wort hat " + wort.length() + " Buchstaben");
		JOptionPane.showInputDialog("Geben sie einen Buchstaben ein");
		
		
	}
	public static void AnzahlBuchstaben(char[] wort, char x) {
		int counter = 0;
		for (int i = 0; i < wort.length; i++) {
			if (wort[i] == x) {
				counter++;
			}
		}
		
	}
}
