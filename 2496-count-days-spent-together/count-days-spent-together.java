class Solution {
    static int findstay(String day,int[] cum){
        int month = Integer.parseInt(day.substring(0,2));
        int date = Integer.parseInt(day.substring(3));
        return cum[month-1]+date; 
    }
    public int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob) {
        int[] monthofdays ={31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int[] cum = new int[13];
        cum[0]=31;
        for(int i=1;i<=12;i++){
            cum[i]=cum[i-1]+monthofdays[i-1];
        }
        int Alicecome = findstay(arriveAlice,cum);
        int Alicego = findstay(leaveAlice,cum);
        int Bobcome = findstay(arriveBob,cum);
        int Bobgo = findstay(leaveBob,cum);

        int ans  = Math.min(Alicego,Bobgo)-Math.max(Alicecome,Bobcome)+1;
        
        return Math.max(ans,0);

        
    }
}