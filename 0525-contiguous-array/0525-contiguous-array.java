class Solution {
    public int findMaxLength(int[] nums) {
        HashMap<Integer, Integer>hm=new HashMap<>();
        int len=0;
        for(int i = 0; i < nums.length; i++){
    if(nums[i] == 0)
        nums[i] = -1;
}
        hm.put(0,-1);
        int sum=0;
        for(int i=0; i<nums.length; i++){
            sum+=nums[i];
            if(hm.containsKey(sum)){
    len = Math.max(len, i - hm.get(sum));
}
else{
    hm.put(sum, i);
}
        }
        return len;

    }
}