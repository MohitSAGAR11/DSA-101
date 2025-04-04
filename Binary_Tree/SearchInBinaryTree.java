public class SearchInBinaryTree {
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
    public static void main(String[] args) {
        
    }

    public static boolean IsPresent(TreeNode root , int k) {
        if (root == null) return false;

        if (root.val == k) return true;

        return IsPresent(root.left , k) || IsPresent(root.right, k);

    }

    public static boolean IsPresentInBST(TreeNode root , int k) {
        while (root != null) {
            if (root.val == k) return true;
            if (root.val < k) root = root.right;
            else root = root.left;
        }
        return false;
    }
}
