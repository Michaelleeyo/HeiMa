package day07.demo02;

import java.util.Scanner;

public class Demo02Anonymous {
    public static void main(String[] args) {
        //普通使用方式
        /*Scanner sc = new Scanner(System.in);
        int c = sc.nextInt();*/

        //匿名对象的方式
        //int num = new Scanner(System.in).nextInt();
        //System.out.println("输入的是："+num);

        //使用匿名对象来传参
        //methodParam(new Scanner(System.in));

        Scanner sc = methodReturn();
        int num = sc.nextInt();
        System.out.println("输入的是："+num);
    }
    //使用一般写法，传入参数
    public static void methodParam(Scanner sc){
        int num = sc.nextInt();
        System.out.println("输入的是："+num);
    }

    public static Scanner methodReturn(){
        //Scanner sc = new Scanner(System.in);
        //return sc;
        return new Scanner(System.in);
    }
}
