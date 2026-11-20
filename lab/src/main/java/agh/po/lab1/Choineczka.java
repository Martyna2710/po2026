package agh.po.lab1;

public class Choineczka{
    public static void main(String[] args){
        if (args.length==0){
            int dlugosc_drzewka=5;
            String gwiazdki="*";;
            for (int i=1; i<=dlugosc_drzewka; i++){
                System.out.println(gwiazdki);
                gwiazdki=gwiazdki+"*";
        }}
        if (args.length!=0){
            int dlugosc_z_args = Integer.parseInt(args[0]);
            String gwiazdki2 = "*";
            for (int i = 1; i <= dlugosc_z_args; i++) {
                System.out.println(gwiazdki2);
                gwiazdki2 = gwiazdki2 + "*";
        }
    }
}}
//String[] args - tablica na argumenty, czyli wszystko, co wpisuje po nazwie programu
//Integer.parseInt(args[0]) - przypisuje do zmiennej pierwszą rzecz wpisaną po nazwie programu (zerowy element tablicy), konwertuje go na int
//wchodzę w terminal -> javac [nazwa programu].java -> jeżeli poprzednie nic nie wypluło to java [nazwa programu] [ewentualny argument]