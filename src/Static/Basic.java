package Static;

public class Basic {
    int age;
    String name;
    int salary;
    boolean married;
    static int population;

    public Basic(boolean married, int salary, String name, int age) {
        this.married = married;
        this.salary = salary;
        this.name = name;
        this.age = age;
        Basic.population +=1;
    }
}
