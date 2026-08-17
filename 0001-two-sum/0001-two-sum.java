class Solution {
    public int[] twoSum(int[] nums, int target) {

        HashMap<Integer, Integer> hm = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {

            int needed = target - nums[i];
            //ensure u do this since this is checking later
            if (hm.containsKey(needed)) {
                return new int[]{hm.get(needed), i};
            }

            hm.put(nums[i], i);
        }

        return new int[]{-1, -1};
    }
}