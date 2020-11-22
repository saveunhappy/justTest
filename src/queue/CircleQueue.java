package queue;


public class CircleQueue {
    private Integer front;
    private Integer rear;
    private Integer maxSize;
    private int[] arr;

    public CircleQueue(Integer size){
        maxSize = size;
        arr = new int[maxSize];
        front = 0;//指向队列头部，分析出front是指向队列头的前一个位置
        rear = 0;//指向队列尾部，指向队列尾的数据（就是队列最后一个数据）
    }
    public Boolean isFull(){
        return (rear + 1) % maxSize == front;
    }
    public Integer getLegalSize(){
        return (rear + maxSize - front)%maxSize;

    }
    public Boolean isEmpty(){
        return rear == maxSize;
    }

    //添加数据到队列
    public void addQueue(int n) {
        //判断队列是否满
        if (isFull()) {
            System.out.println("the queue is full，can not put data");
            return;
        }
        //直接将数据
        arr[rear] = n;//real后移
        rear  = (rear + 1) % maxSize;
     //   1 13 26 33
      //  安阳工学院80   郑州工商 120     安阳师范 30  郑州经贸 140
      //  80 140 60 90 120 40 70 40 60 60 50
    }

    //获取队列的数据
    public int getQueue() {
        //判断是否为空
        if (isEmpty()) {
            throw new RuntimeException("the queue is empty,can not get data");
        }
        //这里需要分析出front是指向队列的第一个元素
        //1.先把front对应的值保存到一个临时变量中，
        //2将front后移,考虑取模
        //将临时保存的值给返回
        Integer value = arr[front];
        front = (front + 1)% maxSize;
        return value;
    }

    public void showQueue() {
        //遍历
        if (isEmpty()) {
            System.out.println("the queue is empty,have no data");
            return;
        }
        //如果前面的东西已经取出来了，就没有数了，打印出来也没有意义，这里要打印出来有效的个数

        for (int i = front; i < front + size(); i++) {
            System.out.printf("arr[%d]=%d\n", i % maxSize, arr[i % maxSize]);
        }
    }
    public Integer size(){
        return (rear - front + maxSize) % maxSize;
    }

    //显示队列的头数据，不是取出数据
    public int headQueue() {
        //判断
        if (isEmpty()) {
            throw new RuntimeException("the queue is empty,have no data");
        }
        return arr[front];

    }
}
