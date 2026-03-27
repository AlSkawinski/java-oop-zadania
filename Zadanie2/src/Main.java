public class Main {
    public static void main(String[] args) {
        KontoBankowe konto = new KontoBankowe(1000);
        System.out.println("Stan konta: " + konto.getSaldo());
        konto.wplac(500);
        System.out.println("Stan konta: " + konto.getSaldo());
        konto.wyplac(200);
        System.out.println("Stan konta: " + konto.getSaldo());
        konto.wyplac(1500); 
    }
}
