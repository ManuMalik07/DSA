class ProductOfNumbers {
    List<Integer>temp;
    public ProductOfNumbers() {
        temp=new ArrayList<>();
    }
    
    public void add(int num) {
        temp.add(num);
    }
    
    public int getProduct(int k) {
        int product =1;
        int n = temp.size();
        for(int i=n-k;i<n;i++){
            product *= temp.get(i);
        }
        return product;
    }
}

/**
 * Your ProductOfNumbers object will be instantiated and called as such:
 * ProductOfNumbers obj = new ProductOfNumbers();
 * obj.add(num);
 * int param_2 = obj.getProduct(k);
 */