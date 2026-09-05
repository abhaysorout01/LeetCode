class Solution {
    public boolean isPossibleDivide(int[] nums, int k) {
        if(nums.length % k != 0) return false;

        HashMap<Integer,Integer> map = new HashMap<>();
        for(int n : nums) map.put(n, map.getOrDefault(n, 0) + 1);

        Arrays.sort(nums);

        for(int n : nums) {
            if(map.get(n) == 0) continue;

            int x = n;
            int ans = 0;

            while(ans < k) {
                if(map.getOrDefault(x, 0) == 0) return false;

                map.put(x, map.get(x) - 1);
                x++;
                ans++;
            }
        }

        return true;
    }
}