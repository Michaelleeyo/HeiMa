package day09.demo14;

import java.util.ArrayList;

public class Manager extends User{
    public Manager(){
        //super();
    }

    public Manager(String name, int money) {
        super(name, money);
    }

    public ArrayList<Integer> send(int totalMoney,int count){
        //首先需要一个集合，用来存储若干个红包的金额
        ArrayList<Integer> redList = new ArrayList<>();

        //首先看群主多少钱
        int leftMoney = super.getMoney();//看看还剩多少钱
        if(totalMoney > leftMoney){
            System.out.println("余额不足");
            return redList;
        }

        //扣钱，其实就是重新设置余额
        super.setMoney(leftMoney - totalMoney);

        //发红包需要平均分成count份
        int avg = totalMoney / count;
        int mod = totalMoney % count;//余数就是剩下的零头

        //除不开的红包，包在最后一个红包里
        //下面把红包一个个放到集合
        for (int i = 0; i < count-1; i++) {
            redList.add(avg);
        }

        //最后一个红包
        int last = avg + mod;
        redList.add(last);
        return redList;
    }
}
