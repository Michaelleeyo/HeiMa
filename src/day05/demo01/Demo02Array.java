package day05.demo01;

/*
静态初始化基本格式：
数据类型[]数组名称 = new 数据类型[]{元素1，元素2，...}

注意事项：
虽然静态初始化没有直接告诉长度，但是大括号里面的元素具体内容，也可以自动推算长度
 */
public class Demo02Array {
    public static void main(String[] args) {
        //直接创建一个数组，里面都是包含int数字
        int[] arrayA = new int[]{2, 3, 54, 12};
        //直接创建一个数组，里面都是字符串
        String[] arrayB = new String[]{"Hello", "World", "JAVA"};
    }
}
