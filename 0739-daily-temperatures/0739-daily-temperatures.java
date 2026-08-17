class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n=temperatures.length;
        Stack<Integer>st=new Stack<>();
        int arr[]=new int[n];
        // arr[n-1]=0;
        // st.push(n-1);
        for(int i=n-1; i>=0; i--){
            int ht=temperatures[i];
            while(!st.isEmpty() && temperatures[st.peek()]<=ht){
                st.pop();
                
            }
            if(st.isEmpty()) arr[i]=0;
            else arr[i]=st.peek()-i;
            st.push(i);
        }
        return arr;
    }
}