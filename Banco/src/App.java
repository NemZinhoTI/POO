public class App {
    public static void main(String[] args) throws Exception {
        var conta = new Conta(1234, 100);
        System.out.println(conta.calcularSaldo());

        var contaCorrente = new ContaCorrente(3214, 200, 10);
        System.out.println(contaCorrente.calcularSaldo());
        
        var contaVip = new ContaVip(3214, 200, 1000);
        System.out.println(contaVip.calcularSaldo());
    }
}
