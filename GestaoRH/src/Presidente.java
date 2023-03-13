import java.math.BigDecimal;
public final class Presidente extends Funcionario implements Autenticavel{
    private BigDecimal cotaAcoes;

    public Presidente(int codigo, String nome, BigDecimal salarioBase, BigDecimal cotaAcoes) {
        super(codigo, nome, salarioBase);
        this.cotaAcoes = cotaAcoes;
    }

    @Override
    public BigDecimal calcularSalario() {
        return getSalarioBase().add(cotaAcoes); 
    }
    
    @Override
    public void autenticar() {
        System.out.println("Presidente logado");
        
    }
    
    public BigDecimal getCotaAcoes() {
        return cotaAcoes;
    }

    public void setCotaAcoes(BigDecimal cotaAcoes) {
        this.cotaAcoes = cotaAcoes;
    }

}
