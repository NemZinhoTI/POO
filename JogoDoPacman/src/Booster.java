public class Booster extends Item {

    private int duracao;

    public Booster() {
        
    }

    public Booster(int posicaoX, int posicaoY, boolean visivel, int duracao) {
        super(posicaoX, posicaoY, visivel);
        this.duracao = duracao;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }
    
}
