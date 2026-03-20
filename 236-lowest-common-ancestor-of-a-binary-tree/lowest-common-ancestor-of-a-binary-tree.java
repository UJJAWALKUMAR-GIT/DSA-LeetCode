class Solution {
    public boolean exists(TreeNode root, TreeNode node){
        if(node==root) return true;
        if(root==null) return false;
        return exists(root.left,node) || exists(root.right,node);
    }
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(p==root || q==root) return root;
        boolean IsPLiesLST = exists(root.left,p);
        boolean IsQLiesLST = exists(root.left,q);
        if(IsPLiesLST == true && IsQLiesLST == true) return lowestCommonAncestor(root.left,p,q);
        if(IsPLiesLST == false && IsQLiesLST == false) return lowestCommonAncestor(root.right,p,q);
        return root;
    }
}