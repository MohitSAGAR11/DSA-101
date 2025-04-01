package Binary_Tree;

class TreeNode {
    int data;
    TreeNode left, right;
    TreeNode(int data) {
        this.data = data;
        left = right = null;
    }
}

public class ConvertToMirror {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
    }
    
    public static void mirror(TreeNode root) {
        if (root == null) return;
        mirror(root.left);
        mirror(root.right);
       TreeNode temp = root.left;
       root.left = root.right;
       root.right = temp;
    }
}
