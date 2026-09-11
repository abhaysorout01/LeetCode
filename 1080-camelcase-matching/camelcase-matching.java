class Solution {
    public List<Boolean> camelMatch(String[] queries, String pattern) {
        List<Boolean> list = new ArrayList<>();
        // List<String> patt = new ArrayList<>();
        // StringBuilder sb = new StringBuilder();
        // sb.append(pattern.charAt(0));
        // for(int i = 1;i < pattern.length();i++) {
        //     if(pattern.charAt(i) < 'a') {
        //         patt.add(sb.toString());
        //         sb.setLength(0);
        //     }
        //     sb.append(pattern.charAt(i));
        // }
        // if(sb.length() > 0) patt.add(sb.toString());
        for(String s : queries) {
            boolean flag = true;
            int j = 0;
            for(int i = 0;i < s.length();i++) {
                if(j == pattern.length()) {
                    if(s.charAt(i) < 'a') {
                        flag = false;
                        break;
                    }
                }
                else if(s.charAt(i) == pattern.charAt(j)) j++;
                else if(s.charAt(i) < 'a' && s.charAt(i) != pattern.charAt(j)) {
                    flag = false;
                    break;
                }
            }
            if(j == pattern.length()) list.add(flag);
            else list.add(false);
        }
        return list;
    }
}