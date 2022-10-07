package WEEK5;

class Person4 { }
class Student4 extends Person4 { }
class Researcher4 extends Person4 { }
class Professor4 extends Researcher4 { }

public class InstanceOfEx_5_4 {
    static void print(Person4 p) {
        if(p instanceof Person4)
            System.out.print("Person ");
        if(p instanceof Student4)
            System.out.print("Student ");
        if(p instanceof Researcher4)
            System.out.print("Researcher ");
        if(p instanceof Professor4)
            System.out.print("Professor ");
        System.out.println();
    }
    public static void main(String[] args) {
        System.out.print("new Student() ->\t"); print(new Student4());
        System.out.print("new Researcher() ->\t"); print(new Researcher4());
        System.out.print("new Professor() ->\t"); print(new Professor4());
    }
}
