package h1;

public class H1_main {
	public static void main(String[] args) {
//Initialisierung der Variablen
		double guthaben = -50.03, monEingang =-20;
		int rating = 4;
		boolean warnhinweis = true, negativ = true;
//Definition Beträge
		double abs_monEingang = monEingang;
		if (monEingang < 0) {
			abs_monEingang = -monEingang;
		}
		double abs_guthaben = guthaben;
		if (guthaben < 0) {
			abs_guthaben = -guthaben;
		}
//Hauptcode
		warnhinweis = false;
		if (guthaben < 0) {
			negativ = true;
			if (abs_monEingang >= guthaben) {
				rating = rating + 1;
			} else if (abs_monEingang < abs_guthaben) {
				rating = rating - 1;
				if (rating < 0) {
					warnhinweis = true;
				}
			}
		} else if (guthaben > 0) {
			rating = rating + 3;
			negativ = false;
		} else {
			rating = rating + 2;
			negativ = false;
		}
		System.out.println("rating= " + rating);
		System.out.println("negativ= " + negativ);
		System.out.println("Warnhinweis= " + warnhinweis);
	}
}
