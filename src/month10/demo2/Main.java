package month10.demo2;

public class Main {
    public static void main(String[] args) {
        pingpangAthlete pa=new pingpangAthlete();
        pa.Speak();
        pa.learn();
    }
}
class Person{
    private String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
abstract class Athlete extends Person{
    public Athlete(String name, int age) {
        super(name, age);
    }

    public Athlete() {
        super();
    }
    public abstract void learn();
}
abstract class Coach extends Person{
    public Coach(String name, int age) {
        super(name, age);
    }

    public Coach() {
        super();
    }
    public abstract void teach();
}
interface English{
    public void Speak();
}
class pingpangAthlete extends Athlete implements English{

    @Override
    public void learn() {
        System.out.println("学打乒乓球");
    }

    @Override
    public void Speak() {
        System.out.println("说英语");
    }
}
class lanqiuAthlete extends Athlete{

    @Override
    public void learn() {
        System.out.println("学打篮球");
    }
}
class pingpangCoach extends Coach implements English{

    @Override
    public void teach() {
        System.out.println("教打乒乓球");
    }

    @Override
    public void Speak() {
        System.out.println("说英语");
    }
}
class lanqiugCoach extends Coach{

    @Override
    public void teach() {
        System.out.println("教打篮球");
    }
}