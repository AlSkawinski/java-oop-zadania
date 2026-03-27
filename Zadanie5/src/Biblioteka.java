import java.util.ArrayList;

public class Biblioteka {
    private ArrayList<Ksiazka> ksiazki;

    public Biblioteka() {
        ksiazki = new ArrayList<>();
    }

    public void dodajKsiazke(Ksiazka ksiazka) {
        ksiazki.add(ksiazka);
    }

    public void wyswietlKsiazki() {
        for (Ksiazka ksiazka : ksiazki) {
            System.out.println(ksiazka);
        }
    }
}
