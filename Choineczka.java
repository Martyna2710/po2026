public class Choineczka{
    public static void main(String[] args){
        int dlugosc_drzewka=Integer.parseInt(args[0]);
        String gwiazdki="*";;
        for (int i=1; i<=dlugosc_drzewka; i++){
            System.out.println(gwiazdki);
            gwiazdki=gwiazdki+"*";
        }

    }
}
//String[] args - tablica na argumenty, czyli wszystko, co wpisuje po nazwie programu
//Integer.parseInt(args[0]) - przypisuje do zmiennej pierwszą rzecz wpisaną po nazwie programu (zerowy element tablicy), konwertuje go na int
//wchodzę w terminal -> javac [nazwa programu].java -> jeżeli poprzednie nic nie wypluło to java [nazwa programu] [ewentualny argument]