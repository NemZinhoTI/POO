import java.math.BigDecimal;

public class Eletronico extends Produto {
    private String marca;
    private String modelo;  

    
    public Eletronico(String nome, BigDecimal preco, String marca, String modelo){
        super(nome, preco);
        this.marca = marca;
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return super.toString() + 
            " " + marca + " " + modelo;
    }
    
    public String getMarca(){
        return marca;    
    }
    
    public String getModelo(){
        return modelo;
    }
    
    public void setMarca(String marca) {
        this.marca = marca;
    }
    
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    
    
}
