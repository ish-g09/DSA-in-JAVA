class Solution {
    public int totalNumbers(int[] digits) {
        int n=digits.length;
        int freq[]=new int[10];
        for(int i=0; i<n; i++){
            freq[digits[i]]++;
        }
        int ans=0;
        for(int first=1; first<10; first++){
            if(freq[first]==0) continue;
            freq[first]--;
            for(int second=0; second<10; second++){
                if(freq[second]==0) continue;
                freq[second]--;
                for(int last=0; last<10; last+=2){
                    if(freq[last]!=0){ 
                    ans++;
                    
                    }
                }
                freq[second]++;
            }
            freq[first]++;


        }
        return ans;
    }
}