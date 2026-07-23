class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>>result=new ArrayList<>();
        List<Integer>ans=new ArrayList<>();
        getsub(0,candidates,target,ans,result);
        return result;

    }
    void getsub(int index, int[] candidates, int target, List<Integer>ans, List<List<Integer>>result){
        if(index==candidates.length){
            return;
            
        }
        if(target==0){
            result.add(new ArrayList<>(ans));
            return;
        }
        if(candidates[index]<=target){
            ans.add(candidates[index]);
            getsub(index, candidates, target-candidates[index], ans, result);
            ans.remove(ans.size() - 1);
            
        }
        getsub(index+1, candidates, target, ans, result);
    }
}