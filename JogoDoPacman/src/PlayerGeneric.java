public abstract class PlayerGeneric extends GameObject {

    protected final static int CIMA = 0;
    protected final static int DIREITA = 90;
    protected final static int BAIXO = 180;
    protected final static int ESQUERDA = 270;

    private int direction;

    public PlayerGeneric() {}

    public PlayerGeneric(int x, int y, int direction) {
        super(x, y);
        this.direction = direction;
    }

    public boolean canMove() {
        int newX = getX();
        int newY = getY();

        if (direction == CIMA)
            newY -= 10;
        if (direction == DIREITA)
            newX += 10;
        if (direction == BAIXO)
            newY += 10;
        if (direction == ESQUERDA)
            newX -= 10;

        return (newX >= 0 &&
                newY >= 0 &&
                newX < getScreenSize() &&
                newY < getScreenSize());

    }

    public void move() {
        if (canMove()) {
            if (direction == CIMA)
                setY(getY() - 10);
            if (direction == DIREITA)
                setX(getX() + 10);
            if (direction == BAIXO)
                setY(getY() + 10);
            if (direction == ESQUERDA)
                setX(getX() - 10);
        }
    }

    public int getDirection() {
        return direction;
    }

    public void setDirection(int direction) {
        this.direction = direction;
    }

}
