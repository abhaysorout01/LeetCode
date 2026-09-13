class Solution {
    public boolean isNStraightHand(int[] hand, int groupSize) {
        if(hand.length % groupSize != 0) return false;
        TreeMap<Integer,Integer> map = new TreeMap<>();
        for(int n : hand) map.put(n, map.getOrDefault(n, 0) + 1);
        while(!map.isEmpty()) {
            int start = map.firstKey();
            int count = map.get(start);
            for(int i = 0;i < groupSize;i++) {
                int num = start + i;
                if(!map.containsKey(num) || map.get(num) < count) return false;
                map.put(num, map.get(num) - count);
                if(map.get(num) == 0) map.remove(num);
            }
        }
        return true;
    }
}