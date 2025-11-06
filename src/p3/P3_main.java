package p3;

public class P3_main {
	public static void main(String[] args) {
		int x = 19;

//Betrag von x
		int absx = x;
		if (x < 0) absx = -x;

		System.out.println("Der Betrag von " + x + " ist " + absx);
//Quadrat von x
		int squarex=x;
		squarex=x*x;
		System.out.println("Das Quadrat von " + x + " ist " + squarex);
//Gerade oder Ungerade	}
		if (x%2==0) System.out.println( + x + " ist eine gerade Zahl");
		else System.out.println(+x+ " ist eine ungerade Zahl");
}
}
