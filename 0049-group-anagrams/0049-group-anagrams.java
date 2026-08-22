class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        int n=strs.length;
        List<List<String>>result=new ArrayList<>();
        if(n==0) return result;
        boolean flag[]=new boolean[n];
        int freq[]=new int[26];
        for(int i=0; i<n; i++){
            if (flag[i]) continue;
            Arrays.fill(freq,0);
            String current=strs[i];
            flag[i]=true;
            int length=current.length();
            for(int j=0; j<length; j++){
                freq[current.charAt(j)-'a']++;
            }
            result.add(new ArrayList<>());
            result.get(result.size()-1).add(current);
            for(int j=i+1; j<n; j++){
                if(flag[j]) continue;
                String curr=strs[j];
                
                int len=curr.length();
                if(len!=length) continue;
                int freq1[]=new int[26];
                for(int t=0; t<26; t++){
                    freq1[t]=freq[t];
                }
                boolean same = true;
                for(int k=0; k<length; k++){
                freq1[curr.charAt(k)-'a']--;
                if(freq1[curr.charAt(k)-'a']<0){
                    same=false;
                    break;

                }
                }
                if(same){
                result.get(result.size()-1).add(curr);
                flag[j]=true;
                }
            }
        }
        return result;
    }
}