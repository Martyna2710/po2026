package agh.po.lab3;
import java.util.Map;
import java.util.HashMap;

public class CodingBat {

    //Warmup 2
    public boolean noTriples(int[] nums) {
        for (int i=0; i<nums.length-2; i++){
            int x=nums[i];
            if (nums[i+1]==x && nums[i+2]==x)
                return false;
        }
        return true;
    }

    //Warmup 2
    public String stringBits(String str) {
        String co_dwa="";
        for (int i=0; i<str.length(); i+=2){
            co_dwa=co_dwa+str.substring(i, i+1);
        }
        return co_dwa;
    }

    //Array 2
    public int sum13(int[] nums) {
        int sum=0;
        for (int i=0; i<nums.length; i++) {
            if (nums[i] == 13) {
            } else if (i > 0 && nums[i - 1] == 13) {
            } else {
                sum += nums[i];
            }
        }
        return sum;
    }

    //String 1
    public String helloName(String name) {
        return "Hello "+name+"!";
    }

    //String 2
    public int countCode(String str) {
        int sum=0;
        for (int i=0; i<(str.length()-3); i++ ){
            if (str.charAt(i)=='c' && str.charAt(i+1)=='o') {
                if (str.charAt(i+3)=='e') {
                    sum+=1;
                }
            }
        }
        return sum;
    }
    public Map<String, String> mapAB4(Map<String, String> map) {
        if (map.containsKey("a") && map.containsKey("b")) {
            String wartosc_a = map.get("a");
            String wartosc_b = map.get("b");
            if (wartosc_a.length()>wartosc_b.length()){
                map.put("c", wartosc_a);
            } else if (wartosc_b.length()>wartosc_a.length()) {
                map.put("c", wartosc_b);
            } else {
                map.put("a", "");
                map.put("b", "");
            }
        }
        return map;
    }
    public Map<String, String> pairs(String[] strings) {
        Map<String, String> map = new HashMap<>();
        for (String s:strings){ //bierzemy tablicę strings, wyciągamy z niej każde słowo po koleii i na czas jednego przejścia nazywamy je s
            String Pierwsza=s.substring(0,1); //substring-wycina kawałek tekstu; zaczyna od indeksu 0, kończy na indeksie 1 (tylko pierwssza litera)
            String Ostatnia=s.substring(s.length()-1); //wycinamy ostatnią litere; kiedy w substring podamy tylko jedną wartość, zaczyna od niej i wycina do samego końca
            map.put(Pierwsza, Ostatnia);
        }
        return map;
    }

}


