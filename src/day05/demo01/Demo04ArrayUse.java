package day05.demo01;

/*
访问数组元素的格式：数组名称[索引值]
索引值：就是一个int数字，代表数组当中元素的编号。
【注意】索引值从0开始，一直到“数组长度-1”为止
 */
public class Demo04ArrayUse {
    public static void main(String[] args) {
        //静态初始化的省略格式
        int[] array = {1, 2, 3};
        System.out.println(array);//[I@75828a0f
        System.out.println(array[0]);//1
        System.out.println(array[1]);//2
        System.out.println(array[2]);//3


        //也可以将数组中一个数值赋值给变量
        int num = array[1];
        System.out.println(num);
    }
}
