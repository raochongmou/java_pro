public class OOTest05 {
  public static void main(String[] args) {
    // 创建电脑对象
    Computer c = new Computer();
    c.brand = "iphone";
    c.style = "iphoneX";
    c.color = "red";

    // 创建学生对象
    Student s = new Student();
    s.id = 120;
    s.name = "张三丰";
    s.notePad = c;

    System.out.println(s.notePad.brand);
    System.out.println(s.notePad.style);
    System.out.println(s.notePad.color);
    s.notePad = new Computer();
    System.out.println(s.notePad.brand);
    System.out.println(s.notePad.style);
    System.out.println(s.notePad.color);
  }
}

class Computer {
  String brand;
  String style;
  String color;
}

class Student {
  int id;
  String name;
  Computer notePad;
}