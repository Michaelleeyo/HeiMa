package day04.demo04;

/*
在调用语句时候，println方法其实就是进行了多种数据类型的重载形式
 */
public class Demo04MethodOverloadPrint {
    public static void main(String[] args) {
        System.out.println(100);
    }

    public static void myPrint(byte num) {
        System.out.println(num);
    }

    public static void myPrint(short num) {
        System.out.println(num);
    }

    public static void myPrint(int num) {
        System.out.println(num);
    }

    public static void myPrint(long num) {
        System.out.println(num);
    }

    public static void myPrint(float num) {
        System.out.println(num);
    }

    public static void myPrint(double num) {
        System.out.println(num);
    }

    public static void myPrint(boolean is) {
        System.out.println(is);
    }

    public static void myPrint(char zifu) {
        System.out.println(zifu);
    }

    public static void myPrint(String str) {
        System.out.println(str);
    }
}
