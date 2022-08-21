package Composite;

public class Tree {
    TreeNode root = null;

    public Tree(String name) {
        root = new TreeNode(name);
    }

    public static void main(String[] args) {
        Tree tree = new Tree("A branch");
        TreeNode nodeB = new TreeNode("B branch");
        TreeNode nodeC = new TreeNode("C branch");

        nodeB.add(nodeC);
        tree.root.add(nodeB);
        System.out.println("Grow the tree finished!");
    }
}
