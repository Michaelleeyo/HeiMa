package day12.demo02;

import java.util.Date;

public class Demo02Date {

    public static void main(String[] args) {
        demo01();
        demo02();
        demo03();
    }

    public static void demo01(){//获取当前系统的时间和日期
        Date date = new Date();
        System.out.println(date);
        System.out.println("======================");
    }
/*
Date类的带参数构造方法
Date(long date)：传递毫秒值，把毫秒值转为Date日期
 */
    public static void demo02(){
        Date date = new Date(0L);
        System.out.println(date);
        System.out.println("========================");
    }
/*
long getTime()把日期转换为毫秒值，相当于System.currentTimeMillis()
 */
    private static void demo03() {
        Date date = new Date();
        long time = date.getTime();
        System.out.println(time);
    }
}
