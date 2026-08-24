class Solution {
    static int fibo(int n ){
        if(n==1){
            return 1;
        }
        if(n==0){
            return 0;
        }
        return fibo(n-1)+fibo(n-2);
    }
    public int fib(int n) {
        int fn = fibo(n);
        return fn;
        
    }
}