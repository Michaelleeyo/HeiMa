package day05.demo03;

/*
如果访问数组元素时异常，索引编号并不存在，那么将会发生数组索引越界异常
ArrayIndexOutOfBoundsException
原因：索引编号写错
解决方法：修改为正确编号
 */
public class Demo01ArrayIndex {
    public static void main(String[] args) {
        int[] array = {1, 2, 3};
        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);
        //错误写法
        //并不存在三号数组
        //System.out.println(array[3]);
    }
}
