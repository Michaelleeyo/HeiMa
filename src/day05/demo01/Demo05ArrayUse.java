package day05.demo01;

/*
使用动态初始化时，其中元素会自动拥有一个默认值。规则如下：
如果是整数，默认0；
浮点类型，0.0
字符类型，'\u0000'
布尔类型，false
引用类型，null

注意事项：
静态初始化其实也有默认值过程，只不过系统马上自动把默认值替换为了大括号当中的具体数值。
 */
public class Demo05ArrayUse {
    public static void main(String[] args) {
        //动态初始化一个数组
        int[] array = new int[3];
        System.out.println(array);   //[I@2d98a335
        System.out.println(array[0]);//0
        System.out.println(array[1]);//0
        System.out.println(array[2]);//0
        System.out.println("===========");
        //将123赋值给数组array中的1号元素
        array[1] = 123;
    }
}
