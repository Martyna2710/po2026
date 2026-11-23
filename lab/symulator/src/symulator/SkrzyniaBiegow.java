package symulator;

public class SkrzyniaBiegow {
    int aktualnyBieg;
    int iloscBiegow;
    public SkrzyniaBiegow(){
        this.aktualnyBieg=0;
        this.iloscBiegow=0;
    }
    public SkrzyniaBiegow(int aktualnyBieg, int iloscBiegow){
        this.aktualnyBieg=aktualnyBieg;
        this.iloscBiegow=6;
    }
    public void zwiekszBieg(){
        if (this.aktualnyBieg<this.iloscBiegow){
            this.aktualnyBieg+=1;
        }
    }
    public void zmniejszBieg(){
        if (this.aktualnyBieg>0){
            this.aktualnyBieg-=1;
        }
    }
    public void biegJalowy(){
        if (this.aktualnyBieg!=0){
            this.aktualnyBieg=0;
        }
    }
}
