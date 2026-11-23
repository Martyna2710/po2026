package symulator;

public class Pozycja {
    double x;
    double y;
    public Pozycja(){
        this.x=0.0;
        this.y=0.0;
    }
    public Pozycja(double x, double y){
        this.x=x;
        this.y=y;
    }
    public void aktualizujPozycje(double deltaX, double deltaY){
        this.x+=deltaX;
        this.y+=deltaY;
    }
    public String getPozycja(){
        String pozycja="pozycja x to %, a y to %";
        return String.format(pozycja,this.x, this.y);
    }
}
