package automat;

public class TjekBilletautomatNulstil
{
	public static void main(String[] arg)
	{
		Billetautomat automat = new Billetautomat();

		int antalFejl = 0;
		int retur;

		System.out.println("Tjek at montøren kan nulstille maskinen");
		automat.indsætPenge(100);
		automat.montørLogin("1234");
		automat.nulstil();

		if (automat.getBalance() == 0){
			System.out.println("Maskinen er blevet nulstillet korrekt");
		} else {
			System.out.println("Beholdningen er på: "+automat.getBalance()+" men skulle være på 0, da maskinen er blevet nulstillet");
			antalFejl++;
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