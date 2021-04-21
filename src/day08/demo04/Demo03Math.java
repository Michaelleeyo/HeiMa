package day08.demo04;
/*
java.util.Math类时数学相关的工具类，里面提供了大量的静态方法，完成与数学运算相关的操作
public static double abs(double num)：取到绝对值
public static double ceil(double num)：向上取整
public static double floor(double num)：向下取整
public static long round(double num)：四舍五入

Math.PI代表近似的圆周率(double)
 */
public class Demo03Math {
    public static void main(String[] args) {
        //去绝对值
        System.out.println(Math.abs(34.123));
        System.out.println(Math.abs(0));
        System.out.println(Math.abs(-12.32));

        //向上取整
        System.out.println(Math.ceil(2.12));
        System.out.println(Math.ceil(23.1));
        System.out.println(Math.ceil(234.56));

        //向下取整
        System.out.println(Math.floor(2.1));
        System.out.println(Math.floor(2.9));
        System.out.println(Math.floor(34.12));

        //四舍五入
        System.out.println(Math.round(12.43));
        System.out.println(Math.round(12.0));
        System.out.println(Math.round(12.9));
    }
}
