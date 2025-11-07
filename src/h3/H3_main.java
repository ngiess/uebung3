package h3;

public class H3_main {
	public static void main(String[] args) {
		int max = 5; // maximale Anzahl Fixplätze
		int fix = 2; // Anzahl vergebener Fixplätze
		int wartend = 2; // Anzahl Personen auf Warteliste
		boolean istVoll = false;
			
			istVoll = false;
			if (wartend >= max - fix) {
				wartend = wartend - (max - fix);
				fix = max;
			}
			if (wartend < max-fix) {
				fix=fix+wartend;
				wartend=0;
				
		}

		if (fix == max) {
			istVoll = true;
		}
		System.out.println("max= "+max);
		System.out.println("fix= "+fix);
		System.out.println("wartend= "+wartend);
		System.out.println("istVoll= "+istVoll);
	}
}
