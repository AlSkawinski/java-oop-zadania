public class Student extends Osoba {
    private String kierunek;

    public Student(String imie, String nazwisko, String kierunek) {
        super(imie, nazwisko);
        this.kierunek = kierunek;
    }

    public String getKierunek() {
        return kierunek;
    }

    @Override
    public String toString() {
        return super.toString() + ", Kierunek: " + kierunek;
    }
}
