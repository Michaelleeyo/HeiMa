package day12.demo06;

import java.util.ArrayList;

/*
自动装箱和自动拆箱：基本类型的数据和包装类自动相互转换
JDK1.5之后出现的新特性
 */
public class Demo02Integer {
    public static void main(String[] args) {
        //自动装箱
        //Integer in = 1;就相当于Integer in = new Integer(1);
        Integer in = 1;

        //自动开箱:in是包装类，无法直接参与运算，可以自动转换为基本数据类型，再计算
        //in+2;相当于in.valueOf() + 2 = 3;
        //in = in.intValue() + 2 = 3 又是一个自动装箱
        in = in+2;

        //ArrayList集合无法储存基本类型，可以储存包装类
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);//隐含了自动装箱 list.add(new Integer(1);

        int a = list.get(0);//自动拆箱
    }
}
