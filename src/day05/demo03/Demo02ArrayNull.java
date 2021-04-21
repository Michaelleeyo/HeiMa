package day05.demo03;

/*
所有的引用变量，都可以赋值为NULL值，但是表示其中什么都没有

数组必须进行new初始化才能使用其中的元素
如果只是赋值一个Null，没有new创建，将会发生空指针异常：
NullPointerException
原因：忘了new
解决：补上New
 */
public class Demo02ArrayNull {
    public static void main(String[] args) {
        int[] array;
        array = new int[2];
        System.out.println(array[0]);
    }
}
