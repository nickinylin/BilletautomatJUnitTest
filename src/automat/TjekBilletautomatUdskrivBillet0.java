package automat;

public class TjekBilletautomatUdskrivBillet0
{
	public static void main(String[] arg)
	{
		Billetautomat automat = new Billetautomat();

		int antalFejl = 0;
		int retur;
		
		
//		automat.indsætPenge(10);
//		automat.udskrivBillet();
//		retur = automat.udskrivBillet();
		
		System.out.println("*** Tjek af salg af en billet uden at indsætte penge");
		automat.indsætPenge(0);
		automat.udskrivBillet();
		automat.montørLogin("1234");
		
		
		if ( automat.getAntalBilletterSolgt() != 0) {
			System.out.println("FEJL, Antal billet solgt skal være 0, da der ikke blev indsat nogen penge, men den gav "+automat.getAntalBilletterSolgt());
			antalFejl = antalFejl + 1;
		
		
		
		}
		

		
		
		System.out.println();
		System.out.println();
		System.out.println("Der blev fundet "+antalFejl+" fejl i automaten");
		if (antalFejl == 0) {
			System.out.println("Automaten er fejlfri, HURRA!!!");
		} else {
			System.out.println("Automaten har fejl, ØV!!!");			
		}
	}
}