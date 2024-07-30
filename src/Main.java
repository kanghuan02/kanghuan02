import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Person s1 = new Student();
        s1.run();
    }
}

class Person {

    protected String name = "dd";
    protected int age = 12;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
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

    public void run(){
        System.out.println("Person run");
    }
}

class Student extends Person {
    private int score;

    public Student() {
    }

    public Student(String name, int age, int score) {
        super(name, age);
        this.score = score;
    }

    public int getScore() {
        return this.score;
    }

    @Override
    public void run() {
        super.run();
        System.out.println("Student run");
    }
}