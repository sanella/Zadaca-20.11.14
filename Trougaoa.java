
public class Trougaoa {
public static void main(String[] args) {
		
		System.out.println("Unesi stranicu a trougla ");
		int a = TextIO.getInt();
		
		System.out.println("Unesi stranicu b trougla ");
		int b = TextIO.getInt();
		
		System.out.println("Unesi stranicu c trougla ");
		int c = TextIO.getInt();
		
		double povrsina = (double) (a + b + c) / 2;
		double aUgao = Math.cos(( b * b ) + (c * c)  - (a * a)) / 2 * b * c;
		double aUgaoCos = Math.
		System.out.println("Ugao nad stranicom a " + aUgao);
		
		double bUgao = Math.cos((c * c) + (a * a ) - (b * b)) / 2 * a * c;
		System.out.println("Ugao nad stranicom b " + aUgao);

		double cUgao = 180 - aUgao - bUgao ;
		System.out.println("Ugao nad stranicom c " + cUgao);
}	
}
