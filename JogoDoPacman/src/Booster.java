public class Booster extends Item {

    private int duration;

    public Booster() {}

    public Booster(int x, int y, boolean visible, int duration) {
        super(x, y, visible);
        this.duration = duration;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
    
}
