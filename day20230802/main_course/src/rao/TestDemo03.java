package rao;

@SuppressWarnings({"all"})
public class TestDemo03 {
    public static void main(String[] args) {
        int[] src = {1, 2, 3, 4};
        int[] dest = new int[20];
        System.arraycopy(src, 0, dest, 0, src.length);
        for(int i = 0; i < dest.length; i++) {
            System.out.println(dest[i]);
        }
        // 三维数组
        int[][][] arr = {
            {
                {
                    400, 500
                }
            },
            {
                {
                    700, 900
                }
            }
        };
        for(int i = 0; i < arr[0][0].length; i++) {
            System.out.println(arr[0][0][i]);
        }
    }
}
