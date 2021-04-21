package day07.demo05;

import java.util.ArrayList;
import java.util.Random;

/*
题目：
用一个大集合存入20个随机数字，然后筛选其中的偶数元素，放到小集合中。
要求使用自定义的方法来实现筛选。
分析：
1.创建一个大集合，用来存储int数字：<Integer>
2.随机数字就用Random,nextInt()
3.循环20此，把随机数字放入大集合：for循环，add方法
4.定义一个方法，用来进行筛选
筛选：根据一个大集合，筛选符合要求的元素，得到小集合。
三要素：
返回值类型：Arraylist小集合（里面元素不确定）
方法名称：getSmallList
参数列表：Arraylist大集合（装着20个随机数字）
5.判断(if)是偶数：num%2 == 0;
6.如果是偶数，就放到小集合中，否则不放
 */
public class Demo04ArrayListReturn {
    public static void main(String[] args) {
        ArrayList<Integer> Biglist = new ArrayList<>();
        Random r = new Random();
        for (int i = 0; i < 20; i++) {
            int num = r.nextInt();
            Biglist.add(num);
        }
        ArrayList<Integer> smalllist = getSmalllist(Biglist);

        System.out.println("偶数共有多少个"+smalllist.size());
        for (int i = 0; i < smalllist.size(); i++) {
            System.out.println(smalllist.get(i));
        }
    }
    //这个方法，接受大集合参数，返回小集合结果
    public static ArrayList<Integer> getSmalllist(ArrayList<Integer> Biglist){
        //创建一个小集合，装偶数结果
        ArrayList<Integer> smalllist = new ArrayList<>();
        for (int i = 0; i < Biglist.size(); i++) {
            int num = Biglist.get(i);
            if(num % 2 == 0){
                smalllist.add(num);
            }
        }
        return smalllist;
    }
}
