import java.util.Random;

public class Ghost extends PlayerGeneric {

    public Ghost() {
    }

    public Ghost(int x, int y, int direction) {
        super(x, y, direction);
    }

    @Override
    public void move() {
        Integer[] direcoes = {CIMA, DIREITA, ESQUERDA, BAIXO};
        var sorteioDirecao = Math.random();
        if (sorteioDirecao < .15) {
            Random random = new Random();
            var sorteio = random.nextInt(4);
            setDirection(direcoes[sorteio]);
        }

        super.move();
    }

}
