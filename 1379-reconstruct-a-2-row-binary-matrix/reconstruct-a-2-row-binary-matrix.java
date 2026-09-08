class Solution {
    public List<List<Integer>> reconstructMatrix(int upper, int lower, int[] colsum) {
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> t1 = new ArrayList<>();
        List<Integer> t2 = new ArrayList<>();
        for(int n : colsum) {
            if(n == 0) {
                t1.add(0);
                t2.add(0);
            }
            else if(n == 1) {
                if(upper > lower) {
                    t1.add(1);
                    t2.add(0);
                    upper--;
                }
                else {
                    t1.add(0);
                    t2.add(1);
                    lower--;
                }
            }
            else {
                t1.add(1);
                t2.add(1);
                upper--;
                lower--;
            }
        }
        if(lower != 0 || upper != 0) return list;
        list.add(t1);
        list.add(t2);
        return list;
    }
}