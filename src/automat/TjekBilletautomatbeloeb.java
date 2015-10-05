package automat;

public class TjekBilletautomatbeloeb
{
	public static void main(String[] arg)
	{
		Billetautomat automat = new Billetautomat();

		// Hvis man indsætter 20 kr, giver den rigtig beløb tilbage, MEN den skriver at
		// der er fejl og at den skulle give 0, Den skal selvfølgelig kunne give
		// alle slags beløb tilbage.
		
		int antalFejl = 0;
		int retur;

		retur = automat.getBilletpris();
		if (retur != 10) {
			System.out.println("FEJL, getBilletpris() != 10");
		}

		System.out.println("*** Tjek af salg af en billet");
		automat.indsætPenge(20);
		automat.udskrivBillet();
		retur = automat.returpenge();
		if (retur != 0) {
			System.out.println("FEJL, returpenge() skulle give 0, men den gav: "+retur);
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
