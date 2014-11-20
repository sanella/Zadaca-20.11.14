
public class Brod {
public static void main(String[] args) {
	System.out.println("Unesi brzinu: ");
	int brzina = TextIO.getInt();
	System.out.println("Unesi udaljenost: ");
	int udaljenost = TextIO.getInt();
	double udaljenostA = (double) udaljenost * 1.60934 ;
	
	double time = (double) udaljenostA / brzina ;
	System.out.println("vrijeme po trebno da se predje put u sekundama: " + time);
}
}
