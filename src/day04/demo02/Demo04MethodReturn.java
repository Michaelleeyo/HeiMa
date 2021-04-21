package day04.demo02;

/*
题目要求：定义一个方法，用来求出俩个数字之和。（你帮我算，算完把结果告诉我）
题目变形：定义一个方法，用来打印两个数字之和。（你来计算，算完自己显示结果，不用告诉我）

注意：
对于有返回值的方法：可以使用单独调用，打印调用或者赋值调用
但是对于无返回值的方法，只能使用单独调用，不能使用打印调用或者赋值调用
 */
public class Demo04MethodReturn {
    public static void main(String[] args) {
        int num = getSum(10, 20);
        System.out.println("返回值是" + num);
        System.out.println("============");
    }

    //我是一个方法，我负责两个数字相加
    //我没有返回值，谁调用我，我就把结果告诉谁
    public static int getSum(int a, int b) {
        int result = a + b;
        return result;
    }

    //我是一个方法，我负责两个数字相加
    //我没有返回值，不会把结果告诉任何人，而是我自己进行打印输出。
    public static void printSum(int a, int b) {
        int result = a + b;
        System.out.println("结果是：" + result);
    }
}
