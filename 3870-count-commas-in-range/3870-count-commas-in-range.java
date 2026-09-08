class Solution {
    public int countCommas(int n) {
        String str=String.valueOf(n);
        if(str.length()<=3) return 0;
        int num=n;
        int cnt=0;
        for(int i=1000; i<=num; i++){
            String s=String.valueOf(i);
            cnt+=1;
            int len=s.length()-3;
            cnt+=(len-1)/3;
        }
        return cnt;
    }
}