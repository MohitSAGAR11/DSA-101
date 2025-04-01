package Binary_Tree;
class TreeNode {
    int data;
    TreeNode left, right;
    TreeNode(int data) {
        this.data = data;
        left = right = null;
    }
}
public class checkIdentical {
    public static boolean main(String[] args) {
        BinaryTree tree1 = new BinaryTree();
        tree1.root = new TreeNode(1);
        tree1.root.left = new TreeNode(2);
        tree1.root.left.left = new TreeNode(3);
        tree1.root.left.right = new TreeNode(4);

        BinaryTree tree2 = new BinaryTree();    
        tree2.root = new TreeNode(1);
        tree2.root.left = new TreeNode(2);  
        tree2.root.left.left = new TreeNode(3);

        return checkidentical(tree1.root, tree2.root);
    }

    public static boolean checkidentical(TreeNode root1, TreeNode root2) {
        if (root1 == null && root2 == null) return true;
        if (root1 == null || root2 == null) return false;
        if (root1.data != root2.data) return false;
        return checkidentical(root1.left, root2.left) && checkidentical(root1.right, root2.right);
    }
}
