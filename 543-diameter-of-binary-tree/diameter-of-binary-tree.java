class Solution {
    private int  diameter;
    private int ht(TreeNode root ){
        if(root == null){
            return 0;
        }
        int lst = ht(root.left);
        int rst = ht(root.right);
        diameter = Math.max(diameter , lst+rst);
         return 1+Math.max(lst,rst);
    }
    public int diameterOfBinaryTree(TreeNode root) {
        diameter =0;
        ht(root);
        return diameter;
        
    }
}