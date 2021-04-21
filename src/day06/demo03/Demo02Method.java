package day06.demo03;

/*
面向对象三大特征：封装型，继承性，多态。
封装在Java重点体现：
1.方法就是一种封装
2.关键字private也是一种封装
 */
public class Demo02Method {
    public static void main(String[] args) {
        int[] array = {1, 23, 4, 56, 7};
        int max = getMax(array);
        System.out.println("最大值" + max);
    }

    public static int getMax(int[] array) {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }
}
