package day11.demo08;

import day11.red.OpenMode;
import day11.red.RedPacketFrame;

/*
场景说明：
红包发出去，所有人都有红包，大家抢完，最后一个红包给群主自己。

要做的事情：
1.设置程序标题
2.设置群主名
3.设置分发策略

红包分发：
1.平分：totalMoney/totalCount,余数放在最后一个红包中
2.随机分：最少一份，最多不超过平均数2倍
 */
public class BootStrap {
    public static void main(String[] args) {
        MyRed myRed = new MyRed("抢红包");
        myRed.setOwnerName("张三");

        //普通红包
        /*OpenMode normal = new NormalMode();
        myRed.setOpenWay(normal);*/

        //手气红包
        OpenMode random = new RandomMode();
        myRed.setOpenWay(random);
    }
}
