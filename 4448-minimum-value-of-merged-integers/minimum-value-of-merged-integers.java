class Solution {
    public int minMergedInteger(int[] nums) {
        int min = Integer.MAX_VALUE;
        for(int i = 0;i < nums.length;i+=2) {
            String x = Integer.toString(nums[i]);
            String y = Integer.toString(nums[i+1]);
            min = Math.min(min,Integer.parseInt(x+y));
        }
        return min;
    }
}