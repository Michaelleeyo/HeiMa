package day08.demo02;
/*
String 当中与获取相关的常用方法有：

public int length()：获取字符串当中含有的字符个数，拿到字符串长度。
public String concat(String str)：将当前字符串和参数字符串拼接成返回值新的字符串
public char charAt(int index)：获取指定索引位置的单个字符。(索引从0开始)
public int indexOf(String str)：查找参数字符串在本字符串当中首次出现的索引位置，如果没有返回-1值
 */
public class Demo02StringGet {
    public static void main(String[] args) {
        //获取字符串的长度
        int length = "sdf".length();
        System.out.println("长度"+length);

        //拼接字符串
        String str1 = "Hello";
        String str2 = "World";
        String str3 = str1.concat(str2);
        System.out.println(str3);

        //获取指定索引位置的单个字符
        char c = "Hello".charAt(2);
        System.out.println("在2号索引位置的字符是"+c);

        //查找参数字符串在本来字符串出现第一次索引位置
        //如果没有，返回-1
        String original = "Hello";
        int index = original.indexOf("llo");
        System.out.println("第一次索引值是"+index);//2
        System.out.println("HelloWorld".indexOf("abc"));//-1
    }
}
