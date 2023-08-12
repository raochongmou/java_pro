package hotel;

@SuppressWarnings({"all"})
public class Room {
    // 房间编号
    private int roomNo;
    // 房间类型 ---总统套房、标准房间、单人房间
    private String roomType;
    // 房间占用状态 ---true->空闲、false->占用
    private Boolean roomStatus;

    public Room() {
    }

    public Room(int roomNo, String roomType, Boolean roomStatus) {
        this.roomNo = roomNo;
        this.roomType = roomType;
        this.roomStatus = roomStatus;
    }

    public int getRoomNo() {
        return roomNo;
    }

    public void setRoomNo(int roomNo) {
        this.roomNo = roomNo;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public Boolean getRoomStatus() {
        return roomStatus;
    }

    public void setRoomStatus(Boolean roomStatus) {
        this.roomStatus = roomStatus;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || !(o instanceof Room)) return false;
        Room room = (Room) o;
        return roomNo == room.roomNo && roomType.equals(room.roomType) && roomStatus.equals(room.roomStatus);
    }

    @Override
    public String toString() {
        return "[" + roomNo + "," + roomType + "," + (roomStatus ? "空闲" : "占用") + "]";
    }
}
