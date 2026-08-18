class Solution {
    public String oddString(String[] words) {
        //length of each word is 3
        HashMap<String,Integer>result=new HashMap<>();
        for(int i=0; i<words.length; i++){
            String str=words[i];
            //length=3;
            int len=str.length();
            int diff[]=new int[len];
            String key="";
            for(int j=1; j<len; j++){
                diff[j-1]=str.charAt(j)-str.charAt(j-1);
                key=key+","+diff[j-1];
            }
            
            result.put(key, result.getOrDefault(key,0)+1);
        }
        for(int i=0; i<words.length; i++){
            String str=words[i];
           int len=str.length();
            int diff[]=new int[len];
            String key="";
            
            for(int j=1; j<len; j++){
                diff[j-1]=str.charAt(j)-str.charAt(j-1);
                key=key+","+diff[j-1];
            }
            
            if(result.get(key)==1){
                return words[i];
            }
            
           
        }
         return "";
    }
}