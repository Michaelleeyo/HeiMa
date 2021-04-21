package day12.demo05;
/*
StringBuilder 常用方法：
    public StringBuilder append(...)：添加任意类型数据的字符串形式，并返回当前对象自身。
 */
public class Demo02StringBuilder {
    public static void main(String[] args) {
        //创建
        StringBuilder bu = new StringBuilder();
        //使用append添加数据
        //append返回的时this,调用方法的对象bu
        /*StringBuilder bu2 = bu.append("abc");//把bu的地址赋值给bu2
        System.out.println(bu);
        System.out.println(bu2);
        System.out.println(bu == bu2);*/

        //使用append方法无需接受返回值
        /*bu.append("abc");
        bu.append(1);
        bu.append(true);
        bu.append(8.8);
        bu.append('中');
        System.out.println(bu);*/

        /*
        链式编程：方法返回值是一个对象，可以继续调用方法
         */
        System.out.println("abc".toUpperCase().toLowerCase().toUpperCase().toLowerCase());
        System.out.println(bu.append("abc").append(1).append(true).append(8.8).append('中'));

    }
}
