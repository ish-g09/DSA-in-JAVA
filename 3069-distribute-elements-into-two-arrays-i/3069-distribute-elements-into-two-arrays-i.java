class Solution {
    public int[] resultArray(int[] nums) {
      int n=nums.length;
      ArrayList<Integer>arr1=new ArrayList<>();
      ArrayList<Integer>arr2=new ArrayList<>();
      if(n<=2) return nums;
      arr1.add(nums[0]);
      arr2.add(nums[1]);
      for(int i=2; i<n; i++){
        if(arr1.get(arr1.size()-1)>arr2.get(arr2.size()-1)){
            arr1.add(nums[i]);
            // arr2.add(nums[i+1]);
        }
        else{
            arr2.add(nums[i]);
            // arr1.add(nums[i+1]);
        }
      } 
      int []result=new int[n];
      for(int i=0; i<arr1.size(); i++){
        result[i]=arr1.get(i);
      } 
      for(int i=arr1.size(); i<n; i++){
        result[i]=arr2.get(i-arr1.size());
      }
      return result;
    }
}