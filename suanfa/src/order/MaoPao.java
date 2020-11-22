package order;

import tools.Integers;
import tools.Times;

public class MaoPao {
    public static void main(String[] args) {
//        int array[] = {10,9,19,28,37,56,34};
//
//        Integer[] array1 = Integers.tailAscOrder(1,10000,2000);
//        Integer[] array2 = Integers.copy(array1);
//        Integer[] array3 = Integers.copy(array1);
//
//      //  Integers.println(array1);
//        Times.test("bubbleSorted1",() ->{
//            bubbleSorted1(array1);
//        });
//        Times.test("bubbleSorted2",() ->{
//            bubbleSorted2(array2);
//        });
//        Times.test("bubbleSorted3",() ->{
//            bubbleSorted3(array3);
//        });
        //Integer[] array = Integers.random(10,1,100);
        Integer[] array = {5,7,6,55,99,10,22,33,77,88};
        selectionSort(array);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+"   ");
        }
        System.out.println(Integers.isAscOrder(array));

    }
    static void selectionSort(Integer[] array){
        for (int end = array.length - 1; end > 0; end--) {
            int maxIndex = 0;
            for (int begin = 1; begin <= end; begin++) {
                if(array[maxIndex] <= array[begin]){
                    maxIndex = begin;
                }
            }
            //找到最大的那个元素放到最后，再重新比较，end--就不会和最后那个元素进行比较了
            int tmp = array[maxIndex];
            array[maxIndex] = array[end];
            array[end] = tmp;
        }
    }
    static void bubbleSorted1(Integer[] array){
        for (int end = array.length - 1; end > 0; end--) {
            for (int begin = 1; begin <= end; begin++) {
                if(array[begin] < array[begin - 1]){
                    int tmp = array[begin];
                    array[begin] = array[begin - 1];
                    array[begin - 1] = tmp;
                }
            }
        }

    }
    static void bubbleSorted2(Integer[] array){
        for (int end = array.length - 1; end > 0; end--) {
            boolean sorted = true;
            for (int begin = 1; begin <= end; begin++) {
                if(array[begin] < array[begin - 1]){
                    int tmp = array[begin];
                    array[begin] = array[begin - 1];
                    array[begin - 1] = tmp;
                    sorted = false;
                }
            }
            if(sorted)break;
        }
    }

    static void bubbleSorted3(Integer[] array){
        for (int end = array.length - 1; end > 0; end--) {
            //sortedIndex在数组完全有序的时候有用
            //int sortedIndex = end;  如果完全有序，end赋值给sortedIndex,然后没有进入if，sortedIndex又
            //赋值给了end，相当于这两行代码没有执行，还是最垃圾的那个循环，所以要保证sortedIndex的初始值为
            //0,1，-1，要保证end--的时候，end是小于0的，这样就会直接退出循环
            int sortedIndex = 1;
            for (int begin = 1; begin <= end; begin++) {
                if(array[begin] < array[begin - 1]){
                    int tmp = array[begin];
                    array[begin] = array[begin - 1];
                    array[begin - 1] = tmp;
                    sortedIndex = begin;
                }
            }
            end = sortedIndex;
        }
    }
}
