package com.company;

class Employee{
    int salary;
    String name;
    public int getSalary(){
        return salary;
    }
    public String getName(){
        return name;
    }
    public void setName(String n){
        name = n;
    }
}
class Square{
    int side;
    public void setSide(int n){
        side = n;
    }
    public int peri(){
        return 4*side;
    }
    public int area(){
        return side*side;
    }
}
class Cylinder{
    private float radius;
    private float height;
    public void setRadius(float n){
        radius = n;
    }
    public void setHeight(float n){
        height = n;
    }
    public float volume(){
        return (3.14f*radius*radius*height);
    }
}
class Sphere{
    private float radius;
    public Sphere(float n){
        radius = n;
    }
    public float volume(){
        return (((float) 4 /3))*((float) 22 /7)*radius*radius*radius;
    }
}
public class _35_Java_Class_Practice {
    public static void main(String[] args) {
        Employee a = new Employee();
        a.salary = 25;
        a.setName("Alpha");
        System.out.println(a.getName());
        System.out.println(a.getSalary());

        Square sq = new Square();
        sq.setSide(4);
        System.out.println(sq.area());
        System.out.println(sq.peri());

        Cylinder cy = new Cylinder();
        cy.setRadius(2);
        cy.setHeight(2);
        System.out.println(cy.volume());

        Sphere sp = new Sphere(10);
        System.out.println(sp.volume());
    }
}
