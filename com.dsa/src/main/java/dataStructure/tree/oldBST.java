package dataStructure.tree;

public class oldBST {

  /*  private Node root;

    public void insert(int key, int value) {

        Node newNode = new Node(key, value);
        if (root == null) {
            root = newNode;
        } else {
            Node current = root; // current is node used to traverse my tree
            // since traversing begins from root node, assign it root first then change it
            Node parent; // this is the parent of current node

            while (true) {

                parent = current;
                if (key < parent.key) {
                    current = current.leftchild;
                    if (current == null) {
                        parent.leftchild = newNode;
                        return;

                    }
                } else {
                    current = current.rightchild;
                    if (current == null) {
                        parent.rightchild = newNode;
                        return;
                    }

                }

            }

        }

    }


    public Node findMin() {

        Node last = null; // this node is like temp that stores the refenence to current node before it is changed to left
        Node current = root;
        //if current node is pointing to null then it is last node with no child
        //last node in left part of tree should be smallest

        while (current != null) {
            last = current;
            current = current.leftchild;

        }


        return last;
    }      */
}
