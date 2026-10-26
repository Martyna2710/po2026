package agh.po.lab3;

public class CodingBat {
    public boolean noTriples(int[] nums) {
        for (int i=0; i<nums.length-2; i++){
            int x=nums[i];
            if (nums[i+1]==x && nums[i+2]==x)
                return false;
        }
        return true;
    }
    public String stringBits(String str) {
        String co_dwa="";
        for (int i=0; i<str.length(); i+=2){
            co_dwa=co_dwa+str.substring(i, i+1);
        }
        return co_dwa;
    }
    public static void main(String[] args){
        CodingBat codingBat=new CodingBat();
        System.out.printf("wynik: "+codingBat.noTriples(new int[] {2,2,2,4,5,6}));
    }

}
