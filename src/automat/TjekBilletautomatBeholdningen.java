package automat;

import sun.security.action.GetBooleanAction;

public class TjekBilletautomatBeholdningen
{
	public static void main(String[] arg)
	{
		Billetautomat automat = new Billetautomat();

		int antalFejl = 0;
		int retur;

		System.out.println("*** Tjek af beholdningen");
		automat.indsætPenge(30);
		automat.udskrivBillet();
		automat.montørLogin("1234");
		automat.setBilletpris(20);
		automat.udskrivBillet();

		if (automat.getTotal() != 30){
			System.out.println("Beholdningen af automaten skulle give 30, men gav "+automat.getTotal());
			antalFejl++;
		} else {
			System.out.println("Beholdningen er på: "+ automat.getTotal());
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