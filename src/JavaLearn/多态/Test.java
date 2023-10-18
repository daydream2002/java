package JavaLearn.多态;

public class Test {
    public static void main(String[] args) {
        Person p=new Person(35,"饲养员");
        Cat cat=new Cat(5,"黑色");
        Dog dog=new Dog(6,"白色");
        p.keepPet(cat,"粮食");
        p.keepPet(dog,"粮食");
    }
}
class Person{
   private int age;
   private String name;
   public void keepPet(Animal animal,String something){
       if (animal instanceof Cat c){
           System.out.println("年龄为"+age+"的"+name+"养了"+c.getColor());
           c.eat(something);

       }else if(animal instanceof Dog d) {
           System.out.println("喂狗，吃"+something);
           d.eat(something);
       }else {
           System.out.println("不存在这种动物");
       }
   }

    public Person() {
    }

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
class Animal{
   private int age;
   private String color;
    public void eat(String something){
        System.out.println("吃"+something);
    }

    public Animal(int age, String color) {
        this.age = age;
        this.color = color;
    }

    public Animal() {
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
class Dog extends Animal{
    public void lookHome(){
        System.out.println("看家");
    }

    public Dog(int age, String color) {
        super(age, color);
    }

    public Dog() {
    }
}
class Cat extends Animal{
    public void catchMouse(){
        System.out.println("逮老鼠");
    }

    public Cat(int age, String color) {
        super(age, color);
    }

    public Cat() {
    }
}