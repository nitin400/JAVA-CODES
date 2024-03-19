class Solution {
    TreeNode ans;

    public void flatten(TreeNode root) {
        if(root == null)
        return ;

         ans = new TreeNode(root.val);
        TreeNode ans1 = ans;
        function(root);

        root.left = null;
        root.right = ans1.right;


    }

    void function(TreeNode root){
        if(root == null)
            return ;

        ans.val = root.val;
        if(root.left !=null){
            ans.right = new TreeNode();
            ans.left = null;
            ans = ans.right;
            function(root.left);
        }
        if(root.right!=null){
            ans.right = new TreeNode();
            ans.left = null;
            ans = ans.right;
            function(root.right);
        }
    }
}