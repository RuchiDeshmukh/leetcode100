//https://leetcode.com/problems/palindrome-number/

class Solution {
    public boolean isPalindrome(int x) {
        
        int sum = 0;
        int n = x;
        while(n > 0){
          int tmp = n % 10;
          sum = tmp + (sum * 10);
          n = n / 10;
        }
        
        return sum == x;
    }
}
