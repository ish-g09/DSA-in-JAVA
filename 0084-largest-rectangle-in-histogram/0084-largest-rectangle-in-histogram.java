class Solution {
    public int largestRectangleArea(int[] heights) {
      int n=heights.length;
      int maxA=0;
      Stack<Integer>st=new Stack<>();
      for(int i=0; i<=n; i++){
        int height=0;
        if(i==n) height=0;
        else height=heights[i];
        
        while(!st.isEmpty() && heights[st.peek()]>=height){
            int h=heights[st.pop()];
            int width;
            if(st.isEmpty()){
                width=i;
            }
            else{
                width=i-st.peek()-1;
            }
            maxA=Math.max(maxA, h*width);
        }
        st.push(i);
      }  
      return maxA;
    }
}