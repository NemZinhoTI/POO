
import java.util.Random;

public class Ghost extends GameObject{
    Random r = new Random();

    private int direcaoGhost;
    
    public Ghost() {
        
    }
    
    public Ghost(int posicaoX, int posicaoY, int direcaoGhost) {
        super(posicaoX, posicaoY);
        this.direcaoGhost = direcaoGhost;
    }

    public int direcaoGhost(int direcaoGhost){
        this.direcaoGhost = r.nextInt(3)+1;

        if(direcaoGhost == 1){
            direcaoGhost = 0;
            
        }
        if(direcaoGhost == 2){
            direcaoGhost = 90;
        }
        if(direcaoGhost == 3){
            direcaoGhost = 180;
        }
        if(direcaoGhost == 4){
            direcaoGhost = 270;
        }

        return this.direcaoGhost;
    }
    
    public boolean podeMover() {

        if (posicaoX + 10 > tamanhoTela && direcaoGhost == 90) {
            return false;
        }

        if (posicaoX - 10 < tamanhoTela && direcaoGhost == 270) {
            return false;
        }
        if (posicaoY + 10 > tamanhoTela && direcaoGhost == 180) {
            return false;
        }
        if (posicaoY - 10 < tamanhoTela && direcaoGhost == 0) {
            return false;
        }

        return true;

    }

    public Random getR() {
        return r;
    }

    public void setR(Random r) {
        this.r = r;
    }

    public int getDirecaoGhost() {
        return direcaoGhost;
    }

    public void setDirecaoGhost(int direcaoGhost) {
        this.direcaoGhost = direcaoGhost;
    }
}
