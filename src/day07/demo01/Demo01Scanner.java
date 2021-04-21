package day07.demo01;
import java.util.Scanner;
/*
引用类型的一般使用步骤
1.导包
import 包路径.类名称;
如果需要使用的目标类和当前类位于同一个包下，则可以省略导包语句不写
只有java.lang包下的内容不需要导包，其他的包都需要import语句
2.创建
类名称 对象名 = new 类名称();
3.使用
对象名.成员方法名()；

获取键盘当中的一个int数字:int num = sc.nextInt();
字符串：String str = sc.next();
 */
public class Demo01Scanner {
    public static void main(String[] args) {
        //System.in代表从键盘进行输入
        Scanner SC = new Scanner(System.in);
        int num = SC.nextInt();
        System.out.println("输入的Int数字是："+num);
        String str = SC.next();
        System.out.println("输入字符是"+str);
    }
}
