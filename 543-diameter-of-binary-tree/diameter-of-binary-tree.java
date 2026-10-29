class Solution {
    private int  diameter=0;
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
        ht(root);
        return diameter;
        
    }
}