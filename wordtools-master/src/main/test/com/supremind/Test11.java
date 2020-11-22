package com.supremind;

public class Test11 {

    public static void inc(int b[],double n){
        for (int i = 0; i < n; i++) {
            if(b[i] != 0)
                b[i] = 0;
            else {
                b[i] = 1;
                break;
            }
        }
    }
    public static void PSet(int a[],int b[],double n){
        double pw = Math.pow(2,n);
        System.out.println("1到"+n+"的幂级数");
        for (int i = 0; i < pw; i++) {
            System.out.print("{");
            for (int k = 0; k < n; k++) {
                if (b[k] != 0){
                    System.out.print(a[k]);
                }
            }
                System.out.print("}");
                inc(b,n);


        }
        System.out.println();

    }
    public static void main(String[] args) {

        int sum = 0;
        int ret = 1;
        for (int n = 1; n <= 3; n++) {
            ret = 1;
            for (int i = 1; i <= n; i++) {
                ret *= i;
            }
            sum += ret;
        }
        System.out.println(sum);
    }
}
