// https://leetcode.com/problems/minimum-add-to-make-parentheses-valid

class Solution {
    public int minAddToMakeValid(String s) {
        Stack<Character> stack = new Stack<>();
        for(char ch : s.toCharArray()){
            if(ch == '('){
                stack.push(ch);
            }else{
            //')' check if opening bracket is present
             if(!stack.isEmpty() && stack.peek()=='(') {
                    stack.pop();
                }else{
                     stack.push(ch);
                }
            }
        }
        return stack.size();
    }
}
