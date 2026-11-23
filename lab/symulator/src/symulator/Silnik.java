package symulator;

public class Silnik {
    int MaxObroty;
    int obroty;
    public Silnik(){
        this.MaxObroty=0;
        this.obroty=0;
    }
    public Silnik(int MaxObroty, int obroty){
        this.MaxObroty=MaxObroty;
        this.obroty=obroty;
    }
    public void uruchom(){
        this.obroty=800;
    }
    public void zatrzymaj(){
        this.obroty=0;
    }
}
