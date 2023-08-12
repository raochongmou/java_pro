public class TestDemo01 {
    public static void main(String[] args) {
        // 二分法查找 前提条件 数组有序
        int dest = 15;
        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17};
        int start = 0;
        int end = arr.length - 1;

        while(start <= end) {
            int middle = (start + end) / 2;
            if(dest == arr[middle]) {
                System.out.println("找到我想要的数字了----" + arr[middle] + "序号为:" + middle);
                break;
            } else if(dest < arr[middle]) {
                end = middle - 1;
            } else {
                start = middle + 1;
            }
        }
        TestDemo01.bubbleSort();
        int[] array1 = new int[]{1, 3, 5, 22, 11, 6, 7, 88, 15, 10, 6, 18, 20};
        TestDemo01.quickSort(array1, 0, array1.length - 1);
        for(int i = 0; i < array1.length - 1; i++) {
            System.out.println("array1:" + array1[i]);
        }
    }
    public static void bubbleSort() {
        // 冒泡排序
        int[] arr1 = new int[]{0, 5, 8, 3, 11, 8, 22, 9, 16};
        for(int i = 0; i < arr1.length - 1; i++) {
            for(int j = 0; j < arr1.length - 1 - i; j++) {
                if(arr1[j] > arr1[j + 1]) {
                    int temp = arr1[j];
                    arr1[j] = arr1[j + 1];
                    arr1[j + 1] = temp;
                }
            }
            // System.out.println("arr1:" + arr1[i]);
        }
    }
    /**
     * 双边指针（挖坑法）
     * 思路：
     * 创建左右指针。
     * 记录左指针数据为分界值 pivot，
     * 此时左指针视为"坑"，里面的数据可以被覆盖。
     *
     * 首先从右向左找出比pivot小的数据，
     * 找到后立即放入左边坑中，当前位置变为新的"坑"，
     * 然后从左向右找出比pivot大的数据，
     * 找到后立即放入右边坑中，当前位置变为新的"坑"，
     *
     * 结束循环后将最开始存储的分界值放入当前的"坑"中，
     * 返回当前"坑"下标（即分界值下标）
     */
    static int doublePointerHole(int[] arr, int startIndex, int endIndex) {
        int pivot = arr[startIndex];
        int leftPoint = startIndex;
        int rightPoint = endIndex;

        while (leftPoint < rightPoint) {
            // 从右向左找出比pivot小的数据，
            while (leftPoint < rightPoint
                    && arr[rightPoint] > pivot) {
                rightPoint--;
            }
            // 找到后立即放入左边坑中，当前位置变为新的"坑"
            if (leftPoint < rightPoint) {
                arr[leftPoint] = arr[rightPoint];
                leftPoint++;
            }
            // 从左向右找出比pivot大的数据
            while (leftPoint < rightPoint
                    && arr[leftPoint] <= pivot) {
                leftPoint++;
            }
            // 找到后立即放入右边坑中，当前位置变为新的"坑"
            if (leftPoint < rightPoint) {
                arr[rightPoint] = arr[leftPoint];
                rightPoint--;
            }
        }
        // 将最开始存储的分界值放入当前的"坑"中
        arr[rightPoint] = pivot;
        return rightPoint;
    }

    /**
     * 入口函数（递归方法），算法的调用从这里开始。
     */
    public static void quickSort(int[] arr, int startIndex, int endIndex) {
        if (startIndex >= endIndex) {
            return;
        }

        // 核心算法部分：分别介绍 双边指针（交换法），双边指针（挖坑法），单边指针
        // int pivotIndex = doublePointerSwap(arr, startIndex, endIndex);
        int pivotIndex = doublePointerHole(arr, startIndex, endIndex);
        // int pivotIndex = singlePointer(arr, startIndex, endIndex);

        // 用分界值下标区分出左右区间，进行递归调用
        quickSort(arr, startIndex, pivotIndex - 1);
        quickSort(arr, pivotIndex + 1, endIndex);
    }
}
