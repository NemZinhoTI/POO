public class ContaCorrente extends Conta{
    
    private double tarifa;

    public ContaCorrente(int numero, double saldo, double tarifa) {
        super(numero, saldo);
        this.tarifa = tarifa;
    }

    public double getTarifa() {
        return tarifa;
    }
}
