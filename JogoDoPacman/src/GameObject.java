public abstract class GameObject {

    protected int posicaoX;
    protected int posicaoY;
    protected int tamanhoTela;

    public GameObject() {

    }

    public GameObject(int posicaoX, int posicaoY) {
        if (posicaoX < 0 && posicaoY < 0) {
            System.out.println("A posição só funiona com numeros positivos.");
        } else {
            this.posicaoX = posicaoX;
            this.posicaoY = posicaoY;
        }

    }

    public int getPosicaoX() {

        return posicaoX;
    }

    public void setPosicaoX(int posicaoX) {
        this.posicaoX = posicaoX;
    }

    public int getPosicaoY() {
        return posicaoY;
    }

    public void setPosicaoY(int posicaoY) {
        this.posicaoY = posicaoY;
    }

    public int getTamanhoTela() {
        return tamanhoTela;
    }

    public void setTamanhoTela(int tamanhoTela) {
        this.tamanhoTela = tamanhoTela;
    }

}
