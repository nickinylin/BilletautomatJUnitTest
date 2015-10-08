package automat;

public class TjekBilletautomatNegativtBeløb
{
	public static void main(String[] arg)
	{
		Billetautomat automat = new Billetautomat();

		int antalFejl = 0;
		int retur;






		System.out.println("Prøver at indsætter et negativt beløb");
		automat.indsætPenge(-100);
		if(automat.getBalance() < 0){
			System.out.println("FEJL! Din balance er på: "+ automat.getBalance()+" Den må ikke være negativ");
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