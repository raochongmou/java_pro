package rao;

import java.util.Random;

@SuppressWarnings({"all"})
public class TestDemo03 {
    public static void main(String[] args) {
        int[] arr = new int[5];
        for(int i = 0; i < arr.length; i++) {
            arr[i] = -1;
        }

        int index = 0;
        while (index < arr.length) {
            Random random = new Random();
            int num = random.nextInt(6);
            if(!contain(arr, num)) {
                arr[index] = num;
                index++;
            }
        }
        for(int i = 0; i < arr.length; i++) {
            System.out.println("arr: " + arr[i]);
        }
    }
    public static boolean contain(int[] arr, int num) {
        boolean flag = false;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == num) {
                flag = true;
            }
        }
        return flag;
    }
}
