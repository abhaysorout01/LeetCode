class ProductOfNumbers {

    int[] arr = new int[40001];
    int i = 0;
    public ProductOfNumbers() {
    
    }
    
    public void add(int num) {
        arr[i] = num;
        i++;
    }
    
    public int getProduct(int k) {
        int ans = 1;
        for(int j = i - k;j < i;j++) {
            ans *= arr[j];
        }
        return ans;
    }
}
