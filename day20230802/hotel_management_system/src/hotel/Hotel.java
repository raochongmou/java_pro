package hotel;

import java.util.Arrays;

@SuppressWarnings({"all"})
public class Hotel {
    private Room[][] room;

    public Hotel(Room[][] room) {
        this.room = room;
    }

    public Hotel() {
        this.room = new Room[3][10];
        for(int i = 0; i < this.room.length; i++) {
            for (int j = 0; j < this.room[i].length; j++) {
                if(i == 0) {
                    this.room[i][j] = new Room((i + 1) * 100 + j + 1, "标准房间", true);
                } else if(i == 1) {
                    this.room[i][j] = new Room((i + 1) * 100 + j + 1, "单人房间", true);
                } else if(i == 2) {
                    this.room[i][j] = new Room((i + 1) * 100 + j + 1, "总统套房", true);
                }
            }
        }
    }

    // 查看所有房间信息
    public void viewRoomInfo() {
        for(int i = 0; i < this.room.length; i++) {
            for(int j = 0; j < this.room[i].length; j++) {
                if(j == this.room[i].length - 1) {
                    // 默认执行Room类中的toString方法
                    System.out.print(this.room[i][j]);
                } else {
                    System.out.print(this.room[i][j] + "、");
                }
            }
            System.out.println("");
        }
    }

    // 订房间 例如101
    public void orderRoom(int roomNo) {
        this.room[roomNo/100 - 1][roomNo%100 - 1].setRoomStatus(false);
        System.out.println("房间号:" + roomNo + "预订成功!");
    }

    // 退房间 例如101
    public void exitRoom(int roomNo) {
        this.room[roomNo/100 - 1][roomNo%100 - 1].setRoomStatus(true);
        System.out.println("房间号:" + roomNo + "退订成功!");
    }

    public Room[][] getRoom() {
        return room;
    }

    public void setRoom(Room[][] room) {
        this.room = room;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || !(o instanceof Hotel)) return false;
        Hotel hotel = (Hotel) o;
        return this.room.equals(hotel.room);
    }
}
