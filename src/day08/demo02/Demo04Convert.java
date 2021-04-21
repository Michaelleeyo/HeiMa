package day08.demo02;
/*
String 当中与转换相关的常用方法有：
public char[] toCharArray()：将当前字符串拆分为字符数组作为返回值
public byte[] getByte()：获得当前字符串底层的字节数组
public String replace(CharSequence oldString,CharSequence newString):
将所有出现的老字符串替换为新的字符串，返回替换之后的结果新字符串
备注：CharSequence意思是可以接受字符串类型
 */
public class Demo04Convert {
    public static void main(String[] args) {
        //转换成为字符数组
        char[] chars = "Hello".toCharArray();
        System.out.println(chars[0]);
        System.out.println(chars.length);
        //转换成为字节数组
        byte[] bytes = "abc".getBytes();
        for (int i = 0; i < bytes.length; i++) {
            System.out.println(bytes[i]);
        }
        //字符串的内容替换
        String str1 = "How are you?";
        String str2 = str1.replace("o","*");
        System.out.println(str1);
        System.out.println(str2);

    }
}
