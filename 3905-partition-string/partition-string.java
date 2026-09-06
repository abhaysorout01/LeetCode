class Solution {
    public List<String> partitionString(String s) {
        HashSet<String> set = new HashSet<>();
        StringBuilder sb = new StringBuilder();
        List<String> list = new ArrayList<>();
        for(char ch : s.toCharArray()) {
            sb.append(ch);
            if(!set.contains(sb.toString())) {
                set.add(sb.toString());
                list.add(sb.toString());
                sb.setLength(0);
            }
        }
        return list;
    }
}