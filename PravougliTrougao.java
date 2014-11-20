
public class PravougliTrougao {
public static void main(String[] args) {

	System.out.println("Unesi stranicu a trougla ");
	int a = TextIO.getInt();
	
	System.out.println("Unesi stranicu b trougla ");
	int b = TextIO.getInt();
	
	System.out.println("Unesi stranicu c trougla ");
	int c = TextIO.getInt();
	
	if (c * c == a * a + b * b) {
		System.out.println("Ovo je pravougli trougao ");
		}
	else { 
		System.out.println("Ovo nije pravougli trougao ");
	}
}
}
