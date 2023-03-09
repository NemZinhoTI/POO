public class Conta{
    private int numero;
    protected double saldo;
    
    public Conta(int numero, double saldo) {
        this.numero = numero;
        this.saldo = saldo;
    }
    public double calcularSaldo(){
        return saldo;
    }
    
}