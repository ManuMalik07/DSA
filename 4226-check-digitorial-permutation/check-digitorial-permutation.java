class Solution {
    static int fact(int n ){
        if(n==1 || n==0){
            return 1;
        }
        return n*(fact(n-1));
    }
    public boolean isDigitorialPermutation(int n) {
        int m = n;
        int fsum=0;
        while(n!=0){
            fsum += fact(n%10);
            n=n/10;
        }

        // lets check if they booth contains rhe same digit 
        String a = String.valueOf(m);
        String b = String.valueOf(fsum);

        char[] arr1 = a.toCharArray();
        char[] arr2 = b.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);
        if(Arrays.equals(arr1,arr2)){
            return true;
        }
        return false;




        
    }
}