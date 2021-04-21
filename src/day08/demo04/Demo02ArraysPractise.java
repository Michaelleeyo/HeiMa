package day08.demo04;

import java.util.Arrays;
import java.util.Scanner;

/*
题目：
请使用Arrays相关的API，将随机一个字符串中的所有字符升序排序，并倒序打印

 思路：
 1.输入一个字符串：Scanner sc = new Scanner(System.in);
 String str = sc.next();
 2.升序排序：先变数组toCharArray()，再用sort进行升序排列
 */
public class Demo02ArraysPractise {
    public static void main(String[] args) {
        System.out.println("请输入任意长度的字符串：");
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        //如何进行升序排列
        char[] chars = str.toCharArray();
        Arrays.sort(chars);
        //倒叙遍历
        /*StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(chars);
        System.out.println(stringBuffer.reverse());*/

        /*StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(chars);
        System.out.println(stringBuilder.reverse());*/

        for (int i = chars.length - 1; i >= 0; i--) {
            System.out.println(chars[i]);
        }
    }
}
