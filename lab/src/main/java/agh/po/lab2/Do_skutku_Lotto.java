package agh.po.lab2;

import java.util.ArrayList;

public class Do_skutku_Lotto {
    public static void main(String[] args) {
        if (args.length!=6){
            System.out.println("Zla ilosc cyfr!");
            return;
        }
        ArrayList<Integer> typy = new ArrayList<>();
        for (int i = 0; i < 6; i++) {
            int typ = Integer.parseInt(args[i]);
            typy.add(typ);
        }
        long ile_bylo_losowan = 0;
        int czy_szostka = 0;
        long start = System.currentTimeMillis();
        while (czy_szostka != 1) {
            ArrayList<Integer> randomy = new ArrayList<>();
            int i = 0;
            while (i < 6) {
                int liczba = (int) (Math.random() * 49 + 1);
                if (!randomy.contains(liczba)) {
                    randomy.add(liczba);
                    i++;
                }
            }
            int liczba_trafien = 0;
            for (int x : typy) {
                if (randomy.contains(x)) {
                    liczba_trafien++;
                }
            }
            if (liczba_trafien == 6) {
                czy_szostka = 1;
            }
            ile_bylo_losowan++;
        }
        long stop = System.currentTimeMillis();
        long czas = stop - start;
        System.out.println("Ile bylo losowan: "+ile_bylo_losowan);
        System.out.println("Ile to zajelo czasu: "+czas);
    }
}

