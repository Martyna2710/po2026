package agh.po.lab2;
import java.util.ArrayList;
import java.util.Random;

public class Porownywanie_wynikow {
    public static void main(String[] args) {
        if(args.length!=6) {
            System.out.println("Zla liczba cyfr!!");
            return;}
        ArrayList<Integer> typy = new ArrayList<>();
        for (int i = 0; i < 6; i++) {
            int typ = Integer.parseInt(args[i]);
            typy.add(typ);
        }
        ArrayList<Integer> randomy=new ArrayList<>();
        int i=0;
        while (i<6) {
            int liczba = (int) (Math.random() * 49 + 1);
            if (!randomy.contains(liczba)) {
                randomy.add(liczba);
                i++;
            }
        }
        int liczba_trafien=0;
        for (int x:typy){
            if(randomy.contains(x)){
                liczba_trafien++;
            }
        }System.out.println("Twoje typy: "+typy);
        System.out.println("Wylosowane liczby: "+randomy);
        System.out.println(liczba_trafien);
    }


        }


