import java.math.BigDecimal;

public class Produto extends Object {
    private String nome;
    private BigDecimal preco;

    
    public Produto(String nome, BigDecimal preco){
        this.nome = nome;
        this.preco = preco;
    }

    @Override
    public String toString(){
        return nome + " - R$:" + preco;
    }
    
    public String getNome(){
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public BigDecimal getPreco(){
        return preco;
    }
    public void setPreco(BigDecimal preco) {
        this.preco = preco;
    }

    

}