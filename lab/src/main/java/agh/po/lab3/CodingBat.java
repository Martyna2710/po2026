package agh.po.lab3;

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
    }


