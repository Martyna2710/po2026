package symulator;

public abstract class Komponent {
    String producent;
    String model;
    String nazwa;
    int waga;
    int cena;
    public Komponent(String producent, String model, String nazwa, int waga, int cena) {
        this.producent = producent;
        this.model = model;
        this.nazwa=nazwa;
        this.waga=waga;
        this.cena=cena;
    }
    public Komponent() {
        this.producent = "";
        this.model = "";
        this.nazwa="";
        this.waga=0;
        this.cena=0;
    }
    public String getProducent(){
        return producent;
    }
    public String getModel(){
        return model;
    }
    public String getNazwa(){
        return nazwa;
    }
    public int getWaga(){
        return waga;
    }
    public int getCena(){
        return cena;
    }
}

