class Solution {
    public List<String> fizzBuzz(int n) {
        ArrayList<String> arr = new ArrayList<>();
        for(int i=1;i<=n;i++){
            
            if(i%3==0 && i%5!=0){
                arr.add(i-1,"Fizz");
            }
            else if(i%5==0 && i%3!=0){
                arr.add(i-1,"Buzz");
            }
            else if(i%15==0){
                arr.add(i-1,"FizzBuzz");
            }
            else{
             arr.add(String.valueOf(i));
            }
            
        }
        return arr;
        
    }
}