package com.supremind;

public class Main {
    /*
     * 斐波那契数列
     * 0 1 1 2 3 5 8 13 ...
     */


    /**
     * 大O表示法，忽略常数、系数、低阶
     * @param n
     * @return
     */
    public static int fib1(int n) {
        if(n <= 1) return n;
        return fib1(n - 1) + fib1(n - 2);
    }
    public static int fib2(int n) {
        if(n <= 1) return n;
        int first = 0;
        int second = 1;
        //n前面那个数，当然要减一了
        for(int i = 0;i <= n - 1;i++) {
            //前两个数相加
            int sum = first + second;
            //这时候 0 + 1 = 1，求出来和了，就是第三个数，第二个数是一，但是菲波那切数列都是前俩
            //相加，sum就是新的第二个数，原来的second就变成了first
            first = second;
            second = sum;
        }
        return second;
    }

    public static void main(String[] args) {
        System.out.println(fib2(5));
    }


    public static void test1(int n) {
        // 汇编指令
        /**
         * 时间复杂度就是看执行了多少，就是看分号，执行了多少个分号
         */
        // 1  else中的东西不影响
        if (n > 10) {
            System.out.println("n > 10");
        } else if (n > 5) { // 2
            System.out.println("n > 5");
        } else {
            System.out.println("n <= 5");
        }

        // 1 + 4 + 4 + 4

        //初始化 i = 0一次，i< 4 四次， i ++四次，syso四次
        for (int i = 0; i < 4; i++) {
            System.out.println("test");
        }

        // O(1)
    }

    public static void test2(int n) {
        // O(n)
        // 1 + n + n + n
        // 1 + 3n
        for (int i = 0; i < n; i++) {
            System.out.println("test");
        }
    }

    public static void test3(int n) {
        // 1 + 2n + n * (1 + 3n)
        // 1 + 2n + n + 3n^2
        // 3n^2 + 3n + 1
        // O(n^2)

        // O(n)
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println("test");
            }
        }
    }

    public static void test4(int n) {
        // 1 + 2n + n * (1 + 45)
        // 1 + 2n + 46n
        // 48n + 1
        // O(n)
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 15; j++) {
                System.out.println("test");
            }
        }
    }

    public static void test5(int n) {
        // 8 = 2^3
        // 16 = 2^4

        // 3 = log2(8)
        // 4 = log2(16)

        // 执行次数 = log2(n)
        // O(logn)
        while ((n = n / 2) > 0) {
            System.out.println("test");
        }
    }

    public static void test6(int n) {
        // log5(n)
        // O(logn)
        while ((n = n / 5) > 0) {
            System.out.println("test");
        }
    }

    public static void test7(int n) {
        // 1 + 2*log2(n) + log2(n) * (1 + 3n)

        // 1 + 3*log2(n) + 2 * nlog2(n)
        // O(nlogn)
        for (int i = 1; i < n; i = i * 2) {
            // 1 + 3n
            for (int j = 0; j < n; j++) {
                System.out.println("test");
            }
        }
    }

    public static void test10(int n) {
        // O(n)
		//test sourcetree
        int a = 10;
        int b = 20;
        int c = a + b;
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i] + c);
        }
    }
}
