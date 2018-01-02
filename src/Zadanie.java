
public class Zadanie {
	public static void main(String[] args) {
		int[] tablica = new int[20];
		
		Obliczenia obl = new Obliczenia(tablica);
		
		obl.wypelnienieTablicy();
		obl.wypisanieTablicy();
		
		obl.iloscElementow();
	}
}
