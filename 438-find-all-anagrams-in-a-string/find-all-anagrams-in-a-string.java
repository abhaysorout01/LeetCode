class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        int[] arr1 = new int[26];
        List<Integer> list = new ArrayList<>();
        int[] arr2 = new int[26];
        for(char ch : p.toCharArray()) arr1[ch - 'a']++;
        for(int i = 0;i < s.length();i++) {
            arr2[s.charAt(i)-'a']++;
            if(i >= p.length()) arr2[s.charAt(i-p.length())-'a']--;
            boolean b = true;
            for(int j = 0;j < 26;j++) {
                if(arr1[j] != arr2[j]) {
                    b = false;
                    break;
                }
            }
            if(b) list.add(i-p.length()+1);
        }
        return list;
    }
}