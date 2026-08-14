class Solution {
    // int mod=(int)1e9+7;
    int [] pse(int arr[]){
        Stack<Integer>st=new Stack<>();
        int ans[]=new int[arr.length];
        
        for(int i=0; i<arr.length; i++){
            
                while(!st.isEmpty() && arr[st.peek()]>arr[i]){
                    st.pop();
                }
                 if(st.isEmpty()){
                ans[i]=-1;
                 }
                 else ans[i]=st.peek();
                 st.push(i);
                
            }
            return ans;

        }
    int [] nse(int arr[]){
        Stack<Integer>st=new Stack<>();
        int ans[]=new int[arr.length];
        
        for(int i=arr.length-1; i>=0; i--){
            
                while(!st.isEmpty() && arr[st.peek()]>=arr[i]){
                    st.pop();
                }
                 if(st.isEmpty()){
                ans[i]=arr.length;
                 }
                 else ans[i]=st.peek();
                 st.push(i);
                
            }
            return ans;

        }
    int [] pge(int arr[]){
        Stack<Integer>st=new Stack<>();
        int ans[]=new int[arr.length];
        
        for(int i=0; i<arr.length; i++){
            
                while(!st.isEmpty() && arr[st.peek()]<arr[i]){
                    st.pop();
                }
                 if(st.isEmpty()){
                ans[i]=-1;
                 }
                 else ans[i]=st.peek();
                 st.push(i);
                
            }
            return ans;

        }
    int [] nge(int arr[]){
        Stack<Integer>st=new Stack<>();
        int ans[]=new int[arr.length];
        
        for(int i=arr.length-1; i>=0; i--){
            
                while(!st.isEmpty() && arr[st.peek()]<=arr[i]){
                    st.pop();
                }
                 if(st.isEmpty()){
                ans[i]=arr.length;
                 }
                 else ans[i]=st.peek();
                 st.push(i);
                
            }
            return ans;

        }
    
    public long subArrayRanges(int[] nums) {
        int n=nums.length;
        int s1[]=nse(nums);
        int s2[]=pse(nums);
        int g1[]=nge(nums);
        int g2[]=pge(nums);
        long suml=0;
        long sumr=0;
        for(int i=0; i<n; i++){
            
            long left1=i-s2[i];
            long right1=s1[i]-i;

            long left2=i-g2[i];
            long right2=g1[i]-i;

            long f1=(left1*right1*nums[i]);
            suml=(suml+f1);

            f1=(left2*right2*nums[i]);
            sumr=sumr+f1;

        }
        return sumr-suml;
    }
}