package day07.demo01;
import java.util.Scanner;
/*
题目：键盘输入两个int数字，并且求出和值
 */
public class Demo02ScannerSum {
    public static void main(String[] args) {
        System.out.println("请输入两个数字");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int result = a+b;
        System.out.println("结果是："+result);
    }
}
