package binaryTree.binaryTree;

import java.util.Comparator;

public class AVLTree<E> extends BST<E> {
    public AVLTree(){
        this(null);
    }
    public AVLTree(Comparator<E> comparator){
        super(comparator);
    }

    @Override
    protected void afterAdd(Node<E> node) {
        while((node = node.parent)!=null){
            
        }
    }
}
