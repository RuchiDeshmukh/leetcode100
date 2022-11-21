// https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/

class Solution {
    public int[] twoSum(int[] numbers, int target) {
       int[] output = new int[2];

       int start = 0;
       int end = numbers.length-1;

       while(start < end){
           int sum = numbers[start] + numbers[end];
           if(sum == target){
               output[0] = start + 1;
               output[1] = end + 1;
               return output;
           }else if(sum < target) {
               start++;
           }else {
               end--;
           }
       }
        return output;
    }
}
