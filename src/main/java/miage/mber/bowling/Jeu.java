package miage.mber.bowling;

public class Jeu {
    private Integer lancer1;

    private Integer lancer2;

    public Jeu(Integer lancer1, Integer lancer2) {
        this.lancer1=lancer1;
        this.lancer2=lancer2;
    }
    public Jeu(Integer lancer1) {
        this.lancer1=lancer1;
    }

    public int getNbQuillesTombees(){
        if(lancer2 == null){
            return this.lancer1;
        }
        return this.lancer1+this.lancer2;
    }

    public boolean isSpare(){
        return ((this.lancer1 !=10 && this.lancer1+this.lancer2 == 10));
    }

    public boolean isStrike(){
        return (this.lancer1 ==10);
    }

    public int getLancer1(){
        return this.lancer1;
    }

}
