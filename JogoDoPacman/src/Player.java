
public class Player extends GameObject {

    private int life = 5;
    private boolean invencible = false;
    private int direcao;

    public Player(int posicaoX, int posicaoY, int direcao) {
        super(posicaoX, posicaoY);
        this.direcao = direcao;
    }

    public boolean podeMover() {

        if (posicaoX + 10 > tamanhoTela && direcao == 90) {
            return false;
        }

        if (posicaoX - 10 < tamanhoTela && direcao == 270) {
            return false;
        }
        if (posicaoY + 10 > tamanhoTela && direcao == 180) {
            return false;
        }
        if (posicaoY - 10 < tamanhoTela && direcao == 0) {
            return false;
        }

        return true;

    }

    public int getLife() {
        return life;
    }

    public void setLife(int life) {
        this.life = life;
    }

    public boolean isInvencible() {
        return invencible;
    }

    public void setInvencible(boolean invencible) {
        this.invencible = invencible;
    }

    public int getDirecao() {
        return direcao;
    }

    public void setDirecao(int direcao) {
        this.direcao = direcao;
    }

}
