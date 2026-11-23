package symulator;

public class Samochod {
    Silnik silnik;
    SkrzyniaBiegow skrzynia;
    public Samochod(){
        this.silnik=new Silnik(500, 600);
        this.skrzynia=new SkrzyniaBiegow();
    }
    public Samochod(Silnik silnik, SkrzyniaBiegow skrzynia){
        this.silnik=silnik;
        this.skrzynia=skrzynia;
    }
    public void wlacz(){
        this.silnik.uruchom();
    }
    public void wylacz(){
        this.silnik.zatrzymaj();
        this.skrzynia.biegJalowy();
    }
}



