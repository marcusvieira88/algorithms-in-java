package trees;

import trees.binarytree.BinaryTree;

public class BinaryTreeDFS {

    public static void printInOrder(BinaryTree binaryTree) {
        if (binaryTree.getLeft() != null) {
            printInOrder(binaryTree.getLeft());
        }
        System.out.println("data=" + binaryTree.getData());
        if (binaryTree.getRight() != null) {
            printInOrder(binaryTree.getRight());
        }
    }

    public static void printOutOrder(BinaryTree binaryTree) {
        if (binaryTree.getRight() != null) {
            printInOrder(binaryTree.getRight());
        }
        System.out.println("data=" + binaryTree.getData());
        if (binaryTree.getLeft() != null) {
            printInOrder(binaryTree.getLeft());
        }
    }

    public static void printPreOrder(BinaryTree binaryTree) {
        System.out.println("data=" + binaryTree.getData());
        if (binaryTree.getLeft() != null) {
            printInOrder(binaryTree.getLeft());
        }
        if (binaryTree.getRight() != null) {
            printInOrder(binaryTree.getRight());
        }
    }

    public static void printPostOrder(BinaryTree binaryTree) {
        if (binaryTree.getLeft() != null) {
            printInOrder(binaryTree.getLeft());
        }
        if (binaryTree.getRight() != null) {
            printInOrder(binaryTree.getRight());
        }
        System.out.println("data=" + binaryTree.getData());
    }

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
