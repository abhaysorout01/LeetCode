class Solution {
    public int findLength(int[] nums1, int[] nums2) {
        int max = 0;
        for(int i = 0;i < nums1.length;i++) {
            for(int j = 0;j < nums2.length;j++) {
                int len = 0;
                int x = i;
                while(j < nums2.length && x < nums1.length && nums2[j] == nums1[x]) {
                    x++;
                    j++;
                    len++;
                }
                if(len > 0) j--;
                max = Math.max(max,len);
            }
        }
        for(int i = 0;i < nums2.length;i++) {
            for(int j = 0;j < nums1.length;j++) {
                int len = 0;
                int x = i;
                while(j < nums1.length && x < nums2.length && nums1[j] == nums2[x]) {
                    x++;
                    j++;
                    len++;
                }
                if(len > 0) j--;
                max = Math.max(max,len);
            }
        }
        
        return max;
    }
}