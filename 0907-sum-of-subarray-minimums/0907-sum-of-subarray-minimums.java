class Solution {
    int mod=(int)1e9+7;
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
    
    public int sumSubarrayMins(int[] arr) {
        int m=arr.length;
        int n[]=nse(arr);
        int p[]=pse(arr);
        long sum=0;
        for(int i=0; i<m; i++){
            long left=i-p[i];
            long right=n[i]-i;
            long contribution = (left * right % mod) * arr[i] % mod;

            sum = (sum + contribution) % mod;
        }
        return (int)sum;
        
    }
}