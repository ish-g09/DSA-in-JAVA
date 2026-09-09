class Solution {
    public long countCommas(long n) {
        long cnt=0;
        int digits=4;
        if(n>999){
            long start=1000;
            while(start<=n){
                long end=Math.min(n, start*1000-1);
                
                cnt+=((digits-1)/3)*(end-start+1);
                start*=1000;
                digits+=3;
                
            }
        }
        return cnt;
    }
}