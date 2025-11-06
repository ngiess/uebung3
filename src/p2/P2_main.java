package p2;

public class P2_main {
	public static void main(String[] args) {
int a=25, b=25, c=49, d=5;
boolean E1=(a==b), E2=(a==b || a==c), E3=(c==b+a), E4=(a+b+c>=100);
d=0;
if (E1==true) d=d+1;
if (E2==true) d=d+1;
if (E3==true) d=d+1;
if (E4==true) d=d+1;
System.out.println("Es sind " +d+ " Eigenschaften erfüllt.");
}
}
