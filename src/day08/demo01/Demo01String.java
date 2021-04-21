package day08.demo01;
/*
java.lang.String 代表字符串
程序当中所有的双引号字符串，都是String类的对象。

字符串特点：
1.字符串的内容永不可变
2.正是字符串不可改变，所以字符串是可以共享使用的
3.字符串效果是相当于char[]型字符数组，但是底层原理是byte[]字节数组

创建字符串的常见3+1种方法
三种构造方法：
public String():创建一个空白字符串，不包含任何内容
public String(char[] array)：根据字符数组的内容，来创建对应的字符串
public String(byte[] array):根据字节数组的内容，来创建对应的字符串
直接创建：
String str = "Hello";

注意：直接写上双引号，就是字符串对象。
 */
public class Demo01String {
    public static void main(String[] args) {
        //空参构造
        String str1 = new String();//小括号留空
        System.out.println("第一个字符串"+str1);
        //根据字符数组创建字符串
        char[] charArray = {'a','b','c'};
        String str2 = new String(charArray);
        System.out.println("第二个字符串"+str2);
        //根据字节数组
        byte[] byteArray ={2,3,4};
        String str3 = new String(byteArray);
        System.out.println("第三个字符串"+str3);
        //直接创建
        String str4 = "Hello";
        System.out.println("第四个字符串"+str4);
    }
}
