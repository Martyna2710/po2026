package symulator;

public class Sprzeglo {
    boolean stanSprzegla;
    public Sprzeglo(){
        this.stanSprzegla=false;
    }
    public Sprzeglo(boolean stanSprzegla){
        this.stanSprzegla=stanSprzegla;
    }
    public void wcisnij(){
        this.stanSprzegla=true;
    }
    public void zwolnij(){
        this.stanSprzegla=false;
    }
}
