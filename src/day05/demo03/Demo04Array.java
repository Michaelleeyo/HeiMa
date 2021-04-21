package day05.demo03;

/*
数组变量
 */
public class Demo04Array {
    public static void main(String[] args) {
        int[] array = {1, 2, 43, 45, 5};
        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);
        System.out.println(array[3]);
        System.out.println(array[4]);
        System.out.println("==================");
        //使用循环，次数就是数组长度
        for (int i = 0; i < 5; i++) {
            System.out.println(array[i]);
        }

        int len = array.length;
        for (int i = 0; i < len; i++) {
            System.out.println(array[i]);
        }

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }


    }
}
