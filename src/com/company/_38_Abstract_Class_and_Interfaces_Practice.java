package com.company;

abstract class Pen{
    Pen(){
        System.out.println("This is your non other than pen class.😉😉 ");
    }
    abstract void write();
    abstract void refill();
}
class FountainPen extends Pen{
    FountainPen(){
        System.out.println("This is your non other than FountainPen class.😉😉");
    }
    @Override
    void write() {
        System.out.println("Writing");
    }
    @Override
    void refill() {
        System.out.println("Refilling");
    }
    void changeNib(){
        System.out.println("Changing Nib");
    }
}
//---------------------------------------------------------------------------
class Monkey{
    void jump(){
        System.out.println("Jumping");
    }
    void bite(){
        System.out.println("Biting");
    }
}
interface basicAnimal{
    void eat();
    void sleep();
}
class Human extends Monkey implements basicAnimal{
    @Override
    public void eat() {
        System.out.println("Eating");
    }
    @Override
    public void sleep() {
        System.out.println("Sleeping");
    }
}
//--------------------------------------------------------------------------

public class _38_Abstract_Class_and_Interfaces_Practice {
    public static void main(String[] args) {
        FountainPen alpha = new FountainPen();
        alpha.write();
        alpha.refill();
        alpha.changeNib();

        System.out.println("\n");

        Human human = new Human();
        human.eat();
        human.sleep();
        human.jump();
        human.bite();

        System.out.println("\n");

        Monkey monkey = new Human();
        monkey.bite();
        monkey.jump();
//        monkey.eat(); --->error

    }
}
