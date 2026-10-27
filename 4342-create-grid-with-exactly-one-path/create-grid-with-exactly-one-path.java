class Solution {
    public String[] createGrid(int n, int m) {
        String[] arr = new String[n];
        arr[0]= ".".repeat(m);
        String s = "#".repeat(m-1)+".";
        for(int i=1;i<n;i++){
            arr[i]=s;
        }
        return arr;
        
    }
}