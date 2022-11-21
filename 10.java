// https://leetcode.com/problems/valid-palindrome/

class Solution {
    public boolean isPalindrome(String s) {
        String newString = "";
        for(char ch : s.toCharArray()){
            if(Character.isLetter(ch) || Character.isDigit(ch)){
                newString += ch;
            }
        }

        newString = newString.toLowerCase();

        int start = 0;
        int end = newString.length()-1;

        while(start < end){
            if(newString.charAt(start) != newString.charAt(end)){
                return false;
            }
            start++;
            end--;
        }

        return true;
    }
}
