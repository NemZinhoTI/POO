import java.math.BigDecimal;

public class Livro extends Produto {
    private String autor;

    
    public Livro(String nome, BigDecimal preco, String autor) {
        super(nome, preco);
        this.autor = autor;
    }

    public String toString(){
        return super.toString() + 
        " " + autor + " " ;
    }
    
    public String getAutor(){
        return autor;
    }
    
    public void setAutor(String autor) {
        this.autor = autor;
    }
   
}
