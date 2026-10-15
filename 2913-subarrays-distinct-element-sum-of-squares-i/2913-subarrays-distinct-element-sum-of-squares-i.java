class Solution {
    public int sumCounts(List<Integer> nums) {
        int sum=0;
        int n=nums.size();
        for(int i=0; i<n; i++){
            for(int j=i; j<n; j++){
                HashSet<Integer>hs=new HashSet<>();
                for(int k=i; k<=j; k++){
                    hs.add(nums.get(k));
                }
                sum+=hs.size()*hs.size();
            }
        }
        return sum;
    }
}