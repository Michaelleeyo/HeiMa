package day05.demo03;

/*
反转
 */
public class Demo06ArrayReverse {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6};
        //遍历打印数组本来的样子
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
        }
        /*初始化语句：int min = 0,max = array.length-1
        条件判断：max>min
        步进表达：min++,max--
        循环体：用第三个变量倒手
       */
        for (int min = 0, max = array.length - 1; min < max; min++, max--) {
            int temp = array[min];
            array[min] = array[max];
            array[max] = temp;
        }
        //再次打印数组本来的样子
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
        }
    }
}
