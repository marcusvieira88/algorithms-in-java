package trees.binarytree;

public class BinaryTree {

    private BinaryTree left, right;
    private int data;

    public BinaryTree(int data) {
        this.data = data;
    }

    public BinaryTree getLeft() {
        return left;
    }

    public void setLeft(BinaryTree left) {
        this.left = left;
    }

    public BinaryTree getRight() {
        return right;
    }

    public void setRight(BinaryTree right) {
        this.right = right;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public void insert(int value) {
        if (value <= data) {
            if (left == null) {
                left = new BinaryTree(value);
            } else {
                left.insert(value);
            }
        } else {
            if (right == null) {
                right = new BinaryTree(value);
            } else {
                right.insert(value);
            }
        }
    }

    public boolean contains(int value) {
        if (data == value) {
            return true;
        } else if (value < data) {
            if (left == null) {
                return false;
            } else {
                return left.contains(value);
            }
        } else {
            if (right == null) {
                return false;
            } else {
                return right.contains(value);
            }
        }
    }
}
