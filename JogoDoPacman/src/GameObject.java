public abstract class GameObject {

    protected int x;
    protected int y;
    protected int screenSize;

    public GameObject() {

    }

    public GameObject(int x, int y) {
        if (x < 0 || y < 0) {
            System.out.println("A posição só funiona com numeros positivos.");
        } else {
            this.x = x;
            this.y = y;
        }

    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(int screenSize) {
        this.screenSize = screenSize;
    }

    

}
