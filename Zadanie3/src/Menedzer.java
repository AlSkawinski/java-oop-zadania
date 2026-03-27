public class Menadzer extends Pracownik {
    double premia;

    public Menadzer(String imie, double pensja, double premia) {
        super(imie, pensja);
        this.premia = premia;
    }

    @Override
    public void wyswietlInfo() {
        super.wyswietlInfo();
        System.out.println("Premia: " + premia);
    }
}
