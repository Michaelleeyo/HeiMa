package day12.demo06;
/*
基本类型和字符串类型之间相互转换：
基本类型-->字符串(String)
1.基本类型+"" 最简单方法
2.包装类的静态方法：toString(参数),不是Object类中的toString()重载
static String toString(int i)返回一个表示指定整数的String对象
3.String类的静态方法valueOf(参数)

字符串-->基本类型
1.使用包装类的静态方法parseXXX("字符串")
Integer类：static int parseInt(String s)
Double类：static double parseDouble(String s)
 */
public class Demo03Integer {
    public static void main(String[] args) {

        //基本类型-->字符串
        int i1 = 100;
        String s1 = 1+"";
        System.out.println(s1+200);//1200

        String s2 = Integer.toString(100);
        System.out.println(s2+100);//100100

        String s3 = String.valueOf(1);
        System.out.println(s3+100);//1100

        //字符串-->基本类型
        int i = Integer.parseInt(s1);
        System.out.println(i-10);//-9

        double b = Double.parseDouble(s1);
        System.out.println(i-10.1);//-9.1

        /*int a = Integer.parseInt("a");//NumberFormatException //必须是数值类型，字符串不行
        System.out.println(a);*/
    }
}
