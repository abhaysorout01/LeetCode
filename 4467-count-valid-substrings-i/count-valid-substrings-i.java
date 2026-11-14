class Solution {
    public long countValidSubstrings(String s) {
        int i = 0;
        int j = 0;
        int l = s.length();
        long count = 0;
        while(j < l){
            if(j>=2 && s.charAt(j-2)=='a' && s.charAt(j-1)=='b' && s.charAt(j)=='c') i=j-1;
            count += (j-i+1);
            j++;
        }
        return count;
    }
}