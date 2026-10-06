class Solution {
    public int reversePairs(int[] nums) {
        return mergeSort(nums, 0, nums.length - 1);
    }
    int mergeSort(int[] nums, int low, int high) {
        if(low >= high) return 0;
        int mid = low + (high - low) / 2;
        int ans = 0;
        ans += mergeSort(nums, low, mid);
        ans += mergeSort(nums, mid + 1, high);
        int j = mid + 1;
        for(int i = low; i <= mid; i++) {
            while(j <= high && (long)nums[i] > 2L * nums[j]) j++;
            ans += j - (mid + 1);
        }
        merge(nums, low, mid, high);
        return ans;
    }
    void merge(int[] nums, int low, int mid, int high) {
        ArrayList<Integer> list = new ArrayList<>();
        int i = low;
        int j = mid + 1;
        while(i <= mid && j <= high) {
            if(nums[i] <= nums[j]) list.add(nums[i++]);
            else list.add(nums[j++]);
        }
        while(i <= mid) list.add(nums[i++]);
        while(j <= high) list.add(nums[j++]);
        for(int k = low; k <= high; k++) nums[k] = list.get(k - low);
    }
}