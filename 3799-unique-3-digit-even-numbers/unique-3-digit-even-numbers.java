class Solution {
    public int totalNumbers(int[] digits) {
        int n = digits.length;
        int countodd=0;
        int counteven=0;
        for(int i=0;i<n;i++){
            if( digits[i]%2 !=0){
                countodd++;
            }
        }
        if(countodd==n){
            return 0;
        }
        int[] freq = new int[10];
        for(int i=0;i<n;i++){
            freq[digits[i]]++;
        }
        int ans =0;
        for(int first=1;first<=9;first++){
            for(int second=0;second<=9;second++){
                for(int third=0;third<=8 ;third +=2){
                    int[] digit= new int[10];
                    digit[first]++;
                    digit[second]++;
                    digit[third]++;

                    boolean flag =true;
                    for(int i=0;i<10;i++){
                        if(digit[i]>freq[i]){
                            flag=false;
                            break;
                        }
                    }
                    if(flag){
                        ans++;
                    }
                    
                }
            }
        }

        return ans;
        

        
    }
}