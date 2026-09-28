class Solution {
    public int[] rearrangeArray(int[] nums) {
        int i = 0;
        TreeMap<Integer, Integer> map = new TreeMap<>();
        for (int n : nums) map.put(n, map.getOrDefault(n, 0) + 1);
        while (!map.isEmpty()) {
            for (int k : new ArrayList<>(map.keySet())) {
                nums[i++] = k;
                map.put(k, map.get(k) - 1);
                if (map.get(k) == 0) map.remove(k);
            }
        }
        return nums;
    }
}