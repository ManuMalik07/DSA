class Solution {
    public int totalNumbers(int[] digits) {
        int n = digits.length;
        // first Approaach
        // int countodd=0;
        // int counteven=0;
        // for(int i=0;i<n;i++){
        //     if( digits[i]%2 !=0){
        //         countodd++;
        //     }
        // }
        // if(countodd==n){
        //     return 0;
        // }
        // int[] freq = new int[10];
        // for(int i=0;i<n;i++){
        //     freq[digits[i]]++;
        // }
        // int ans =0;
        // for(int first=1;first<=9;first++){
        //     for(int second=0;second<=9;second++){
        //         for(int third=0;third<=8 ;third +=2){
        //             int[] digit= new int[10];
        //             digit[first]++;
        //             digit[second]++;
        //             digit[third]++;

        //             boolean flag =true;
        //             for(int i=0;i<10;i++){
        //                 if(digit[i]>freq[i]){
        //                     flag=false;
        //                     break;
        //                 }
        //             }
        //             if(flag){
        //                 ans++;
        //             }
                    
        //         }
        //     }
        // }

        // return ans;
        
        // Aryan lohan Approach 
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<n;i++){
            if(digits[i]==0)continue;
            for(int j=0;j<n;j++){
                for(int k=0;k<n;k++ ){
                    if(i==j || j==k|| k==i){
                        continue;
                    }
                    int nums = digits[i]*100 + digits[j]*10+digits[k];
                    if(nums>=100 && nums%2 ==0){
                        set.add(nums);
                    }
                }
            }
        }
        return set.size();
    }
}