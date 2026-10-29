class Solution {
    static int getHeight(TreeNode node , int[] diameter){
		if(node==null)return 0;
		int left= getHeight(node.left,diameter);
		int right= getHeight(node.right,diameter);

		diameter[0]=Math.max(diameter[0],left + right);
		return 1 +Math.max(left,right);
	}
    public int diameterOfBinaryTree(TreeNode root) {
        if(root == null)return 0;
		int[] diameter = new int[1];
		getHeight(root , diameter);
		return diameter[0];
    }
}