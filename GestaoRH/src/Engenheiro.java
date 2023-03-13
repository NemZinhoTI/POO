import java.math.BigDecimal;

public class Engenheiro extends  Funcionario {
    private String departamento;
    private String crea;
    

    public Engenheiro(int id, String nome, BigDecimal salarioBase, String departamento, String crea) {
        super(id, nome, salarioBase);
        this.departamento = departamento;
        this.crea = crea;
        
    }

    @Override
    public BigDecimal calcularSalario(){
        return this.getSalarioBase().multiply(new BigDecimal(1.5)); 
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getCrea() {
        return crea;
    }

    public void setCrea(String crea) {
        this.crea = crea;
    }
    
}
