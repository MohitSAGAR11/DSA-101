package Binary_Tree;

public class HeightOfBinaryTree {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);    
        root.right = new TreeNode(3);    
        root.left.left = new TreeNode(4);    
        root.left.right = new TreeNode(5);    
        root.right.left = new TreeNode(6);    
        root.right.right = new TreeNode(7);    
        System.out.println(height(root));
    }

    public static int height(TreeNode root) {
        if (root == null) return 0;  // for edges use -1;
        
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);
        
        return 1 + Math.max(leftHeight, rightHeight);
    }
}
