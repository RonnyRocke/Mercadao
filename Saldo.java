public class Saldo {
    double[] Carteira = new double[1];
    double depositar;
    double sacar;

    public Saldo() {
        Carteira[0] = 0;
    }

    public void ConferirSaldo() {
        System.out.println("SALDO: " + Carteira[0]);
    }
}
