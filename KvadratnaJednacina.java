
public class KvadratnaJednacina {
public static void main(String[] args) {
	
	System.out.println("Unesi a ");
	int a = TextIO.getInt();
	
	System.out.println("Unesi b ");
	int b = TextIO.getInt();
	
	System.out.println("Unesi c ");
	int c = TextIO.getInt();
	
	int D = b * b - 4 * a * c;
	System.out.println("D iynosi " + D);
	
	if (D == 0) {
		int x = - b / 2 * a;
		System.out.println("x iynosi " + x);}
	if (D > 0) {
		double xa = (double) ((- b + Math.sqrt(D)) / 2) ;
		double xb = (double) ((- b - Math.sqrt(D)) / 2) ;
		System.out.println("x 1 i 2 " + xa + xb);
	}
	if (D < 0) {
		System.out.println("jednacina nema realna rjesenja ");
		
	}
}
}
