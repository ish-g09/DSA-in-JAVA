class Solution {
    public boolean isPossibleToSplit(int[] nums) {

        HashMap<Integer, Integer> hm = new HashMap<>();

        for (int num:nums) {

            hm.put(num, hm.getOrDefault(num, 0)+1);

            if (hm.get(num)>2) {
                return false;
            }
        }

        return true;
    }
}