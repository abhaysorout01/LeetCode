class Solution {
    public boolean threeFibonacciSum(int n) {
        int sum = 0;
        int a = 0;
        int b = 1;
        int x = 0;
        int last2 = -1;
        int last = -1;
        while(true) {
            if(last != -1 && last2 != -1 && a + last2 + last == n) return true;
            else if(last != -1 && last2 != -1 && a + last2 + last > n) return false;
            int c = a + b;
            last2 = last;
            last = a;
            a = b;
            b = c;
        }
    }
}