package day12.demo03;

import java.util.Calendar;

/*
Calendar类的常用成员方法:
public int get(int field)：返回给定日历字段的值。
public void set(int field, int value)：将给定的日历字段设置为给定值。
public abstract void add(int field, int amount)：根据日历的规则，为给定的日历字段添加或减去指定的时间量。
public Date getTime()：返回一个表示此Calendar时间值（从历元到现在的毫秒偏移量）的Date对象。
成员方法的参数:
int field:日历类的字段,可以使用Calendar类的静态成员变量获取
public static final int YEAR = 1;	年
public static final int MONTH = 2;	月
public static final int DATE = 5;	月中的某一天
public static final int DAY_OF_MONTH = 5;月中的某一天
public static final int HOUR = 10; 		时
public static final int MINUTE = 12; 	分
public static final int SECOND = 13;	秒
 */
public class Demo02Calendar {
    public static void main(String[] args) {
        demo01();
        demo02();
        demo03();
        demo04();
    }

    /*
    public Date getTime()：返回一个表示此Calendar时间值（从历元到现在的毫秒偏移量）的Date对象。
    把日历对象转换为日期对象
     */
    private static void demo04() {
        Calendar d = Calendar.getInstance();

        System.out.println(d.getTime());
    }

    /*
    public abstract void add(int field,int amount)：根据日历的规则，为给定的日历字段添加或减去指定的时间量
    把只当的字段增加/减少指定的值
    参数：
    int field：传递指定的日历字段
    int amount：增加减少指定的值，正数增加；负数减少
     */
    private static void demo03() {
        Calendar c = Calendar.getInstance();

        c.add(Calendar.YEAR,2);
        c.add(Calendar.MONTH,-3);

        int year = c.get(Calendar.YEAR);
        System.out.println(year);
        int month = c.get(Calendar.MONTH);
        System.out.println(month);
        int date = c.get(Calendar.DATE);
        System.out.println(date);
    }

   /*
    public void set(int field, int value)：将给定的日历字段设置为给定值。
    参数：
    int field：传递指定日历字段
    int value：给指定字段设置的值
    */
    private static void demo02() {
        Calendar b = Calendar.getInstance();

        b.set(Calendar.YEAR,9999);
        b.set(Calendar.MONTH,12);
        b.set(Calendar.DATE,21);
        //同时设置年月日，用set的重载方法
        b.set(8888,8,8);

        int year = b.get(Calendar.YEAR);
        System.out.println(year);
        int month = b.get(Calendar.MONTH);
        System.out.println(month);
        int date = b.get(Calendar.DATE);
        System.out.println(date);
        System.out.println("========================");

    }

    /*
    public int get(int field)：返回给定日历字段的值
    参数：传递指定的日历字段
    返回值：日历字段代表的具体的值
    */
    private static void demo01() {

        //使用getInstanceOf()方法获取Calendar对象
        Calendar a = Calendar.getInstance();
        int year = a.get(Calendar.YEAR);
        System.out.println(year);

        int month = a.get(Calendar.MONTH);
        System.out.println(month);

        int date = a.get(Calendar.DAY_OF_MONTH);
        //int date = c.get(Calendar.DATE);
        System.out.println(date);
    }
}
