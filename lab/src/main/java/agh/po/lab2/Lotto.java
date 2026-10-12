package agh.po.lab2;
import java.util.ArrayList;

public class Lotto {
    public static void main(String[] args){
        ArrayList<Integer> lista=new ArrayList<>();
        int i=0;
        while (i<6){
            int liczba=(int)(Math.random()*50+1);
            if (!lista.contains(liczba)){
                lista.add(liczba);}
            i++;
        }
        System.out.println(lista);
    }
}
