// https://leetcode.com/problems/container-with-most-water/

class Solution {
    public int maxArea(int[] height) {
      int left = 0;
      int right = height.length-1;
      int max = 0;
      for(int i = 0; i < height.length-1; i++){
          int h = Math.min(height[left],height[right]);
          int w = right - left;
          int area = h * w;
          max = Math.max(area,max);
          if(height[left] < height[right]){
              left++;
          }else if(height[left] > height[right]){
              right--;
          }else{
              left++;
              right--;
          }
      }
      return max;
    }
}
