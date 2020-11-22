package queue;

public class ArrayQueue {
    private int maxSize;
    private int front;
    private int real;
    private int[] arr;

    //创建队列的构造器
    public ArrayQueue(int arrMaxSize) {
        maxSize = arrMaxSize;
        arr = new int[maxSize];
        front = -1;//指向队列头部，分析出front是指向队列头的前一个位置
        real = -1;//指向队列尾部，指向队列尾的数据（就是队列最后一个数据）
    }

    //判断队列是否满
    public boolean isFull() {
        return real == maxSize - 1;
    }

    //判断队列是否为空
    public boolean isEmpty() {
        return real == front;
    }

    //添加数据到队列
    public void addQueue(int n) {
        //判断队列是否满
        if (isFull()) {
            System.out.println("the queue is full，can not put data");
            return;
        }
        real++;//real后移
        arr[real] = n;

    }

    //获取队列的数据
    public int getQueue() {
        //判断是否为空
        if (isEmpty()) {
            throw new RuntimeException("the queue is empty,can not get data");
        }

        front++;//front后移
        return arr[front];
    }

    public void showQueue() {
        //遍历
        if (isEmpty()) {
            System.out.println("the queue is empty,have no data");
            return;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("arr[%d]=%d\n", i, arr[i]);
        }
    }

    //显示队列的头数据，不是取出数据
    public int headQueue() {
        //判断
        if (isEmpty()) {
            throw new RuntimeException("the queue is empty,have no data");
        }
        return arr[front + 1];

    }
}
