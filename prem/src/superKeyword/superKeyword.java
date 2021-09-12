package superKeyword;

class Person {
    int id;
    String name;

    Person(int id, String name) {
        this.id = id;
        this.name = name;

    }
}

class Emp extends Person {
    float salary;

    Emp(int id, String name, float salary) {
        super(id, name);
        this.salary = salary;
    }

    void display() {
        System.out.println("id:" + id + "name:" + name + "salary" + salary);
    }
}

public class superKeyword {

    public static void main(String[] args) {
        Emp e1 = new Emp(1, "prem", 101001);
        e1.display();
    }

}
