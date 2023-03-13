import java.math.BigDecimal;

public class App {
    public static void main(String[] args) throws Exception {
        var fulano = new Engenheiro(1,"John Lennon", new BigDecimal(3000), "Segurança", "12345" );
        var amaury = new Gerente(1, "Amaurilio", new BigDecimal(4500), "Logistica", new BigDecimal(4500));
        var amaurilio= new Presidente(1, "Amaurilio", new BigDecimal(10000), new BigDecimal(9000));

        var folhaDePagamento = new FolhaDePagamento();
        folhaDePagamento.registrar(amaurilio);
        folhaDePagamento.registrar(amaury);
        folhaDePagamento.registrar(fulano);

        System.out.println(folhaDePagamento.getTotalDaFolhaDePagamento());
        


    }

}
