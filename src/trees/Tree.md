# Tree

In computer science, a [tree](https://en.wikipedia.org/wiki/Tree_(data_structure)) is a widely used abstract data type (ADT) that simulates a hierarchical tree structure, with a root value and subtrees of children with a parent node, represented as a set of linked nodes.

## Binary Tree Search (or Binary Tree traversal)

In computer science, a [binary tree](https://en.wikipedia.org/wiki/Binary_tree) is a tree data structure in which each node has at most two children, which are referred to as the left child and the right child.

### Depth-first search of binary tree

These searches are referred to as depth-first search (DFS), as the search tree is deepened as much as possible on each child before going to the next sibling.

#### In-order (LNR)

1. Check if the current node is empty or null.
2. Traverse the left subtree by recursively calling the in-order function.
3. Display the data part of the root (or current node).
4. Traverse the right subtree by recursively calling the in-order function.

### Out-order (RNL)

1. Check if the current node is empty or null.
2. Traverse the right subtree by recursively calling the out-order function.
3. Display the data part of the root (or current node).
4. Traverse the left subtree by recursively calling the out-order function.

#### Pre-order (NLR) 

1. Check if the current node is empty or null.
2. Display the data part of the root (or current node).
3. Traverse the left subtree by recursively calling the pre-order function.
4. Traverse the right subtree by recursively calling the pre-order function.

#### Post-order (LRN) 

1. Check if the current node is empty or null.
2. Traverse the left subtree by recursively calling the post-order function.
3. Traverse the right subtree by recursively calling the post-order function.
4. Display the data part of the root (or current node).

### Breadth-first search / level order

Trees can also be traversed in level-order, where we visit every node on a level before going to a lower level.














