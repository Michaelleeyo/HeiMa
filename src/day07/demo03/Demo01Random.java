package day07.demo03;

import java.util.Random;

/*
Random类随机数字
导包
import java.util.Random;
创建
Random r = new Random();
使用
获取一个随机的数字(范围是int所有范围，正负两种)：nextInt()
获取一个随机的int数字(参数代表了范围，左闭右开）：int num = r.next(3)
实际代表【0，3）
 */
public class Demo01Random {
    public static void main(String[] args) {
        Random r = new Random();
        int num = r.nextInt();
        System.out.println("随机数是："+num);
    }
}
