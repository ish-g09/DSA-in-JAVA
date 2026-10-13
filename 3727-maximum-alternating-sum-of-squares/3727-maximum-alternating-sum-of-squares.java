class Solution {
    public long maxAlternatingSum(int[] nums) {
        int n=nums.length;
        ArrayList<Integer>arr=new ArrayList<>();
        for(int i=0; i<n; i++){
            arr.add(Math.abs(nums[i]));
        }
        Collections.sort(arr);
        if(n==1) return nums[0]*nums[0];
        int pointer=0;
        // for(int i=1; i<n; i+=2){
        //     nums[i]=arr.get(pointer);
        //     pointer++;
        // }
        // for(int i=0; i<n; i+=2){
        //     nums[i]=arr.get(pointer);
        //     pointer++;
        // }
        int odd=n/2;
        long sumo=0;
        for(int i=0; i<odd; i++){
            sumo+=arr.get(i)*arr.get(i);
        }
        long sume=0;
        for(int i=odd; i<n; i++){
            sume+=arr.get(i)*arr.get(i);
        }
        return sume-sumo;
    }
}