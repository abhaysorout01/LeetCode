class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        int sum = 0;
        int ans = 0;
        int last1 = 0;
        for(int i = 0;i < nums.length;i++) {
            sum += nums[i];
            while(sum > goal) sum -= nums[last1++];
            int st = last1;
            boolean flag = true;
            while(sum == goal && flag && st <= i) {
                ans++;
                if(nums[st++] == 1) flag = false;
            }
        }
        return ans;
    }
}