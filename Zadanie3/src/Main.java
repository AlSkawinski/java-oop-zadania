public class Main {
    public static void main(String[] args) {
        Pracownik pracownik1 = new Pracownik("Jan Kowalski", 4000);
        Programista programista = new Programista("Anna Nowak", 6000, "Java");
        Menadzer menadzer = new Menadzer("Marek Zalewski", 8000, 2000);

        pracownik1.wyswietlInfo();
        programista.wyswietlInfo();
        menadzer.wyswietlInfo();
    }
}
