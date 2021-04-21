package day07.demo01;
import java.util.Scanner;
/*
输入三个数字求出最大值
 */
public class Demo03ScannerMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个数字");
        int a = sc.nextInt();
        System.out.println("请输入第二个数字");
        int b = sc.nextInt();
        System.out.println("请输入第三个数字");
        int c = sc.nextInt();
        //三个形成数组
        /*int[] array = {a,b,c};
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if(max < array[i]) {
                max = array[i];
            }
        }*/
        //两个比大小，再和第三个比较
        int temp = a > b ? a : b;
        int max = temp > c ? temp :c;
        System.out.println("最大值是："+max);
    }
}
