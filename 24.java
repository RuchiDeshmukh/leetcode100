// https://leetcode.com/problems/backspace-string-compare/
class Solution {
    public boolean backspaceCompare(String s, String t) {
        return build(s).equals(build(t));
    }

    private String build(String input){
        Stack<Character> stk = new Stack<>();
        StringBuilder res = new StringBuilder();
        for(char ch : input.toCharArray()){
            if(ch != '#'){
                stk.push(ch);
            }else if(!stk.isEmpty()){
                stk.pop();
            }
        }

        while(!stk.empty()){
            res.append(stk.pop());
        }

        return new String(res);
    }

}
