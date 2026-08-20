class Solution {
    public int numPairsDivisibleBy60(int[] time) {
        int freq[]=new int[60];
        int cnt=0;
        for(int i=0; i<time.length; i++){
            int rem=time[i]%60;
            int needed=(60-rem)%60;
            
            cnt+=freq[needed];
            freq[rem]++;
        }
        return cnt;
    }
}