package day12.demo02;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
java.text.DateFormat：是日期/时间的抽象类
作用：
格式化(日期-->文本），解析（文本-->日期）
成员方法：
String format(Date date) 按照指定的模式，把Date日期，格式化为符合模式的字符串
Date parse(String source) 把符合模式的字符串，解析为Date日期
DateFormat类是一个抽象类，无法直接创建对象使用，可以使用DateFormat类的子类

java.text.SimpleDateFormat extends DateFormat
构造方法：
SimpleDateFormat(String pattern)
用给定的模式和默认语言环境的日期格式符号构造 SimpleDateFormat
参数：
String pattern 传递指定的模式
模式：区分大小写
y 年/ M 月/d 日/H 时/m 分/s 秒
 */
public class Demo03DateFormat {

    public static void main(String[] args) throws ParseException {
        demo01();
        demo02();
    }

    /*
    使用DateFormat类中的方法format，把日期格式化为文本
    步骤：
    1.创建SimpleDateFormat对象，构造方法中传递指定格式
    2.调用SimpleDateFormat对象中的format方法，把Date日期格式化为符合模式的字符串（文本）
     */
    private static void demo01() {
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒");
        Date date = new Date();
        String a = sdf1.format(date);
        System.out.println(date);
        System.out.println(a);
        System.out.println("==================");
    }

    /*
    使用DateFormat类中的方法parse,把文本解析为日期
    使用步骤：
    1.创建SimpleDateFormat对象，构造方法中传递指定格式
    2.调用SimpleDateFormat对象中的parse方法，把符合模式的字符串（文本）解析为日期
    注意：
    public Date parse(String source) throws ParseException
    parse方法声明了一个异常交ParseException
    如果字符串和构造方法的模式不一样，那么程序就会抛出异常
    调用一个抛出异常的方法就必须处理这个异常，要么throws继续抛出这个异常，要么try catch自己处理
     */
    private static void demo02() throws ParseException {
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒");
        Date date = sdf2.parse("2019年09月25日 10时34分18秒");
        System.out.println(date);
    }
}
