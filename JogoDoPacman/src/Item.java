public class Item extends GameObject {

    private boolean visivel = false;

    public Item() {

    }

    public Item(int posicaoX, int posicaoY, boolean visivel) {
        super(posicaoX, posicaoY);
        this.visivel = visivel;
    }

    public boolean isVisivel() {
        return visivel;
    }

    public void setVisivel(boolean visivel) {
        this.visivel = visivel;
    }

}
