class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int max = nums[0];
        int ans = -1;
        for(int i = 0;i < nums.length;i++) {
            if(max < nums[i]) max = nums[i];
            int min = Integer.MAX_VALUE;
            for(int j = i;j < nums.length;j++) {
                if(min > nums[j]) min = nums[j];
            }
            if(max - min <= k) {
                ans = i;
                break;
            }
        }
        return ans;
    }
}