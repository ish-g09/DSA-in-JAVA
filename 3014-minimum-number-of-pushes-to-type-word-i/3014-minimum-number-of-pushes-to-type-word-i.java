class Solution {
    public int minimumPushes(String word) {
        int n=word.length();
        int freq[]=new int[26];
        for(int i=0; i<n; i++){
            freq[word.charAt(i)-'a']++;
        }
        Arrays.sort(freq);
        int cnt=0;
        int curr=1;
        int sum=0;
        for(int i=25; i>=0; i--){
            sum+=freq[i]*curr;
            cnt++;
            if(cnt==8){
                curr++;
                cnt=0;
            }
        }
        return sum;
    }
}