class Solution {
    public int maxArea(int[] height) {
        int n=height.length;
        int left=0;
        int right=n-1;
        int MaxArea=0;
        while(left<right){
            int min=Math.min(height[left], height[right]);
            int area=min*(right-left);
            MaxArea=Math.max(area, MaxArea);
            if(height[left]<=height[right]) left++;
            else right--;
        }
        return MaxArea;
    }
}