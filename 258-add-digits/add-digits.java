class Solution {
    static int sum(int n ){
        int s=0;
        while(n !=0){
            s += n%10;
            n = n/10;
        }
        return s ;
    }
    public int addDigits(int num) {

        int k=sum(num); 


        while(k >= 10){
            k=sum(k);
        }
        
        return k;


        
    }
}