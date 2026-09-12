class Solution {
    public List<Integer> beautifulIndices(String s, String a, String b, int k) {
        List<Integer> ans = new ArrayList<>();
        List<Integer> listj = new ArrayList<>();
        for(int i = 0;i <= s.length() - b.length();i++) {
            if(s.substring(i,i+b.length()).equals(b)) {
                listj.add(i);
            }
        }
        for(int i = 0;i <= s.length() - a.length();i++) {
            if(s.substring(i,i+a.length()).equals(a)) {
                boolean flag = false;
                for(int n : listj) {
                    if(Math.abs(n-i) <= k) {
                        flag = true;
                        break;
                    }
                }
                if(flag) ans.add(i);
            }
        }
        return ans;
        
    }
}