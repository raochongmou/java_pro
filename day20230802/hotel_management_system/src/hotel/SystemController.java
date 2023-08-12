package hotel;

import java.util.Scanner;

public class SystemController {
    public static void main(String[] args) {
        Hotel h = new Hotel();
        System.out.println("欢迎来到酒店管理系统!");
        System.out.println("订单功能菜单: [1]查看所有房间信息、[2]预订房间、[3]退订房间、[4]退出系统");
        while (true) {
            System.out.print("请输入订单功能菜单编号:");
            Scanner sc = new Scanner(System.in);
            int no = sc.nextInt();
            if(no == 1) {
                h.viewRoomInfo();
            } else if(no == 2) {
                System.out.print("请输入您要预订的房间号:");
                Scanner sc2 = new Scanner(System.in);
                int roomNo = sc2.nextInt();
                h.orderRoom(roomNo);
            } else if(no == 3) {
                System.out.print("请输入您要退订的房间号:");
                Scanner sc3 = new Scanner(System.in);
                int roomNo = sc3.nextInt();
                h.exitRoom(roomNo);
            } else if(no == 4) {
                System.out.println("欢迎下次再来!");
                // System.exit(0);
                return;
            } else {
                System.out.println("您输入的订单功能菜单编号不存在, 请重试!");
            }
        }
    }
}
