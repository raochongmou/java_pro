package rao;

@SuppressWarnings({"all"})
public class MyStack {
    // 栈容器
    private Object[] elements;
    // 栈帧元素
    private int index;

    public MyStack() {
        this.elements = new Object[10];
        this.index = -1;
    }

    public void push(Object obj) throws MyStackException {
        if(index >= this.elements.length - 1) {
            // System.out.println("压栈失败，栈满了!");
            // return;
            throw new MyStackException("压栈失败，栈满了!");
        }
        this.index++;
        this.elements[this.index] = obj;
        System.out.println("压入的栈元素为:" + obj + "栈帧元素为:" + this.index);
    }

    public void pop() throws MyStackException {
        if(this.index < 0) {
            // System.out.println("弹栈失败，栈已空!");
            // return;
            throw new MyStackException("弹栈失败，栈已空!");
        }
        System.out.println("弹出的栈元素为:" + this.elements[this.index] + "栈帧元素为:" + this.index);
        this.index--;
    }

    public Object[] getElements() {
        return elements;
    }

    public void setElements(Object[] elements) {
        this.elements = elements;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }
}
