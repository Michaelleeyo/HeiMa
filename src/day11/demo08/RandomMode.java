package day11.demo08;

import day11.red.OpenMode;

import java.util.ArrayList;
import java.util.Random;

public class RandomMode implements OpenMode {
    @Override
    public ArrayList<Integer> divide(int totalMoney, int totalCount) {

        ArrayList<Integer> list = new ArrayList<>();
        //随机分配，最少一分钱，最多不超过剩下金额平均数2倍
        //第一次发红包随机范围0.01-3.34
        //此时再发两个红包
        //再发红包范围0.01-3.34元

        //范围公式：1+random.nextInt(leftMoney/LeftMoney*2);
        Random random = new Random();

        int leftMoney = totalMoney;
        int leftCount = totalCount;

        //随机发n-1个，最后一个不用随机
        for(int i = 0;i < totalCount - 1;i++){
            int money = random.nextInt(leftMoney/leftCount*2)+1;
            list.add(money);//将一个随机红包放入集合
            leftMoney -= money;//剩下的金额越发越少
            leftCount--;//剩下还应该再发的红包个数，递减
        }

        //最后一个
        list.add(leftMoney);

        return null;
    }
}
