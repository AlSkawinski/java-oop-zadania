public class Main {
    public static void main(String[] args) {
        Biblioteka biblioteka = new Biblioteka();

        biblioteka.dodajKsiazke(new Ksiazka("Wiedźmin", "Andrzej Sapkowski"));
        biblioteka.dodajKsiazke(new Ksiazka("Hobbit", "J.R.R. Tolkien"));

        biblioteka.wyswietlKsiazki();
    }
}
