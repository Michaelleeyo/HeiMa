package day08.demo01;
/*
字符串常量池：程序当中直接写上的双引号字符串，就是在字符串常量池中。

对于基本类型哪个来说，==就是数值的比较
对于引用类型来说，==就是地址值的比较
双引号直接写的字符串在常量池当中，new的不在池当中
 */
public class Demo02StringPool {
    public static void main(String[] args) {
        String str1 = "abc";
        String str2 = "abc";

        char[] charArray = {'a','b','c'};
        String str3 = new String(charArray);

        System.out.println(str1 == str2);//true
        System.out.println(str1 == str3);//false
        System.out.println(str2 == str3);//false
    }
}
