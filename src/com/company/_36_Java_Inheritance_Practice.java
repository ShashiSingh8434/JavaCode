package com.company;
class Rectangle{
    public int lenght;
    public int breadth;
    Rectangle(int l,int b){
        this.lenght = l;
        this.breadth = b;
    }
    void area(){
        System.out.println("Area of Rectangle: "+ this.lenght*this.breadth);
    }
}
class Rhombus extends Rectangle{
    public int side;
    Rhombus(int l) {
        super(l, l);
        this.side = l;
    }
    @Override
    void area(){
        System.out.println("Area of Rhombus: "+ this.side*this.side);
    }
}
public class _36_Java_Inheritance_Practice {
    public static void main(String[] args) {
        Rectangle a = new Rectangle(10,4);
        a.area();
    }
}
