package day05.demo03;

public class Demo5ArrayMax {
    public static void main(String[] args) {
        int[] array = {1, 32, 123, 243, 3, 24};
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println("最大值：" + max);
    }
}
