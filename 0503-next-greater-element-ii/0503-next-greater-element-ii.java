class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n=nums.length;

        Stack<Integer>st=new Stack<>();
        for(int i=n-1; i>=0; i--){
            st.push(nums[i]);
        }
        int result[]=new int[n];
        for(int i=n-1; i>=0; i--){
            int val=nums[i];
            if(st.isEmpty()) result[i]=-1;
            while(!st.isEmpty() && st.peek()<=val){
                st.pop();
            }
            if(st.isEmpty()) result[i]=-1;
            else result[i]=st.peek();
            st.push(nums[i]);

        }
        return result;
    }
}