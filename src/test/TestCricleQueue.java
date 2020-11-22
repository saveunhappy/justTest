package test;

import queue.ArrayQueue;
import queue.CircleQueue;

import java.util.Scanner;

public class TestCricleQueue {
    public static void main(String[] args) {

//        int rear = 6;
//        int front = 0;
//        int maxSize = 10;
//        int queueSize = (rear + 1) % maxSize;
//        System.out.println(queueSize);


        //create a queue
        CircleQueue arrayQueue = new CircleQueue(4);//队列的有效个数最大是3，rear+1,空了一个位置
        char key = ' ';//receive user input
        Scanner scanner = new Scanner(System.in);

        Boolean loop = true;
        //output a menu
        while (loop) {
            System.out.println("s:show the queue");
            System.out.println("e:exit the program");
            System.out.println("a:add date to queue");
            System.out.println("g:get data from queue");
            System.out.println("h:view data of queue header");
            key = scanner.next().charAt(0);//receive a char
            switch (key) {
                case 's':
                    arrayQueue.showQueue();
                    break;
                case 'a':
                    System.out.println("please input a number");
                    int value = scanner.nextInt();
                    try {
                        arrayQueue.addQueue(value);
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 'g':
                    try {
                        int res = arrayQueue.getQueue();
                        System.out.printf("get the number is: %d\n", res);

                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 'h':
                    try {
                        int res = arrayQueue.headQueue();
                        System.out.printf("get the head number is:%d\n", res);

                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 'e':
                    scanner.close();
                    loop = false;
                    break;
            }

        }
        System.out.println("the programe is stop");

    }
}
