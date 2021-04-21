package day12.demo02;
/*
java.util.Date:表示日期和时间的类
类 Date 表示特定的瞬间，精确到毫秒
毫秒值的作用：可以对时间和日期进行计算

时间原点：1970-1-1 00：00：00
 */
public class Dem01Date {

    public static void main(String[] args) {
        //获取当前系统时间到时间原点经历了多少毫秒
        System.out.println(System.currentTimeMillis());
    }
}
