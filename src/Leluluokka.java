
public class Leluluokka {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
class Lelu {
//attribuutit	
public String nimi;
public int paino;

//default-muodostin
public Lelu() {
	nimi="";
	paino=0;
	}
//parametrinen muodostin
public Lelu(String n, int p) {
	nimi=n;
	paino=p;
	}
//metodit
public void tulostaTiedot() {
	System.out.println("Lelun nimi: " + nimi);
	System.out.println("Lelun paino: " + paino);
	
}
class Vieteriauto extends Lelu{
//vieteriauton attribuutit
public int nopeus;

//default muodostin
public Vieteriauto() {
	nimi="";
	paino=0;
	nopeus=0;
	}
//parametrinen muodostin
public Vieteriauto(String autonNimi, int autonPaino, int autonNopeus) {
	nimi=autonNimi;
	paino=autonPaino;
	nopeus=autonNopeus;
	}
//metodit
public void kiihdyta() {
	nopeus++;
}
@Override
public void tulostaTiedot() {
	System.out.println("Auton nimi: " + nimi);
	System.out.println("Auton paino: " + paino);
	System.out.println("Auton npeus: "+ nopeus);
	
}
	
}








}