import java.util.Random;

public class Obliczenia {
	int[] tablica;

	public int[] getTablica() {
		return tablica;
	}

	public void setTablica(int[] tablica) {
		this.tablica = tablica;
	}

	public Obliczenia(int[] tablica) {
		this.tablica = tablica;
	}

	public void wypelnienieTablicy() {
		Random rand = new Random();

		for (int i = 0; i < tablica.length; i++) {
			tablica[i] = rand.nextInt(10) + 1;
		}
	}
	
	public void wypisanieTablicy() {
		for(int i = 0; i < tablica.length; i++) {
			System.out.print(tablica[i]);
			System.out.print(' ');
		}
		System.out.println();
	}
	public void iloscElementow() {
		int licznik = 0;
		int[] ilosc = new int[10];
		for(int i = 0; i < ilosc.length; i++) {
			ilosc[i] = i+1;
		}
		for(int i = 0; i < ilosc.length; i++) {
			for(int j = 0; j < tablica.length; j++) {
				if(tablica[j] == ilosc[i]) {
					licznik++;
				}

			}
			System.out.println(ilosc[i] + " - " + licznik);
			licznik = 0;
		}
	}
}
