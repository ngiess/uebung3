package h2;

public class H2_main {
	public static void main(String[] args) {
		// Initialisierung
		int jahr = 0;
		boolean schalt = true;
		// Schaltjahrprüfung
		schalt=false;
		if (jahr%4 == 0) {
			schalt = true;
			if (jahr%100 == 0) {
				schalt = false;
				if (jahr%400 == 0)
					schalt = true;
			}
		}
		//Ausgabe
		if (schalt == true) {
			System.out.println("Das Jahr " + jahr + " ist ein Schaltjahr!");
		} else {
			System.out.println("Das Jahr " + jahr + " ist kein Schaltjahr!");
		}
	}
}
