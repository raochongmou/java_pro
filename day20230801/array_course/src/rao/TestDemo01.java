package rao;

public class TestDemo01 {
    public static void main(String[] args) {
        // 数组的静态定义方式:
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println("数组arr第一个元素是:" + arr[0]);
        System.out.println("数组arr最后一个元素是:" + arr[arr.length - 1]);
        // 修改数组arr第一个元素
        arr[0] = 55;
        arr[arr.length - 1] = 77;
        System.out.println("数组arr第一个元素是:" + arr[0]);
        System.out.println("数组arr最后一个元素是:" + arr[arr.length - 1]);
        // Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 5
        // 	at rao.TestDemo01.main(TestDemo01.java:14)
        // System.out.println("数组arr数组越界情况测试:" + arr[arr.length]);
        // 数组的动态定义方式:
        int[] arr2 = new int[]{1, 3, 5, 7, 9};
        for(int i = 0; i < arr2.length; i++) {
            System.out.println("数组arr2第" + i + "个元素为:" + arr2[i]);
        }
        Object[] arr3 = new Object[5];
        for(int i = 0; i < arr3.length; i++) {
            System.out.println(arr3[i]);
        }

        String[] arr4 = new String[]{"aaa", "bbb", "ccc"};
        for (int i = 0; i < arr4.length; i++) {
            System.out.println(arr4[i]);
        }
        // 对象静态初始化方式
        Object[] obj = {new Object(), new Object(), new Object()};
        for(int i = 0; i < obj.length; i++) {
            System.out.println(obj[i]);
        }
        String[] str = {"aaa1", "bbb1", "ccc1"};
        for (int i = 0; i < str.length; i++) {
            System.out.println(str[i]);
        }
        for(int i = 0; i < args.length; i++) {
            System.out.println("args:" + args[i]);
        }
    }
}
