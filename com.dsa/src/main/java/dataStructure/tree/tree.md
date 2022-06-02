## Binary Search Tree
>Binary search tree is optimum since it is similar to a sorted array
hence search operation in O(logN) complexity which is equivalent to height of the tree.

All the element of the left of root node are smaller than root node while elements on right of root node are greater just like a sorted array,thus helping with search and delete time complexity.

Delete operation with two node can be carried out by replacing the parent node with predecessor(largest element on the right subtree) and replace it with root node to be removed.

**Pre-order traversal -  Root-->left subtree-->right subtree**

**Post Order traversal - left subtree-->right subtree-->root** 

**In order Traversal -   left subtree-->Root -->right subtree** This traversal is used to print a tree in sorted order

In  average case, time complexity of binary search tree is always log(N) for search, delete and insert operations 
