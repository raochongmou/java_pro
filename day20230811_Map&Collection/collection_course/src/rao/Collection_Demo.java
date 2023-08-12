package rao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

@SuppressWarnings("all")
public class Collection_Demo {
    public static void main(String[] args) {
        Collection c = new ArrayList();
        c.add(new Book("红楼梦", "曹梦芹", 79.99));
        c.add(new Book("三国演义", "罗贯中", 99.99));
        c.add(new Book("西游记", "施耐庵", 69.99));
        System.out.println("List=" + c);
        Iterator iterator = c.iterator();
        while (iterator.hasNext()) {
            Object next =  iterator.next();
            System.out.println(next);
        }
        System.out.println("---------------");
        // for增强写法
        for(Object obj: c) {
            System.out.println(obj);
        }
        int[] arr = new int[]{1, 2, 3, 4, 5};
        for(int i: arr) {
            System.out.println(i);
        }
    }
}

class Book {
    private String name;
    private String author;
    private double price;

    @Override
    public String toString() {
        return "作者:" + author + "\t" + "书名:" + "《" + name + "》" + "\t" + "价格:" + price;
    }

    public Book(String name, String author, double price) {
        this.name = name;
        this.author = author;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

}
