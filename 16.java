// https://leetcode.com/problems/reverse-integer/

class Solution {
    public int reverse(int x) { 
        long output = 0;
        boolean negative = false;

        if(x < 0){
            x = x * -1;
            negative = true;
        }

        while(x > 0){
         int tmp = x % 10;
         output = output * 10 + tmp;
         x = x / 10;   
        }

        if(output > Integer.MAX_VALUE) return 0;

        if(negative){
            output = output * -1;
        }

        return (int) output;
    }
}
