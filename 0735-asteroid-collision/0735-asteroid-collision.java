class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        int n=asteroids.length;
        Stack<Integer>st=new Stack<>();
        for(int i=0; i<n; i++){
            if(asteroids[i]>0) st.push(asteroids[i]);
            else{
                if (st.isEmpty() || st.peek() < 0) {
                    st.push(asteroids[i]);
                }
                else{
                    while (!st.isEmpty() && st.peek() > 0 && st.peek() < Math.abs(asteroids[i])) {
                        st.pop();
                    }
                    if (st.isEmpty() || st.peek() < 0) {
                        st.push(asteroids[i]);
                    }
                    else if (st.peek() == Math.abs(asteroids[i])) {
                        st.pop();
                    }
                }
                
            }
        }
        int arr[]=new int[st.size()];
        for(int i=0; i<st.size(); i++){
            arr[i]=st.get(i);
        }
        return arr;
    }
}