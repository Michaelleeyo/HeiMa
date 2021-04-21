package day07.demo03;

import java.util.Random;
import java.util.Scanner;

/*
猜数字
 */
public class Demo04Random {
    public static void main(String[] args) {
        Random r = new Random();
        int b = r.nextInt(100)+1;
        Scanner sc = new Scanner(System.in);


        while (true) {
            System.out.println("请输入一个数字");
            int a = sc.nextInt();
            if (a > b) {
                System.out.println("猜大了");
            } else if (a < b) {
                System.out.println("猜小了");
            } else {
                System.out.println("猜中了");
                break;
            }
        }
        System.out.println("GG");
    }
}
