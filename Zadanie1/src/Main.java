public class Main {
    public static void main(String[] args) {
        Samochod samochod1 = new Samochod("Ford", "Focus", 2018);
        Samochod samochod2 = new Samochod("Toyota", "Corolla", 2020);

        samochod1.wyswietlInfo();
        samochod2.wyswietlInfo();
    }
}
