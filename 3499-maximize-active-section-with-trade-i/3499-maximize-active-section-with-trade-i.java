class Solution {
    public int maxActiveSectionsAfterTrade(String s) {
        int n=s.length();
        String t="1"+s+"1";
        ArrayList<Integer>seg=new ArrayList<>();
        ArrayList<Integer>len=new ArrayList<>();
        for(int i=0; i<n+2; i++){
            int j=i;
            while(j<n+2 && t.charAt(i)==t.charAt(j)){
                j++;
            }
            seg.add(t.charAt(i)-'0');
            len.add(j-i);
            i=j-1;

        }
        int segL=seg.size();
        int maxv=0;
        for(char ch : s.toCharArray()){
            if(ch == '1')
                maxv++;
}
        int ans=maxv;
        for(int i = 1; i < segL - 1; i++){

            if(seg.get(i)==1 && seg.get(i-1)==0 && seg.get(i+1)==0){

                int gain = len.get(i-1) + len.get(i+1)+maxv;
                ans=Math.max(gain, ans);
    }
}
return ans;
    }
}