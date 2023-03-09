public class Jogador {
    private String nome;
    private int xp = 0;
    private int hp = 100;
    private boolean envenenado;

    public Jogador(){

    }

    public Jogador(String nome){
        this.nome = nome;
    }

    public void receberDano(int pontos){
        this.hp -= pontos;
    }
    
    public void receberCura(int pontos){
        this.hp += pontos;
    }
    
    public void ganharExperiencia(int pontos){
        this.xp += pontos;
    }
    
    public void receberAntidoto(){
        envenenado = !envenenado;
    }
    
    public String getNome(){
        return nome;

    }    
    public int getXp(){
        return xp;
    }
    
    public int getHp(){
        return hp;
    }
    
     public boolean isEnvenenado(){
        return this.envenenado;
     }
    
}