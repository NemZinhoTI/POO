import java.math.BigDecimal;
public class Gerente extends Funcionario implements Autenticavel{
    
    private String area;
    private BigDecimal bonus;
    
    
    public Gerente(int id, String nome, BigDecimal salarioBase,String area, BigDecimal bonus) {
        super(id, nome, salarioBase);
        this.area = area;
        this.bonus = bonus;
    }
    
    public BigDecimal calcularSalario() {
        return this.getSalarioBase().add(bonus);
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public BigDecimal getBonus() {
        return bonus;
    }

    public void setBonus(BigDecimal bonus) {
        this.bonus = bonus;
    }

    @Override
    public void autenticar() {
        System.out.println("Gerente logado");
    }
}