package trees;

import trees.binarytree.BinaryTree;
import trees.binarytree.BinaryTreeBFS;

public class BinaryTreeTest {

    public static void main(String[] args) {
        final BinaryTree tree = new BinaryTree(20);
        tree.insert(10);
        tree.insert(30);
        tree.insert(11);
        tree.insert(12);
        tree.insert(8);
        tree.insert(2);
        tree.insert(1);

        System.out.println("=========== Binary Tree DFS printInOrder ==============");
        BinaryTreeDFS.printInOrder(tree);
        System.out.println("=========== Binary Tree DFS printOutOrder ==============");
        BinaryTreeDFS.printOutOrder(tree);
        System.out.println("=========== Binary Tree DFS printPreOrder =============");
        BinaryTreeDFS.printPreOrder(tree);
        System.out.println("=========== Binary Tree DFS printPostOrder ============");
        BinaryTreeDFS.printPostOrder(tree);

        System.out.println("=========== Binary Tree BFS ============");
        BinaryTreeBFS.printLevelsRecursively(tree);
        System.out.println("=========== Binary Tree BFS printSingleLevelRecursively ============");
        BinaryTreeBFS.printSingleLevelRecursively(tree, 2);
        System.out.println("=========== Binary Tree BFS heightOfTree ============");
        System.out.println(BinaryTreeBFS.heightOfBinaryTree(tree));
    }
}
