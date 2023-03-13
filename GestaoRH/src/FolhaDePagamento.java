import java.math.BigDecimal;

public class FolhaDePagamento {
    private BigDecimal totalDaFolhaDePagamento = BigDecimal.ZERO;
    
    public BigDecimal getTotalDaFolhaDePagamento(){
        return totalDaFolhaDePagamento;

    }



    public void registrar(Funcionario funcionario){
        totalDaFolhaDePagamento = 
        totalDaFolhaDePagamento.add(funcionario.calcularSalario());
    }
    
    public void login(Autenticavel autenticavel){
        autenticavel.autenticar();
    }
  
}
