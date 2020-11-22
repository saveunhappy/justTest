package src.com.supremind.binaryTree;

import printer.BinaryTrees;
import src.com.supremind.binaryTree.binaryTree.BST;

import java.util.Comparator;

public class Main {

    private static class PersonComparator implements Comparator<Person>{

        @Override
        public int compare(Person e1, Person e2) {
            return e1.getAge() - e2.getAge();
        }
    }
    private static class PersonComparator2 implements Comparator<Person>{

        @Override
        public int compare(Person e1, Person e2) {
            return e2.getAge() - e1.getAge();
        }
    }
    static void test1(){
        Integer data[] = new Integer[]{
                7,4,9,2,5,8,11,3,12,1
        };
        BinarySearchTree<Integer> bst = new BinarySearchTree<>();

        for (int i = 0; i < data.length; i++) {
            bst.add(data[i]);
        }
    }

    static void test2(){

        BinarySearchTree<Person> bst2 = new BinarySearchTree<>((e1, e2) -> {
            return e1.getAge() - e2.getAge();

        });
        bst2.add(new Person(12));
        bst2.add(new Person(15));
        bst2.add(new Person(7));
        bst2.add(new Person(4));
        bst2.add(new Person(9));
        bst2.add(new Person(2));
        bst2.add(new Person(5));
        BinarySearchTree<Person> bst3 = new BinarySearchTree<>(new PersonComparator());
    }

    static void test6(){
        Integer data[] = new Integer[]{
                7,4,2,1,3,5,9,8,11,10,12
        };
        BinarySearchTree<Integer> bst = new BinarySearchTree<>();

        for (int i = 0; i < data.length; i++) {
            bst.add(data[i]);
        }
        BinaryTrees.println(bst);
//        bst.levelOrderTraversal();
//        bst.levelOrder((Integer element)->{
//            System.out.print("_" + element + "_");
//            return false;
//        });
//        bst.postorderTraversal((element)->{
//            System.out.print(element + " ");
//            return false;
//        });
        bst.levelOrder(new BinarySearchTree.Visitor<Integer>(){
            public boolean visit(Integer element){
                System.out.print(element + " ");
                return false;
            }
        });
        System.out.println();
    }


    static void test9(){
        Integer data[] = new Integer[]{
                //7,4,9,2,5,1
                7,4,2,1,3,5,9,8,11,10,12
        };
        BinarySearchTree<Integer> bst = new BinarySearchTree<>();

        for (int i = 0; i < data.length; i++) {
            bst.add(data[i]);
        }
        BinaryTrees.println(bst);
        // bst.levelOrderTraversal();
        bst.preorderTraversal(new BinarySearchTree.Visitor<Integer>(){
            public boolean visit(Integer element){
                System.out.print(element + " ");
                return element == 2 ? true : false;
            }
        });
        System.out.println();
        bst.inorderTraversal(new BinarySearchTree.Visitor<Integer>(){
            public boolean visit(Integer element){
                System.out.print(element + " ");
                return element == 4 ? true : false;
            }
        });
        System.out.println();
        bst.postorderTraversal(new BinarySearchTree.Visitor<Integer>(){
            public boolean visit(Integer element){
                System.out.print(element + " ");
                return element == 4 ? true : false;
            }
        });
        System.out.println();
        bst.levelOrder(new BinarySearchTree.Visitor<Integer>(){
            public boolean visit(Integer element){
                System.out.print(element + " ");
                return element == 9 ? true : false;
            }
        });
        System.out.println();
    }

    static void test10(){
        Integer data[] = new Integer[]{
                7,4,9,2,5
                //7,4,2,1,3,5,9,8,11,10,12
        };
        BinarySearchTree<Integer> bst = new BinarySearchTree<>();

        for (int i = 0; i < data.length; i++) {
            bst.add(data[i]);
        }
        BinaryTrees.println(bst);

        System.out.println(bst.isComplete());
    }

    static void test11(){
        Integer data[] = new Integer[]{
                7,4,9,2,5,8,11,3,12,1
        };
        BinarySearchTree<Integer> bst = new BinarySearchTree<>();

        for (int i = 0; i < data.length; i++) {
            bst.add(data[i]);
        }
        BinaryTrees.println(bst);
        bst.remove(2);
       // bst.remove(3);
        //bst.remove(12);


        BinaryTrees.println(bst);
    }

    static void test12(){
        Integer data[] = new Integer[]{
                7,4,9,2,5,8,11,3,12,1
        };
        BST<Integer> bst = new BST<>();

        for (int i = 0; i < data.length; i++) {
            bst.add(data[i]);
        }
        BinaryTrees.println(bst);
    }
    public static void main(String[] args) {
        test12();


    }
    
}
