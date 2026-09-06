class Solution {
    public int findShortestSubArray(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int n : nums) map.put(n,map.getOrDefault(n, 0) + 1);
        int max = 0;
        for(int key : map.keySet()) max = Math.max(max,map.get(key));
        HashMap<Integer,Integer> map2 = new HashMap<>();
        int st = 0;
        int ans = nums.length;
        for(int i = 0;i < nums.length;i++) {
            map2.put(nums[i],map2.getOrDefault(nums[i], 0) + 1);
            while(map2.get(nums[i]) >= max) {
                ans = Math.min(ans,i - st + 1);
                map2.put(nums[st],map2.getOrDefault(nums[st++], 0) - 1);
            }
        }
        return ans;
    }
}