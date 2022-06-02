package dataStructure.tree;

public class BinarySearchTree<T extends Comparable<T>> implements Tree<T> {

    private Node<T> root;

    @Override
    public void insert(T data) {
        if (root == null) {
            root = new Node<>(data, null);
            // if no root is present then this is first node and its parent should be null
        }
        //otherwise, call the overloaded insert method
        else {

            insert(data, root);
        }

    }

    private void insert(T data, Node<T> node)
    //node is referring to the parent
    {
        if (node.getData().compareTo(data) > 0) { //root.data>data
            // if root data is bigger than new data to be inserted then compareTo will return +ve
            // move left as new data is smaller
            if (node.getLeftChild() != null) {
                // recursively try to insert the data by fetching left child
                insert(data, node.getLeftChild());
            } else {
                node.setLeftChild(new Node<>(data));
                // if node does not have a left child insert a data on left with node as its parent
            }

        }
        // if data to be inserted is greater than root node

        else {
            // move right as new data is greater
            if (node.getRightChild() != null) {
                // recursively try to insert the data by moving toward right
                insert(data, node.getRightChild());
            } else {
                node.setRightChild(new Node<>(data));
                // if node does not have a right child insert a data on right with node as its parent
            }

        }
    }


    @Override
    public void remove(T data) {
        if(data != null) {
            remove(data,root);
            // start the recursion from the root node
        }
    }

    private void remove(T data, Node<T> node) {
        if(node==null) return;
        if(data.compareTo(root.getData())<0){
             remove(data,root.getLeftChild());
            //move to left in search of node with data since it is smaller than roots data
        }
        else if(data.compareTo(root.getData())>0){
            // continue search in the right for data larger than the root or parentNode node
            remove(data,root.getRightChild());
        }
        else // IF node with data to be removed is found
        {   //CASE 1 ---- LEAF NODE
            // this means that the node is just a leaf node with no children
            if(node.getLeftChild() == null && node.getRightChild() ==null){
                //in this scenario, notify the parent tha the child is removed
                Node<T> parent = node.getParentNode();
                // if the node to be removed is right child of the parent node, set the left of the parent as null
                if(parent!=null && parent.getLeftChild() == node){
                    parent.setLeftChild(null);
                }
                else if(parent!=null && parent.getRightChild() == node){
                    parent.setRightChild(null);
                }
                if(parent == null) root =null; // if there is only one node in the BST remove that node

                node =null;

            }

            //CASE 2 -- ONE CHILD(Right)---- no left child exists

             else if(node.getRightChild() !=null && node.getLeftChild() == null)
             {
                 Node<T> parent = node.getParentNode();
                 //check if our node to be removed in right or left of this parent
                if(parent !=null && parent.getLeftChild() == node)
                //if it is left child of the parent, we need to make a new left child to this parent
                    //Parents right child same as nodes right child since our node to be removed has only right child
                {

                    parent.setLeftChild(node.getRightChild());
                }
                //if it is Right child of the parent, we need to make a new Right child to this parent
                else if(parent !=null && parent.getRightChild() == node){

                    parent.setRightChild(node.getRightChild());
                }
                if(parent == null) //dealing with a root node
                {
                    root = node.getRightChild(); //giving BST its new root
                    //since there is no left child, update the root with right child as root has to be removed
                }
                //update the parent of right child, since it will need a new parent after node(current parent) is removed
                node.getRightChild().setParentNode(parent);
                node =null; //garbage collection of node//

             }
             //case-2 -- with one left child

              else if(node.getLeftChild() !=null && node.getRightChild() == null)
             {
                 Node<T> parent = node.getParentNode();
                if(parent !=null && parent.getLeftChild() == node)
                {
                    parent.setLeftChild(node.getLeftChild());
                }
                else if(parent !=null && parent.getRightChild() == node){
                    parent.setRightChild(node.getLeftChild());
                }
                if(parent == null)
                {
                    root = node.getLeftChild();
                }
                //update the parent of right child, since it will need a new parent after node(current parent) is removed
                node.getLeftChild().setParentNode(parent);
                node =null; //garbage collection of node//

             }

              //CASE 3 --- both left and right child present
            //find successor(smallest in right tree)  and Predecessor (largest in left tree)
            //swap the node to be removed with the predecessor(this node will be leaf node)
            //after swap our node is the leaf node -- we know how to remove a leaf node (implemented up)

            else{

                Node<T> predecessor = getPredecessor(node.getLeftChild());

                T temp = predecessor.getData();
                predecessor.setData(node.getData());
                node.setData(temp);
                //recursively remove the data
                remove(data,predecessor);
            }



        }


    }
    //largest node in left subtree will be always present in the right
    public Node<T> getPredecessor(Node<T> node) {

        if (node.getRightChild()!=null){

            return getPredecessor(node.getRightChild());
        }
        return node;
    }

    @Override
    public void traverse() {
        if (root == null) return;
         inorder(root);

    }

    private void inorder(Node<T> node) {  //left->root(node)-->right
        if (node.getLeftChild() != null) {

            inorder(node.getLeftChild());
        }
            System.out.print(node + "-->");
        if (node.getRightChild() != null) {
            inorder(node.getRightChild());

        }
            System.out.print(node + "-->");
    }

    @Override
    public T getMax() {
        if (root == null) return null;
        else return getMax(root);
    }

    private T getMax(Node<T> node) {
        // rightmost child is the maximum data in tree , recursively traverse to find rightmost child
        if (node.getRightChild() != null) return getMax(node.getRightChild());
            //end recursion and return when there is no more right child in tree
        else return node.getData();

    }


    @Override
    public T getMin() {
        if (root == null) return null;
        else return getMin(root);
    }

    private T getMin(Node<T> node) {
        if (node.getLeftChild() != null) return getMin(node.getLeftChild());
            //end recursion and return when there is no more left child in tree
        else return node.getData();


    }
}
