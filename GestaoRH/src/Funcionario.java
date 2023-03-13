import java.math.BigDecimal;

public abstract class Funcionario {
    private int id;
    private String nome;
    private BigDecimal salarioBase;
    
    
    
    public Funcionario(int id, String nome, BigDecimal salarioBase) {
        this.id = id;
        this.nome = nome;
        this.salarioBase = salarioBase;
    }

    public abstract BigDecimal calcularSalario();
    
    public int getId() {
        return id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public BigDecimal getSalarioBase() {
        return salarioBase;
    }
    
    public void setSalarioBase(BigDecimal salarioBase) {
        this.salarioBase = salarioBase;
    }
    
    
}