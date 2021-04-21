package day05.demo03;

/*
数组一旦创建，程序运行期间，长度不可改变
 */
public class Demo03ArrayLength {
    public static void main(String[] args) {
        int[] arrayA = new int[3];
        int[] arrayB = {1, 2, 3, 4, 5};
        int len = arrayB.length;
        System.out.println("arrayB数组的长度是：" + len);

        int[] arrayC = new int[3];
        System.out.println(arrayC.length);
        arrayC = new int[5];
        System.out.println(arrayC.length);
    }
}
