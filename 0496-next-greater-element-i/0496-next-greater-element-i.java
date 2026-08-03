class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n=nums2.length;
        Stack<Integer>st=new Stack<>();
        HashMap<Integer,Integer>hm=new HashMap<>();
        
        for(int i=n-1; i>=0; i--){
            if(st.isEmpty()) hm.put(nums2[i],-1);
            else{
                while(!st.isEmpty() && st.peek()<nums2[i]){
                    st.pop();
                }
                if(st.isEmpty()) hm.put(nums2[i],-1);
                else hm.put(nums2[i],st.peek());
            }
            st.add(nums2[i]);
            
        }
        int result[]=new int[nums1.length];
        for(int i=0; i<nums1.length; i++){
            result[i]=hm.get(nums1[i]);
        }
        return result;
    }
}