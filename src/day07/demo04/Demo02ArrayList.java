package day07.demo04;

import java.util.ArrayList;

/*
数组的长度不可以发生改变
ArrayList集合可以改变

对于ArrayList来说有<E>
泛型：也就是装在集合中的所有元素，全都是统一的什么类型
注意：发逆行只能是引用类型，不能是基本类型

注意事项：
ArrayList集合来说，直接打印得到的不是地址值，而是内容
如果内容是空的，得到的是空的中括号：[]
 */
public class Demo02ArrayList {
    public static void main(String[] args) {
        //创建了一个ArrayList集合，集合的名称是list，里面装的全都是String字符串类型的数据
        //右侧的健康号可以不写，但是<>本身还是要想的
        ArrayList<String>list = new ArrayList<>();
        System.out.println(list);//[]

        //向集合当中添加一些数据，需要用到add
        list.add("赵");
        System.out.println(list);
    }
}
