class Solution {
    public int maxDistinct(String s) {
        HashMap<Integer, Integer>hm=new HashMap<>();
        for(int i=0; i<s.length(); i++){
            hm.put(s.charAt(i)-'a', hm.getOrDefault(s.charAt(i)-'a',0)+1);
        }
        return hm.size();
    }
}