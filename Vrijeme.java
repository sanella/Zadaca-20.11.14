
public class Vrijeme {
public static void main(String[] args) {
	System.out.println("Unesi pocetno vrijeme h: ");
	int h = TextIO.getInt();
	System.out.println("Unesi pocetno vrijeme min: ");
	int min = TextIO.getInt();
	
	System.out.println("Unesi krajnje vrijeme h: ");
	int hDva = TextIO.getInt();
	System.out.println("Unesi krajnje  vrijeme min: ");
	int minDva = TextIO.getInt();
	
	int prvo = h * 60 + min;
	int drugo = hDva * 60 + minDva;
	int vrijeme = drugo - prvo;
	System.out.println("Ukupno vrijeme u minutama: " + vrijeme);
	int vrijemeH = vrijeme / 60;
	System.out.println("Vrijeme u h: " + vrijemeH);
	int vrijemeM = vrijeme - (vrijemeH * 60);
	System.out.println("Vrijeme u m: " + vrijemeM);
	
	
}
}
