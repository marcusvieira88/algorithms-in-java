package trees.binarytree;

public class BinaryTreeBFS {

    public static void printLevelsRecursively(BinaryTree root) {
        int height = heightOfBinaryTree(root);

        for (int i = 1; i <= height; i++) {
            System.out.println("level " + i + ": ");
            printSingleLevelRecursively(root, i);
        }
    }

    public static int heightOfBinaryTree(BinaryTree root) {
        if (root == null) {
            return 0;
        }

        int leftHeight = heightOfBinaryTree(root.getLeft());
        int rightHeight = heightOfBinaryTree(root.getRight());

        return Math.max(leftHeight, rightHeight) + 1;
    }

    public static void printSingleLevelRecursively(BinaryTree root, int level) {
        if (root == null) {
            return;
        }

        if (level == 1) {
            System.out.println("data=" + root.getData());
        } else if (level > 1) {
            printSingleLevelRecursively(root.getLeft(), level - 1);
            printSingleLevelRecursively(root.getRight(), level - 1);
        }
    }
}
