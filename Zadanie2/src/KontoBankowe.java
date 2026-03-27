public class KontoBankowe {
    private double saldo;

    public KontoBankowe(double saldo) {
        this.saldo = saldo;
    }

    public void wplac(double kwota) {
        if (kwota > 0) {
            saldo += kwota;
            System.out.println("Wplacono: " + kwota);
        } else {
            System.out.println("Kwota musi być dodatnia!");
        }
    }

    public void wyplac(double kwota) {
        if (kwota > 0 && kwota <= saldo) {
            saldo -= kwota;
            System.out.println("Wyplacono: " + kwota);
        } else if (kwota > saldo) {
            System.out.println("Brak wystarczających środków!");
        } else {
            System.out.println("Kwota musi być dodatnia!");
        }
    }

    public double getSaldo() {
        return saldo;
    }
}
