class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {
        HashMap<Integer, Integer> map1 = new HashMap<>();
        HashMap<Integer, Integer> map2 = new HashMap<>();
        int st1 = 0;
        int st2 = 0;
        int ans = 0;
        for(int i = 0; i < nums.length; i++) {
            map1.put(nums[i], map1.getOrDefault(nums[i], 0) + 1);
            map2.put(nums[i], map2.getOrDefault(nums[i], 0) + 1);
            while(map1.size() > k) {
                map1.put(nums[st1], map1.get(nums[st1]) - 1);
                if(map1.get(nums[st1]) == 0) map1.remove(nums[st1]);
                st1++;
            }
            while(map2.size() >= k) {
                map2.put(nums[st2], map2.get(nums[st2]) - 1);
                if(map2.get(nums[st2]) == 0) map2.remove(nums[st2]);
                st2++;
            }
            ans += st2 - st1;
        }
        return ans;
    }
}